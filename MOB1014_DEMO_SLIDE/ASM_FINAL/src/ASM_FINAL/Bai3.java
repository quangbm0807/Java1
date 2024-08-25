/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_FINAL;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        menu(ds);
    }

    public static void menu(ArrayList<SanPham> ds) {
        Bai2 nx = new Bai2();
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;

        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach san pham quat tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach quat ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Tim kiem quat theo ten gan dung.");
            System.out.printf("|%-60s|\n", "  4. Thoat chuong trinh. ");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

            try {
                chon = sc.nextInt();
                sc.nextLine();

                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH SINH VIEN TU BAN PHIM");
                        nx.nhap(ds);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH SINH VIEN RA MAN HINH");
                        nx.xuat(ds);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG TIM KIEM TEN SINH VIEN");
                        nx.timKiemQuatTheoTenGanDung(ds);
                        break;

                    case 4:
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
}
