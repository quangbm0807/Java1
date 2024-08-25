package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ASM {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;
        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach nhan vien tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach nhan vien ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Tim va hien thi nhan vien theo ma nhap tu ban phim.");
            System.out.printf("|%-60s|\n", "  4. Xoa nhan vien theo ma nhap tu ban phim. ");
            System.out.printf("|%-60s|\n", "  5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim.");
            System.out.printf("|%-60s|\n", "  6. Tim cac nhan vien theo khoang luong nhap tu ban phim.");
            System.out.printf("|%-60s|\n", "  7. Sap xep nhan vien theo ho va ten. ");
            System.out.printf("|%-60s|\n", "  8. Sap xep nhan vien theo thu nhap.");
            System.out.printf("|%-60s|\n", "  9. Xuat 5 nhan vien theo thu nhap. ");
            System.out.printf("|%-60s|\n", "  10. Xuat nhan vien cung ten. ");
            System.out.printf("|%-60s|\n", "  0. Thoat chuong trinh");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            try {
                chon = sc.nextInt();
                sc.nextLine();
                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH NHAN VIEN TU BAN PHIM");
                        ds.nhap(sc);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH NHAN VIEN RA MAN HINH");
                        ds.xuat();
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG TIM VA HIEN THU NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        ds.timKiem(sc);
                        break;
                    case 4:
                        System.out.println("DAY LA CHUC NANG XOA NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        ds.xoaNV(sc);
                        break;
                    case 5:
                        System.out.println("DAY LA CHUC NANG CAP NHAT THONG TIN NHAN VIEN THEO MA NHAP TU BAN PHIM");
                        ds.capNhat(sc);
                        break;
                    case 6:
                        System.out.println("DAY LA CHUC NANG TIM NHAN VIEN THEO KHOANG LUONG NHAP TU BAN PHIM");
                        ds.timTheoLuong(sc);
                        break;
                    case 7:
                        System.out.println("DAY LA CHUC NANG SAP XEP NHAN VIEN THEO HO TEN");
                        ds.sapXepTheoHoTen();
                        break;
                    case 8:
                        System.out.println("DAY LA CHUC NANG SAP XEP NHAN VIEN THEO THU NHAP");
                        ds.sapXepTheoThuNhap();
                        break;
                    case 9:
                        System.out.println("DAY LA CHUC NANG XUAT 5 NHAN VIEN CO THU NHAP CAO NHAT");
                        ds.xuatTop5ThuNhap();
                        break;
                    case 10:
                        System.out.println("DAY LA CHUC NANG XUAT NHAN VIEN CUNG TEN");
                        ds.xuatNhanVienTheoTen(sc);
                        break;
                    case 0:
                        tiepTuc = false;
                        break;
                    default:
                        System.out.println("LUA CHON KHONG HOP LE. MOI BAN NHAP LAI.");
                        menu();
                }
            } catch (Exception e) {
                System.out.println("VUI LONG NHAP VAO 1 SO. MOI BAN NHAP LAI.");
                sc.nextLine();
                continue;
            }
            System.out.println("\nBAN CO MUON TIEP TUC SU DUNG CHUONG TRINH KHONG? (Y de tiep tuc.)");
            String luaChon = sc.nextLine();
            tiepTuc = luaChon.equalsIgnoreCase("Y");
        } while (tiepTuc);
        System.out.println("Cam on ban da su dung chuong trinh!");
        sc.close();
    }
}
