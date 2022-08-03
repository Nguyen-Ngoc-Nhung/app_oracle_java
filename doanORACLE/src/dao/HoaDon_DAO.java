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
import java.sql.Types;
import java.util.ArrayList;
import main.frmDangNhap;
import pojo.HoaDon_POJO;

/**
 *
 * @author Admin
 */
public class HoaDon_DAO {
    public static ArrayList<HoaDon_POJO> layDanhSachHoaDon() {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        ArrayList<HoaDon_POJO> ds = new ArrayList<HoaDon_POJO>();
        try {
            String sql = "SELECT MAHD , MAKH , MANV , NGAYLAP , TONGTIEN FROM NHUNG.HOADON ";
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                HoaDon_POJO hoadon = new HoaDon_POJO();
                hoadon.setMaHD(rs.getString("MAHD"));
                hoadon.setMaKH(rs.getString("MAKH"));
                hoadon.setMaNV(rs.getString("MANV"));
                hoadon.setNgayLap(rs.getDate("NGAYLAP"));
                hoadon.setTongTien(rs.getFloat("TONGTIEN"));
                ds.add(hoadon);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static int TimTongTien(String mahd) throws SQLException
    {
        String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        int kq = 0;
        conn provider = new conn();
        provider.open(strUsername,strPassword);
        CallableStatement stmt = provider.GetConnect().prepareCall("{ ? = call sys.get_thanhtoan(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2,mahd);
        stmt.execute();
        kq = stmt.getInt(1);
        provider.close();
        return kq;
    }
}
