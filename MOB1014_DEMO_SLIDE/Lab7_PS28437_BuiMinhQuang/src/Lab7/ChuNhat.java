/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.util.Scanner;


public class ChuNhat {
    private double dai,rong;

    public ChuNhat() {
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getchuvi(){
        return (dai+rong)*2;
    }
    public double getdientich(){
        return dai*rong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        this.dai = sc.nextDouble();
        System.out.println("Nhap vao chieu rong");
        this.rong = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Do dai la: "+dai);
        System.out.println("Chieu rong la: "+rong);
        System.out.println("Chu vi la: "+getchuvi());
        System.out.println("Dien tich la: "+getdientich());
    }
}
