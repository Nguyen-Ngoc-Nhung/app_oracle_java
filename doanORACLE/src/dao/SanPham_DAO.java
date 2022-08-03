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
import pojo.SanPham_POJO;

/**
 *
 * @author Admin
 */
public class SanPham_DAO {
    
     public static ArrayList<SanPham_POJO> layDanhSachSanPham() {
        ArrayList<SanPham_POJO> ds = new ArrayList<SanPham_POJO>();
            String strUsername = frmDangNhap.strTenDangNhap;
        String strPassword = frmDangNhap.strMatKhau;
        try {
            String sql = "SELECT MASP , TENSP , HTHUC_DONGGOI , SLTON , TENLOAISP , TINHTRANG , HINHANH FROM NHUNG.SANPHAM";
            
            conn helper = new conn();
            helper.open(strUsername,strPassword);
            ResultSet rs = helper.executeQuery(sql);
            while (rs.next()) {
                SanPham_POJO sanpham = new SanPham_POJO();
                sanpham.setMaSP(rs.getString("MASP"));
                sanpham.setTenSP(rs.getString("TENSP"));
                sanpham.setHinhThucDongGoi(rs.getString("HTHUC_DONGGOI"));
                sanpham.setSoLuongTon(rs.getInt("SLTON"));
                sanpham.setTenLoaiSP(rs.getString("TENLOAISP"));
                sanpham.setTinhTrang(rs.getString("TINHTRANG"));
                sanpham.setAnh(rs.getBytes("HINHANH"));
                ds.add(sanpham);
            }
            helper.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
     public static boolean themSanPham(SanPham_POJO nv)
    {
        String strUsername = SharedData.nguoi.getStrName();
        String strPassword = SharedData.nguoi.getStrPass();
        boolean kq = false;
        String sql = String.format("Insert into SANPHAM(MASP , TENSP , HTHUC_DONGGOI , SLTON , TENLOAISP , TINHTRANG , HINHANH) Values('%s',N'%s',N'%s','%d',N'%s',N'%s','%s');"
                , nv.getMaSP(),nv.getTenSP(),nv.getHinhThucDongGoi(),nv.getSoLuongTon(),nv.getTenLoaiSP(),nv.getTinhTrang(),nv.getAnh());
        
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
    public static boolean xoaSanPham(String maSanPham)
    {
        String strUsername = SharedData.nguoi.getStrName();
        String strPassword = SharedData.nguoi.getStrPass();
        boolean kq = false;
        String sql = String.format("Delete from NHUNG.SANPHAM where MASP =%s",maSanPham);
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
    
    public static boolean capNhatSanPham(SanPham_POJO nv)
    {
        String strUsername = SharedData.nguoi.getStrName();
        String strPassword = SharedData.nguoi.getStrPass();
        boolean kq = false;
        String sql = String.format("Update NHUNG.SANPHAM Set MASP  ='%s' , TENSP ='%s', HTHUC_DONGGOI ='%s' , SLTON ='%d' , TINHTRANG ='%s', HINHANH ='%s' " + "where MASP = %s"
               , nv.getMaSP(),nv.getTenSP(),nv.getHinhThucDongGoi(),nv.getSoLuongTon(),nv.getTenLoaiSP(),nv.getTinhTrang(),nv.getAnh());
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
//    public  SanPham_DAO findID (String masp)throws Exception{
//        String sql = "select * from SANPHAM where MASP=?";
//        try(
//            Connection con  =  conn.open("NHUNG","NHUNG");
//            PreparedStatement preparedstatement = con.prepareStatement(sql);
//     
//                )
//        {
//          preparedstatement.setString(1, masp);
//          try (ResultSet rs = preparedstatement.executeQuery();){
//              if(rs.next()){
//                  SanPham_DAO sp =  themSanPham(rs);
//                  return  sp;
//              }
//          }
//          return null;
//    }
//}
}
