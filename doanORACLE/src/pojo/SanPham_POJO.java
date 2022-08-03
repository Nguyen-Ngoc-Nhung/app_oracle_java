/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Admin
 */
public class SanPham_POJO {
    String MaSP , TenSP , HinhThucDongGoi , TenLoaiSP , TinhTrang ;
    int SoLuongTon;

    byte[] anh;

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHinhThucDongGoi() {
        return HinhThucDongGoi;
    }

    public void setHinhThucDongGoi(String HinhThucDongGoi) {
        this.HinhThucDongGoi = HinhThucDongGoi;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }


    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public SanPham_POJO() {
    }

    public SanPham_POJO(String MaSP, String TenSP, String HinhThucDongGoi, String TenLoaiSP, String TinhTrang, int SoLuongTon, byte[] anh) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.HinhThucDongGoi = HinhThucDongGoi;
        this.TenLoaiSP = TenLoaiSP;
        this.TinhTrang = TinhTrang;
        this.SoLuongTon = SoLuongTon;
        this.anh = anh;
    }

    

   
}
