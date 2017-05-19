package com.example.bboyb.demogd2.bean;


import java.sql.Timestamp;

/**
 * Created by bboyb on 19/05/2017.
 */

public class News {
    private int id;
    private String TieuDe;
    private String NoiDung;
    private String MoTa;
    private String HinhAnh;
    private Timestamp ThoiGian;

    public News() {
    }

    public News(int id, String tieuDe, String noiDung, String moTa, String hinhAnh, Timestamp thoiGian) {
        this.id = id;
        TieuDe = tieuDe;
        NoiDung = noiDung;
        MoTa = moTa;
        HinhAnh = hinhAnh;
        ThoiGian = thoiGian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp thoiGian) {
        ThoiGian = thoiGian;
    }
}

