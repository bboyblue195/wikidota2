package com.example.bboyb.demogd2.bean;

/**
 * Created by bboyb on 03/05/2017.
 */

public class Skills {
    private String idSkill;
    private String tenSkill;
    private String congDung;
    private byte[] hinhAnh;

    public Skills() {
    }

    public Skills(String idSkill, String tenSkill, String congDung, byte[] hinhAnh) {
        this.idSkill = idSkill;
        this.tenSkill = tenSkill;
        this.congDung = congDung;
        this.hinhAnh = hinhAnh;
    }

    public String getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(String idSkill) {
        this.idSkill = idSkill;
    }

    public String getTenSkill() {
        return tenSkill;
    }

    public void setTenSkill(String tenSkill) {
        this.tenSkill = tenSkill;
    }

    public String getCongDung() {
        return congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
