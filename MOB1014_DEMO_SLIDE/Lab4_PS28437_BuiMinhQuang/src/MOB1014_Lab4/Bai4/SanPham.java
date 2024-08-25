package MOB1014_Lab4.Bai4;

import MOB1014_Lab4.*;
import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private double giamGia;
    public String getTenSP(){
        return tenSP;
    }
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
     public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

     void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }

     void xuat() {
        System.out.println("");
        System.out.println("Ten SP" + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue NK: " + getThueNhapKhau());
    }

}
