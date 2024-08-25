package Assignment;

import java.util.Scanner;

public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong() {
        super("", "", "Truong Phong", 0);
    }

    public TruongPhong(String maNV, String hoTen, double luong, double luongTrachNhiem) {
        super(maNV, hoTen, "Truong Phong", luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.println("Nhap Luong Trach Nhiem: ");
        this.luongTrachNhiem = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" \t%-20s %10s", "Luong trach nhiem:", luongTrachNhiem);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + luongTrachNhiem;
    }
}
