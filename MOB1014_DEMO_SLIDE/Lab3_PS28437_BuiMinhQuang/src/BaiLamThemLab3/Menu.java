/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLamThemLab3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author buimi
 */
public class Menu {

    static float[] a;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;
        do {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("|   1. Nhap xuat va sap xep mang tang dan.                 |");
            System.out.println("|   2. Nhap xuat va sap xep mang giam dan.                 |");
            System.out.println("|   3. Nhap xuat va tinh trung binh cong cac phan tu trong mang.   |");
            System.out.println("|   4. Nhap xuat va tinh tong cac so chia het cho 2 trong mang.               |");
            System.out.println("|   5. Nhap xuat va tinh tong cac so chia het cho 3 trong mang.  |");
            System.out.println("|   6. Nhap xuat va tinh tong cac so chia het cho 2 va 5 trong mang.   |");
            System.out.println("|   7. Nhap xuat thong tin sinh vien.                     |");
            System.out.println("|   8. Nhap xuat va tinh tong cac so chan.                      |");
            System.out.println("|   9. Nhap xuat mang theo ToString.                       |");
            System.out.println("|   10. Tim kiem va xuat ra phan tu nho nhat cua mang.                       |");
            System.out.println("|   11. Nhap xuat tu tong cac so tu 1-100                       |");
            System.out.println("|   12. Xuat cac so chan le trong chuong trinh.                       |");
            System.out.println("|   13.Chuc nang dem cac so le va so chan trong mang.                       |");
            System.out.println("|   14.Chuc nang xuat cac so am va duong.                       |");
            System.out.println("|   15.Chuc nang nhap xuat thong tin sinh vien theo diem giam dan.                       |");
            System.out.println("|   0. Thoat chuong trinh                                   |");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("|......................CHON CHUC NANG:...................... |");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            try {
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA SAP XEP MANG TANG DAN");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tangdan(a, a.length);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA SAP XEP MANG GIAM DAN");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.giamdan(a, a.length);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA TINH TRUNG BINH CONG CAC PHAN TU TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.trungbinh(a, a.length);
                        break;
                    case 4:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA TINH TONG CAC SO CHIA HET CHO 2 TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tongchia2(a, a.length);
                        break;
                    case 5:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA TINH TONG CAC SO CHIA HET CHO 3 TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tongchia3(a, a.length);
                        break;
                    case 6:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA TINH TONG CAC SO CHIA HET CHO 2 VA 5 TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tongchia2va5(a, a.length);
                        break;
                    case 7:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT THONG TIN SINH VIEN");
                        ChucNang.thongtinsinhvien();
                        break;
                    case 8:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT VA TINH TONG CAC SO CHAN");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tongsochan(a);
                        break;
                    case 9:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT MANG TOSTRING");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.tostring(a);
                        break;
                    case 10:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT CAC SO NHO NHAT TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.sonhonhat(a);
                        break;
                    case 11:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT NGAU NHIEN 1-100");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhapTuDong(a.length, a);
                        ChucNang.xuat(a, a.length);
                        break;
                    case 12:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT SO CHAN VA SO LE TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.xuatSoChan(a, a.length);
                        ChucNang.xuatSoLe(a, a.length);
                    case 13:
                        System.out.println("DAY LA CHUC NANG DEM CAC SO CHAN VA SO LE TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.chanle(a);
                    case 14:
                        System.out.println("DAY LA CHUC NANG XUAT CAC SO AM VA DUONG TRONG MANG");
                        a = ChucNang.Nhapspt();
                        ChucNang.nhap(a, a.length);
                        ChucNang.xuatPhanTuAm(a, a.length);
                        ChucNang.xuatPhanTuDuong(a, a.length);
                    case 15:
                        System.out.println("DAY LA CHUC NANG NHAP XUAT THONG TIN SINH VIEN THEO DIEM GIAM DAN");
                        ChucNang.thongTinSinhVien();
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
            sc.nextLine();
            System.out.println("BAN CO MUON TIEP TUC SU DUNG CHUONG TRINH KHONG(Y de tiep tuc)");
            String luaChon = sc.nextLine();
            tiepTuc = luaChon.equalsIgnoreCase("Y");
        } while (tiepTuc);
        System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH!");
        sc.close();
    }
}
