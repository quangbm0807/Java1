/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7Bai2Bai3Bai4;

import java.util.Scanner;
public class SinhVienBiz extends SinhVienPoly {
    protected double diemMarketting;
    protected double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketting, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * diemMarketting + diemSales) / 3;
    }
}