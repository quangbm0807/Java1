/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class NhanVien {

    private String maNV, hoTen, loai;
    private double luong;
    private static ArrayList<String> danhSachMaNV = new ArrayList<>();

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String loai, double luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.loai = loai;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public double getThueThuNhap() {
        double thue = 0;
        if (getThuNhap() < 900) {
            thue = 0;
        } else if (getThuNhap() >= 900 && getThuNhap() < 15000) {
            thue = getThuNhap() * 0.1;
        } else if (getThuNhap() >= 15000) {
            thue = getThuNhap() * 0.12;
        }
        return thue;
    }

    public void nhap(Scanner sc) {
        System.out.println("Nhap Ma NV:");
        this.maNV = sc.nextLine();
          while (maNVDaTonTai(maNV)) {
            System.out.println("Ma nhan vien da ton tai. Vui long nhap lai.");
            System.out.print("Nhap ma nhan vien: ");
            maNV = sc.nextLine();
        }

        this.maNV = maNV;
        danhSachMaNV.add(maNV);
        System.out.println("Nhap Ho Ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap Luong: ");
        this.luong = sc.nextDouble();
        sc.nextLine();
    }
  private static boolean maNVDaTonTai(String maNV) {
        for (String ma : danhSachMaNV) {
            if (ma.equalsIgnoreCase(maNV)) {
                return true;
            }
        }
        return false;
    }
    public void xuat() {

    }

    public void xuatnv() {
    System.out.printf("\nMaNV: %s\t\tHoTen: %s\t\tLoai: %s\t\tLuong: %.2f\t\tThu nhap: %.2f", maNV, hoTen, loai, luong, getThuNhap());
}


}
