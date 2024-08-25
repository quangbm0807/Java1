/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> list = new ArrayList<>();

    public void nhap() {
        for (int i = 0; i < 5;i++) {
            SinhVien sv =new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }

    public void xuat() {
        System.out.println("--------------------------------");
        System.out.println("Danh sach sinh vien");
        for (SinhVien item : list) {
            item.xuat();
        }
    }
}