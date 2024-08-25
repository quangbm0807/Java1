/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Phan1_S3_Demo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class S3_vd_While {
    public static void main(String[] args) {
        cuuchuong();
    }
    public static void cuuchuong() {
        int so ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bang cuu chuong can xem.");
        so = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            int tich = so * i;
            System.out.println(so + " x " + i + " = " + tich);
            i++;
        }
    }
}

