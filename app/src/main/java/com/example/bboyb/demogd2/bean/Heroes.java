package com.example.bboyb.demogd2.bean;

/**
 * Created by bboyb on 21/04/2017.
 */

public class Heroes {
    private String idHero;
    private String tenHero;
    private String cachChoi;
    private String moTa;
    private String thuocTinh;
    private byte[] hinhAnh;
    private String strength;
    private String agility;
    private String intelligent;
    private String tocDoChay;

    public Heroes() {
    }

    public Heroes(String idHero, String tenHero, String cachChoi, String moTa, String thuocTinh, byte[] hinhAnh, String strength, String agility, String intelligent, String tocDoChay) {
        this.idHero = idHero;
        this.tenHero = tenHero;
        this.cachChoi = cachChoi;
        this.moTa = moTa;
        this.thuocTinh = thuocTinh;
        this.hinhAnh = hinhAnh;
        this.strength = strength;
        this.agility = agility;
        this.intelligent = intelligent;
        this.tocDoChay = tocDoChay;
    }

    public String getTenHero() {
        return tenHero;
    }

    public void setTenHero(String tenHero) {
        this.tenHero = tenHero;
    }

    public String getIdHero() {
        return idHero;
    }

    public void setIdHero(String idHero) {
        this.idHero = idHero;
    }

    public String getCachChoi() {
        return cachChoi;
    }

    public void setCachChoi(String cachChoi) {
        this.cachChoi = cachChoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public String getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(String intelligent) {
        this.intelligent = intelligent;
    }

    public String getTocDoChay() {
        return tocDoChay;
    }

    public void setTocDoChay(String tocDoChay) {
        this.tocDoChay = tocDoChay;
    }
}
