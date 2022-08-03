/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import JdbcOracleConnection.conn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import main.frmDangNhap;
import pojo.User_POJO;

/**
 *
 * @author Admin
 */

public class User_DAO {
    
    
    public static ArrayList<User_POJO> layDanhSachUser() {
        ArrayList<User_POJO> ds = new ArrayList<User_POJO>();
        try {
            String sql = "SELECT USERNAME,PASSWORD_VERSIONS FROM DBA_USERS where username='ORCL_NHUNG'";
            conn helper = new conn();
            helper.open("sys as sysdba","sys");
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                User_POJO cthd = new User_POJO();
                cthd.setStrName(rs.getString("USERNAME"));
                cthd.setStrPass(rs.getString("PASSWORD_VERSIONS"));
                ds.add(cthd);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    public static ArrayList<User_POJO> layDanhSachQuota() {
        ArrayList<User_POJO> ds = new ArrayList<User_POJO>();
        try {
            String sql = "select tablespace_name , max_bytes from dba_ts_quotas where username='ORCL_NHUNG'";
            conn helper = new conn();
            helper.open("sys as sysdba","sys");
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                User_POJO cthd = new User_POJO();
                cthd.setStrTableSpace(rs.getString("tablespace_name"));
                cthd.setStrQuota(rs.getString("max_bytes"));
                ds.add(cthd);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
        
    }
//    public static boolean themUser(User_POJO hd) {
//        boolean kq = false;
//        String sql = String.format("Insert into HoaDon(HD_ID , Ngay, NhanVien,TenKHachHang,GhiChu) Values('%d',N'%s',N'%s',N'%s',N'%s');",
//                 hd.getiHD_ID(), hd.getdNgay(), hd.getStrNhanVien(), hd.getStrTenKhachHang(), hd.getStrGhiChu());
//        
//        DataProvider provider = new DataProvider();
//        provider.open();
//        int n = provider.executeUpdate(sql);
//        provider.close();
//        
//        if (n == 1) {
//            kq = true;
//        }
//        
//        return kq;
//    }
    private Connection conn;
    public User_POJO check (String strUser,String strPassWord){
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");  
          String dbURL = "jdbc:oracle:thin:@localhost:1521:QLST" ;
          conn = DriverManager.getConnection(dbURL,strUser,strPassWord);
          if(conn!=null)
          {
             if(strUser.equals("sys as sysdba"))
             {
             User_POJO u = new User_POJO();
             u.setStrName("sys");
             u.setStrPass(strPassWord); 
             return u;
             }
             else
             {
             User_POJO u = new User_POJO();
             u.setStrName(strUser);
             u.setStrPass(strPassWord);
             return u;
             }
             
          }
       }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    ResultSet rs = null;
  public User_POJO check1(String username) {
      
      String dbURL = "jdbc:oracle:thin:@localhost:1521:QLST" ;
      String stru = "sys as sysdba";
      String strp = "sys";
          
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection c = DriverManager.getConnection(dbURL,stru,strp);
            String sql = String.format(" SELECT TO_CHAR(LAST_LOGIN,'DD-MM-YYYY HH24:MI:SS') FROM DBA_USERS WHERE USERNAME = '"+"%s"+"' ",username);
            PreparedStatement preparedstatement=c.prepareStatement(sql);
            rs = preparedstatement.executeQuery(sql);
            while(rs.next()) {
                User_POJO u = new User_POJO();
                u.setLast(rs.getString("TO_CHAR(LAST_LOGIN,'DD-MM-YYYYHH24:MI:SS')"));
                return u;
            }
           c.close();
        } 
         catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
  public static boolean Createuser (User_POJO u) throws SQLException{
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.createUser(?,?,?,?,?)}");  
        stmt.setString(1,u.getStrName());  
        stmt.setString(2,u.getStrPass()); 
        stmt.setString(3,u.getStrTableSpace()); 
        stmt.setString(4,u.getStrQuota()); 
        stmt.setString(5,u.getProfile()); 
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
  }
  public static boolean ganquyendt(String quyen,String bang,String user) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.ganquyendt(?,?,?)}"); 
        stmt.setString(1,quyen);
        stmt.setString(2,bang);
        stmt.setString(3,user);
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean thuhoiquyendt(String quyen,String bang,String user) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.thuhoiquyendt(?,?,?)}"); 
        stmt.setString(1,quyen);
        stmt.setString(2,bang);
        stmt.setString(3,user);
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean ganquyenht(String quyen,String user) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.ganquyenht(?,?)}"); 
        stmt.setString(1,quyen);
        stmt.setString(2,user);
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean thuhoiquyenht(String quyen,String user) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.thuhoiquyenht(?,?)}"); 
        stmt.setString(1,quyen);
        stmt.setString(2,user);
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean killses(String sid,String serial) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.killsession(?,?)}"); 
        stmt.setString(1,sid);
        stmt.setString(2,serial);
        stmt.executeUpdate();
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
}
