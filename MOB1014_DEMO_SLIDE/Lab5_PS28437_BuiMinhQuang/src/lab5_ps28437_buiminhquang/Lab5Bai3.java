/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_ps28437_buiminhquang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab5Bai3 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<SanPham> ds = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;
        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach san pham tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Sap xep gia san pham tu thap toi cao.");
            System.out.printf("|%-60s|\n", "  4. Xoa theo ten nhap tu ban phim. ");
            System.out.printf("|%-60s|\n", "  5. Xuat gia trung binh cua san pham.");
            System.out.printf("|%-60s|\n", "  6. Thoat.");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            try {
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH SAN PHAM TU BAN PHIM");
                        nhap(ds);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH RA MAN HINH");
                        xuat(ds);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG TIM SAP XEP GIA SAN PHAM TU THAP TOI CAO");
                        sapxepgia(ds);
                        break;
                    case 4:
                        System.out.println("DAY LA CHUC NANG XOA THEO TEN SP");
                        xoa(ds);
                        break;
                    case 5:
                        System.out.println("DAY LA CHUC NANG XUAT GIA TRUNG BINH");
                        giatb(ds);
                        break;
                    case 6:
                        System.out.println("THOAT");
                        break;
                    default:
                        System.out.println("LUA CHON KHONG HOP LE. MOI BAN NHAP LAI.");
                        menu();
                }
            } catch (Exception e) {
                System.out.println("VUI LONG NHAP VAO 1 SO. MOI BAN NHAP LAI.");
                sc.next();
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("BAN CO MUON TIEP TUC SU DUNG CHUONG TRINH KHONG? (Y de tiep tuc.)");
            String luaChon = sc.nextLine();
            tiepTuc = luaChon.equalsIgnoreCase("Y");
        } while (tiepTuc);
        System.out.println("Cam on ban da su dung chuong trinh!");
        sc.close();
    }

    public static void nhap(ArrayList<SanPham> ds) {
        Scanner sc = new Scanner(System.in);
        String chon = "";
        int i = 1;
        do {
            SanPham sp = new SanPham();
            System.out.printf("Nhap ten san pham thu %d: ", i);
            sp.ten = sc.nextLine();
            System.out.printf("Nhap gia san pham thu %d: ", i);
            sp.gia = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ban co muon nhap them khong(Y/N)");
            chon = sc.nextLine();
            ds.add(sp);
            i++;
        } while (chon.equalsIgnoreCase("y"));
    }

    public static void xuat(ArrayList<SanPham> ds) {
        int i = 1;
        for (SanPham x : ds) {
            System.out.printf("San pham thu %d la %s va co gia la %s\n", i, x.ten, x.gia);
            i++;
        }
    }

    public static void giatb(ArrayList<SanPham> ds) {
        double tong = 0;
        int count = 0;
        for (SanPham x : ds) {
            tong += x.gia;
            count++;
        }
        System.out.println("Gia trung binh cua nhung san pham la: " + (tong / count));
    }

    public static void xoa(ArrayList<SanPham> ds) {
        Scanner sc = new Scanner(System.in);
        boolean tim = false;
        System.out.println("Nhap ten can tim: ");
        String ten = sc.nextLine();
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).ten.equalsIgnoreCase(ten)) {
                ds.remove(i);
                System.out.println("Da xoa");
                System.out.println("Danh sach con lai la: ");
                xuat(ds);
                tim = true;
            }
        }
        if (!tim) {
            System.out.println("Khong tim thay san pham");
        }
    }

    public static void sapxepgia(ArrayList<SanPham> ds) {
        Collections.sort(ds, (sp1, sp2) -> Double.compare(sp2.gia, sp1.gia));
        System.out.println("Danh sach sau khi sap xep theo gia tu thap den cao:");
        Collections.reverse(ds);
        xuat(ds);
    }

}
