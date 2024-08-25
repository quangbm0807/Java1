/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab2;

import java.util.Scanner;

public class L2_B3 {

    public static void main(String[] args) {
        tiendien();
    }

    public static void tiendien() {
        Scanner sc = new Scanner(System.in);
        int sodien;
        do {
            System.out.println("Hay nhap so dien tieu thu.");
            sodien = sc.nextInt();
            if (sodien < 0) {
                System.out.println("So khong hop le, hay nhap lai.");
            }
        } while (sodien < 0);
        if (sodien <= 50) {
            System.out.println("So kg dien la: " + sodien);
            System.out.println("So tien dien la: " + (sodien * 1000));
        } else {
            System.out.println("So kg dien la: " + sodien);
            System.out.println("So kg dien vuot han muc la: " + (sodien - 50));
            System.out.println("So tien dien la: " + ((50 * 1000) + (sodien - 50) * 1200));
        }

    }
}
