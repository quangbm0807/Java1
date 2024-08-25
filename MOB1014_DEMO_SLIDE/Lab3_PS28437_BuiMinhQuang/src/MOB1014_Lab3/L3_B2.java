/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class L3_B2 {
    public static void main(String[] args) {
        bangcuuchuong();
    }
    public static void bangcuuchuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bang cuu chuong can xem.");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int s=n*i;
            System.out.printf("%d *%2d = %2d\n",n,i,s);
            
        }
    }
}

