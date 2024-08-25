package MOB1014_Lab4;

import java.util.Scanner;

public class SanPham {

    String tenSP;
    double donGia;
    double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public double getThueNhapKhau() {
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
