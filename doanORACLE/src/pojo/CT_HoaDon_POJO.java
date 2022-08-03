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
public class CT_HoaDon_POJO {
    String MaHD , MaSP , MaLo ;
    int SoLuong ;
    int GiaBan , ThanhToan ;

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaLo() {
        return MaLo;
    }

    public void setMaLo(String MaLo) {
        this.MaLo = MaLo;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(int ThanhToan) {
        this.ThanhToan = ThanhToan;
    }

    public CT_HoaDon_POJO() {
    }

    public CT_HoaDon_POJO(String MaHD, String MaSP, String MaLo, int SoLuong, int GiaBan, int ThanhToan) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.MaLo = MaLo;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.ThanhToan = ThanhToan;
    }
    
}
