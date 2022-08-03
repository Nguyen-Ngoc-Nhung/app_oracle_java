/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import JdbcOracleConnection.conn;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import main.SharedData;
import main.frmDangNhap;
import pojo.NhanVien_POJO;

/**
 *
 * @author Admin
 */
public class NhanVien_DAO {
    
     public static ArrayList<NhanVien_POJO> layDanhSachNhanVien() {
        
        ArrayList<NhanVien_POJO> ds = new ArrayList<NhanVien_POJO>();
        String strUsername = "";
        String strPassword = "";
        if(SharedData.nguoi.getStrName().equals("sys")==true)
        {
        strUsername = SharedData.nguoi.getStrName()+ " as sysdba";
        strPassword = SharedData.nguoi.getStrPass();
        }
        else
        {
        strUsername = SharedData.nguoi.getStrName();
        strPassword = SharedData.nguoi.getStrPass();
        }
        try {
            String sql = "SELECT MANV , TENNV , DIACHI , NAMSINH , GIOITINH  FROM NHUNG.NHANVIEN";
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                NhanVien_POJO nhanvien = new NhanVien_POJO();
                nhanvien.setMaNV(rs.getString("MANV"));
                nhanvien.setTenNV(rs.getString("TENNV"));
                nhanvien.setDiaChi(rs.getString("DIACHI"));
                nhanvien.setNamSinh(rs.getInt("NAMSINH"));
                nhanvien.setGioiTinh(rs.getString("GIOITINH"));
                ds.add(nhanvien);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return ds;
    }
     public static boolean themNhanVien(NhanVien_POJO nv) throws SQLException
    {
        
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.themnv(?,?,?,?,?)}");  
        stmt.setString(1,nv.getMaNV());  
        stmt.setString(2,nv.getTenNV()); 
        stmt.setString(3,nv.getDiaChi()); 
        stmt.setInt(4,nv.getNamSinh()); 
        stmt.setString(5,nv.getGioiTinh()); 
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
     
     public static boolean updateNV(NhanVien_POJO nv) throws SQLException
    {
        
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.updNV(?,?,?,?,?)}");  
        stmt.setString(1,nv.getMaNV());  
        stmt.setString(2,nv.getTenNV()); 
        stmt.setString(3,nv.getDiaChi()); 
        stmt.setInt(4,nv.getNamSinh()); 
        stmt.setString(5,nv.getGioiTinh()); 
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
     public static boolean xoaNhanVien(String mnv) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{call sys.xoaNV(?)}"); 
        stmt.setString(1,mnv);
        int n = stmt.executeUpdate();
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
     
}
