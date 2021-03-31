package com.example.myapplication;

public class DienThoai {
    private String urlImg;
    private String mota;
    private int danhgia;
    private String giaTien;
    private String mau;

    public DienThoai() {
    }

    public DienThoai(String urlImg, String mota, int danhgia, String giaTien, String mau) {
        this.urlImg = urlImg;
        this.mota = mota;
        this.danhgia = danhgia;
        this.giaTien = giaTien;
        this.mau = mau;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(int danhgia) {
        this.danhgia = danhgia;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "urlImg='" + urlImg + '\'' +
                ", mota='" + mota + '\'' +
                ", danhgia=" + danhgia +
                ", giaTien='" + giaTien + '\'' +
                ", mau='" + mau + '\'' +
                '}';
    }
}
