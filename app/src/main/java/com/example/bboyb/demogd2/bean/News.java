package com.example.bboyb.demogd2.bean;


import java.text.DateFormat;
import java.util.Date;

/**
 * Created by bboyb on 21/04/2017.
 */

public class News {
    private String idNews;
    private String tieuDe;
    private String noiDung;
    private String moTa;
    private Date thoiGian;
    private byte[] hinhAnh;
    public News() {
    }

    public News(String idNews, String tieuDe, String noiDung, String moTa, Date thoiGian, byte[] hinhAnh) {
        this.idNews = idNews;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.moTa = moTa;
        this.thoiGian = thoiGian;
        this.hinhAnh = hinhAnh;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getIdNews() {
        return idNews;
    }

    public void setIdNews(String idNews) {
        this.idNews = idNews;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
}


