package ASM_FINAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList<String> danhSachSinhVien = new ArrayList<>();
        menu(danhSachSinhVien);
    }

    public static void menu(ArrayList<String> danhSachSinhVien) {
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;

        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach sinh vien tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach sinh vien ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Tim kiem ten sinh vien.");
            System.out.printf("|%-60s|\n", "  4. Them 1 phan tu vao vi tri thu 2 cua mang. ");
            System.out.printf("|%-60s|\n", "  5. Thoat chuong trinh. ");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

            try {
                chon = sc.nextInt();
                sc.nextLine();

                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH SINH VIEN TU BAN PHIM");
                        nhapDanhSach(danhSachSinhVien);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH SINH VIEN RA MAN HINH");
                        xuatDanhSach(danhSachSinhVien);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG TIM KIEM TEN SINH VIEN");
                        timKiemSinhVien(danhSachSinhVien);
                        break;

                    case 4:
                        System.out.println("DAY LA CHUC NANG THEM 1 PHAN TU VAO VI TRI THU 2 CUA MANG");
                        themPhanTuVaoViTriThuHai(danhSachSinhVien);
                        break;
                    case 5:
                        tiepTuc = false;
                        break;
                    default:
                        System.out.println("LUA CHON KHONG HOP LE. MOI BAN NHAP LAI.");
                        break;
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

    public static void nhapDanhSach(ArrayList<String> danhSach) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ten sinh vien: ");
            String ten = sc.nextLine();
            danhSach.add(ten);
            System.out.println("Ban co muon nhap tiep khong?(Y/N)");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    public static void xuatDanhSach(ArrayList<String> danhSach) {
        System.out.println("Danh sach sinh vien la: ");
        System.out.printf("|\t%-5s\t|\t%-20s\t|", "STT", "Ten");
        for (int i = 0; i < danhSach.size(); i++) {
            String ten = danhSach.get(i);
            System.out.printf("\n|\t%-5d\t|\t%-20s\t|", i + 1, ten);
        }
    }

    public static void timKiemSinhVien(ArrayList<String> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can tim: ");
        String tenCanTim = sc.nextLine();

        boolean timThay = false;
        for (String ten : danhSach) {
            if (ten.equalsIgnoreCase(tenCanTim)) {
                System.out.println("Sinh vien co ten \"" + tenCanTim + "\" tim thay.");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sinh vien co ten \"" + tenCanTim + "\"");
        }
    }

    public static void themPhanTuVaoViTriThuHai(ArrayList<String> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can them: ");
        String tenSinhVien = sc.nextLine();
        danhSach.add(1, tenSinhVien);
        System.out.println("Da them sinh vien \"" + tenSinhVien + "\" vao vi tri thu 2 cua danh sach.");
    }

}
