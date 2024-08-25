/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5_ps28437_buiminhquang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author buimi
 */
public class Lab5Bai1 {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList();
        nhap(list);
        xuat(list);
    }

    public static void nhap(ArrayList<Double> list) {
        int i = 1;
        while (true) {
            System.out.printf("\nNhap so thu %d: ", i);
            i++;
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("\nBan co muon nhap them khong?(Y/N)");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuat(ArrayList<Double> list) {
        System.out.println("Danh sach vua nhap la: ");
        int i = 1;
        double tong = 0;
        for (double n : list) {
            System.out.printf("Phan tu thu %d  la %s\n", i, n);
            tong += n;
            i++;
        }
        System.out.println("Tong cac phan tu vua nhap la: " + tong);
    }
}
