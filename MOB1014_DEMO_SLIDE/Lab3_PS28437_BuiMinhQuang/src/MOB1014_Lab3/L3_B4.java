/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab3;

import java.util.Scanner;

public class L3_B4 {

    public static String xeploai(double diem) {
        String hocluc = "";
        if (diem >= 9.0) {
            hocluc = "Xuat sac";
        } else if (diem >= 8 && diem < 9) {
            hocluc = "Gioi";
        } else if (diem < 8 && diem >= 7) {
            hocluc = "Kha";
        } else if (diem >= 5 && diem < 7) {
            hocluc = "Trung binh";
        } else {
            hocluc = "Yeu";
        }
        return hocluc;
    }

    public static void nhap(double diem[], String hoten[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu: " + (i + 1));
            System.out.println("Ho ten: ");
            hoten[i] = sc.nextLine();
            System.out.println("Diem= ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public static void xuat(double diem[], String hoten[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sach sinh vien");
        System.out.println("STT    HOTEN    DIEM    HOCLUC");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "    " + hoten[i] + "    " + diem[i] + "    " + xeploai(diem[i]));
        }
    }

    public static void sapxep(double diem[], String hoten[], int n) {
        for (int i = 0; i < diem.length - 1; i++) {
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] < diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    String ten = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = ten;
                }
            }
        }
        System.out.println("Danh sach sinh vien sau khi sap xep la: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double diem[];
        String hoten[];
        System.out.println("Nhap so phan tu: ");
        n = sc.nextInt();
        sc.nextLine();
        diem = new double[n];
        hoten = new String[n];
        nhap(diem, hoten, n);
        xuat(diem, hoten, n);
        sapxep(diem, hoten, n);
        xuat(diem,hoten,n);
    }
}
