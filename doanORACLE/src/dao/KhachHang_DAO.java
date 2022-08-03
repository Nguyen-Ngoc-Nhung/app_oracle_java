/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import JdbcOracleConnection.conn;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.SharedData;
import main.frmDangNhap;
import pojo.KhachHang_POJO;

/**
 *
 * @author Admin
 */
public class KhachHang_DAO {
     public static ArrayList<KhachHang_POJO> layDanhSachKhachHang() {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        ArrayList<KhachHang_POJO> ds = new ArrayList<KhachHang_POJO>();
        try {
            String sql = "SELECT MAKH , TENKH , DIACHI , DIENTHOAI , NAMSINH , GIOITINH FROM NHUNG.KHACHHANG";
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                KhachHang_POJO khachhang = new KhachHang_POJO();
                khachhang.setMaKH(rs.getString("MAKH"));
                khachhang.setTenKH(rs.getString("TENKH"));
                khachhang.setDiaChi(rs.getString("DIACHI"));
                khachhang.setDienThoai(rs.getString("DIENTHOAI"));
                khachhang.setNamSinh(rs.getInt("NAMSINH"));
                khachhang.setGioiTinh(rs.getString("GIOITINH"));
                ds.add(khachhang);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
}
