/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab2;

import java.util.Scanner;

public class L2_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap he so a: ");
        a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        b = sc.nextInt();
        phuongtrinhbac1(a, b);
    }
    public static void phuongtrinhbac1(int a, int b) {
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT co vo so nghiem.");
            } else {
                System.out.println("PT vo nghiem.");
            }
        } else {
            System.out.println("Nghiem x=" + (-b / a));
        }
    }

}
