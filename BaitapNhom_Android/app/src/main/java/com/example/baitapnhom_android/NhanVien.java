package com.example.baitapnhom_android;

public class NhanVien {
    private String name;
    private String age;
    private int imgNV;

    public NhanVien(String name, String age, int imgNV) {
        this.name = name;
        this.age = age;
        this.imgNV = imgNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImgNV() {
        return imgNV;
    }

    public void setImgNV(int imgNV) {
        this.imgNV = imgNV;
    }

}
