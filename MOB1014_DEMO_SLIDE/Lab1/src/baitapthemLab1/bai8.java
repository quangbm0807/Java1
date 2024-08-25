/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthemLab1;

import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nhap diem: ");
        double diem = sc.nextDouble();
        System.out.println("Thong tin sinh vien vua nhap:");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("MSSV: " + mssv);
        System.out.println("Diem: " + diem);
    }
}

