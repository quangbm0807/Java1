/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_ps28437_buiminhquang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<String> ds = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;
        do {
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  1. Nhap danh sach tu ban phim.");
            System.out.printf("|%-60s|\n", "  2. Xuat danh sach ra man hinh.");
            System.out.printf("|%-60s|\n", "  3. Sap xep danh sach tu Z-A.");
            System.out.printf("|%-60s|\n", "  4.Xoa theo ten nhap tu ban phim. ");
            System.out.printf("|%-60s|\n", "  5. Xuat danh sach ngau nhien.");
            System.out.printf("|%-60s|\n", "  6. Thoat.");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.printf("|%-60s|\n", "  .....................Chon chuc nang:.....................");
            System.out.printf("|%-60s|\n", "  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            try {
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("DAY LA CHUC NANG NHAP DANH SACH TU BAN PHIM");
                        nhap(ds);
                        break;
                    case 2:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH RA MAN HINH");
                        xuat(ds);
                        break;
                    case 3:
                        System.out.println("DAY LA CHUC NANG TIM SAP XEP DANH SACH Z-A");
                        sapxep(ds);
                        break;
                    case 4:
                        System.out.println("DAY LA CHUC NANG XOA THEO TEN");
                        xoa(ds);
                        break;
                    case 5:
                        System.out.println("DAY LA CHUC NANG XUAT DANH SACH NGAU NHIEN");
                        ngaunhien(ds);
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

  public static void nhap(ArrayList<String> ds) {
    Scanner sc = new Scanner(System.in);
    String chon = "";
    int i = 1;
    do {
        System.out.printf("Nhap ho ten cho phan tu thu %d: ", i);
        String hoTen = sc.nextLine();
        System.out.println("Ban co muon nhap them khong(Y/N)");
        chon = sc.nextLine();
        ds.add(hoTen);
        i++;
    } while (chon.equalsIgnoreCase("y"));
}



    public static void xuat(ArrayList<String> ds) {
        int i = 1;
        for (String x : ds) {
            System.out.printf("Phan tu thu %d la %s\n", i, x);
            i++;
        }
    }

    public static void sapxep(ArrayList<String> ds) {
        Collections.sort(ds);
        Collections.reverse(ds);
        System.out.println("Danh sach tu Z-A la:");
        xuat(ds);
    }

    public static void xoa(ArrayList<String> ds) {
        Scanner sc = new Scanner(System.in);
        boolean tim = false;
        System.out.println("Nhap ten can tim: ");
        String ten = sc.nextLine();
        for (int i = 0; i < ds.size(); i++) {
            if (ten.equalsIgnoreCase(ds.get(i))) {
                ds.remove(i);
                System.out.println("Da xoa");
                tim = true;
            }
        }
        if (!tim) {
            System.out.println("Khong tim thay");
        }
    }

    public static void ngaunhien(ArrayList<String> ds) {
        System.out.println("Danh sach ngau nhien la: ");
        Collections.shuffle(ds);
        xuat(ds);
    }
}
