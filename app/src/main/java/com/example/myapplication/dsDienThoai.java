package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class dsDienThoai {

    public List<DienThoai> getdsdienthoai(){
        List<DienThoai> ds = new ArrayList<>();
        DienThoai dienThoai = new DienThoai();
        dienThoai.setUrlImg("den.png");
        dienThoai.setDanhgia(5);
        dienThoai.setGiaTien("1.790.000 đ");
        dienThoai.setMau("den");
        dienThoai.setMota("Điện Thoại Vsmart Joy 3 - Hàng chính hãng");

        DienThoai dienThoai1 = new DienThoai();
        dienThoai.setUrlImg("do.png");
        dienThoai.setDanhgia(5);
        dienThoai.setGiaTien("1.790.000 đ");
        dienThoai.setMau("do");
        dienThoai.setMota("Điện Thoại Vsmart Joy 3 - Hàng chính hãng");

        DienThoai dienThoai2 = new DienThoai();
        dienThoai.setUrlImg("xanh.png");
        dienThoai.setDanhgia(5);
        dienThoai.setGiaTien("1.790.000 đ");
        dienThoai.setMau("xanh");
        dienThoai.setMota("Điện Thoại Vsmart Joy 3 - Hàng chính hãng");

        DienThoai dienThoai4 = new DienThoai();
        dienThoai.setUrlImg("trang.png");
        dienThoai.setDanhgia(5);
        dienThoai.setGiaTien("1.790.000 đ");
        dienThoai.setMau("trang");
        dienThoai.setMota("Điện Thoại Vsmart Joy 3 - Hàng chính hãng");
        ds.add(dienThoai);
        ds.add(dienThoai1);
        ds.add(dienThoai2);
        ds.add(dienThoai4);
        return ds;
    }
}
