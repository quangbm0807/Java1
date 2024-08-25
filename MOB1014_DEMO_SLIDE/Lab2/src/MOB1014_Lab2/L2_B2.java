/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab2;

import java.util.Scanner;

public class L2_B2 {

    public static void main(String[] args) {
        phuongtrinhbac2();
    }

    public static void phuongtrinhbac2() {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap a: ");
        a = in.nextInt();
        System.out.println("Nhap b: ");
        b = in.nextInt();
        System.out.println("Nhap c: ");
        c = in.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                L2_B1.phuongtrinhbac1(b, c);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * (double) a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * (double) a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * (double) a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }

}