package bai3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {

    static ArrayList<album> ds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("1.nhap danh sach");
        System.out.println("2.xuat danh sach");
        System.out.println("3.sap xep danh sach tang dan theo ma");
        System.out.println("4.sap xep danh danh tang dan theo ten");
        System.out.println("5.xuat theo 2 gia cao nhat troang mang");
        System.out.println("0.thoat chuong trinh:");
        System.out.print("chon chuc nang:");
        int chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1:
                nhapds();
                break;
            case 2:
                xuatds();
                break;
            case 3:
                sapXepTheoMa();
                break;
            case 4:
                sapXepTheoTen();
                break;
            case 5:
                sapXep2giaCaoNhat();
                break;
            case 0:
                System.out.println("tam biet");
                System.exit(0);
            default:
                System.out.println("moi nhap lai");
        }
    }

    static void nhapds() {

        do {
            album al = new album();
            al.nhap();
            ds.add(al);
            System.out.println("Tiep tuc khong: (Y/N)");
        } while (!sc.nextLine().equalsIgnoreCase("N"));
    }

    static void xuatds() {
        int i = 1;
        System.out.println("| STT |  Ma album  |  ten album  |     gia    |");
        for (album al : ds) {
            System.out.printf("|%-5d", i);
            al.xuat();
            i++;
        }
    }

    static void sapXepTheoMa() {
        Comparator theoMa = new Comparator<album>() {
            @Override
            public int compare(album o1, album o2) {
                return o1.getMaAlbum().compareTo(o2.getMaAlbum());
            }
        };
        Collections.sort(ds, theoMa);
        xuatds();
    }

    static void sapXepTheoTen() {
        Comparator theoTen = new Comparator<album>() {
            @Override
            public int compare(album o1, album o2) {
                return o1.getTenAlbum().compareTo(o2.getTenAlbum());
            }
        };
        Collections.sort(ds, theoTen);
        xuatds();
    }

    static void sapXep2giaCaoNhat() {
        Comparator gia = new Comparator<album>() {
            @Override
            public int compare(album o1, album o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(ds, gia);
        System.out.println("| STT |  Ma album  |  ten album  |     gia    |");
        for (int i = 0; i < 2 && i < ds.size(); i++) {
            System.out.printf("|%-5d", i + 1);
            ds.get(i).xuat();
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
