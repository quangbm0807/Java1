package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList<Double> danhSachSoThuc = new ArrayList<>();
        menu(danhSachSoThuc);
    }

    public static void menu(ArrayList<Double> danhSachSoThuc) {
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;

        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach so thuc tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach so thuc ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Sap xep danh sach so thuc.");
            System.out.printf("|%-60s|\n", "  4. Thoat chuong trinh. ");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

            try {
                chon = sc.nextInt();
                sc.nextLine();

                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH TU BAN PHIM");
                        nhapDanhSach(danhSachSoThuc);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH SO THUC RA MAN HINH");
                        xuatDanhSach(danhSachSoThuc);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG SAP XEP DANH SACH SO THUC TANG DAN");
                        sapXepTangDan(danhSachSoThuc);
                        System.out.println("Danh sach so thuc sau khi sap xep:");
                        xuatDanhSach(danhSachSoThuc);
                        break;
                    case 4:
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

    public static void nhapDanhSach(ArrayList<Double> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                double phanTu = sc.nextDouble();
                sc.nextLine();
                danhSach.add(phanTu);
            } catch (Exception e) {
                System.out.println("Chi duoc nhap so. Vui long nhap lai!");
                sc.nextLine();
                i--;
            }
        }
    }

    public static void xuatDanhSach(ArrayList<Double> danhSach) {
        System.out.println("Danh sach san pham la: ");
        System.out.printf("|\t%-5s\t|\t%-3s\t|", "STT", "So");
        for (int i = 0; i < danhSach.size(); i++) {
            double so = danhSach.get(i);
            System.out.printf("\n|\t%-5d\t|\t%3.2f\t|", i + 1, so);
        }
    }

    public static void sapXepTangDan(ArrayList<Double> danhSach) {
        Collections.sort(danhSach);
    }
}
