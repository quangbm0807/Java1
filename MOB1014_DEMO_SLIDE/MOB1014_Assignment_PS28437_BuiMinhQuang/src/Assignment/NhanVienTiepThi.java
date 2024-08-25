package Assignment;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public NhanVienTiepThi() {
        super("", "", "Nhan Vien TIep Thi", 0);
    }

    public NhanVienTiepThi(String maNV, String hoTen, String loai, double luong) {
        super(maNV, hoTen, loai, luong);
    }

    public NhanVienTiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, "Tiep Thi", luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.println("Nhap Doanh So: ");
        this.doanhSo = sc.nextDouble();
        System.out.println("Nhap Hoa Hong");
        this.hoaHong = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("\t%-20s %10s", "Doanh so:", doanhSo);
        System.out.printf("\t|\t%-20s %10s", "Hoa hong:", hoaHong);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + doanhSo + hoaHong;
    }

}
