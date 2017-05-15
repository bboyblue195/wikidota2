package com.example.bboyb.demogd2.bean;

/**
 * Created by bboyb on 21/04/2017.
 */

public class Items {
    private String idItem;
    private String tenItem;
    private int gia;
    private String congDung;
    private String upgrades;
    private byte[] hinhAnh;

    public Items() {
    }

    public Items(String idItem, String tenItem, int gia, String congDung, String upgrades, byte[] hinhAnh) {
        this.idItem = idItem;
        this.tenItem = tenItem;
        this.gia = gia;
        this.congDung = congDung;
        this.upgrades = upgrades;
        this.hinhAnh = hinhAnh;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getTenItem() {
        return tenItem;
    }

    public void setTenItem(String tenItem) {
        this.tenItem = tenItem;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getCongDung() {
        return congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }

    public String getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(String upgrades) {
        this.upgrades = upgrades;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
