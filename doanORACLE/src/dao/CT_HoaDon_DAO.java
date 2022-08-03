/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import JdbcOracleConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.frmDangNhap;
import pojo.CT_HoaDon_POJO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class CT_HoaDon_DAO {
    public static ArrayList<CT_HoaDon_POJO> layDanhSachCTHoaDon() {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        ArrayList<CT_HoaDon_POJO> ds = new ArrayList<CT_HoaDon_POJO>();
        try {
            String sql = "SELECT * FROM NHUNG.CTHOADON";
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                CT_HoaDon_POJO cthd = new CT_HoaDon_POJO();
                cthd.setMaHD(rs.getString("MAHD"));
                cthd.setMaSP(rs.getString("MASP"));
                cthd.setSoLuong(rs.getInt("SOLUONG"));
                cthd.setGiaBan(rs.getInt("GIABAN"));
                cthd.setThanhToan(rs.getInt("THANHTOAN"));
                ds.add(cthd);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
     public static boolean themCTHOADON(CT_HoaDon_POJO hd)
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        boolean kq = false;
        String sql = String.format("Insert into NHUNG.CTHOADON Values('%s','%s',%d,%d,%d)"
                , hd.getMaHD(),hd.getMaSP(),hd.getSoLuong(),hd.getGiaBan(),hd.getThanhToan());
        
        conn provider = new conn();
            provider.open(strUsername,strPassword);
        int n = provider.executeUpdate(sql);
        if(n==1)
        {
            kq = true;
        }
        provider.close();
        return kq;
    }
     
     public static boolean tran_slt(CT_HoaDon_POJO hd) throws SQLException
     {
            String strUsername = frmDangNhap.strTenDangNhap;
            String strPassword = frmDangNhap.strMatKhau;
            conn provider = new conn();
            provider.open(strUsername,strPassword);
            Connection con = provider.GetConnect();
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            boolean kq = false;
            try {
                String sql = String.format("Insert into NHUNG.CTHOADON Values('%s','%s',%d,%d,%d)"
                , hd.getMaHD(),hd.getMaSP(),hd.getSoLuong(),hd.getGiaBan(),hd.getThanhToan());
                stmt.executeUpdate(sql);
                stmt.executeUpdate("update NHUNG.SANPHAM SET SLTON = SLTON - "+hd.getSoLuong()+"Where MASP = '"+hd.getMaSP()+"'");
                con.commit();
                kq=true;
            } catch (Exception e) {
                e.printStackTrace();
                con.rollback();
                kq=false;
            }
                con.close();
                return kq;
        }  
     public static int ktraslt(String masp) 
     {
            String strUsername = frmDangNhap.strTenDangNhap;
            String strPassword = frmDangNhap.strMatKhau;
            int slt=0;
            try {
            String sql = "SELECT * FROM NHUNG.SANPHAM WHERE MASP = '"+masp+"'";
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
            slt = rs.getInt("SLTON");
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return slt;
        }  
     
     
}
