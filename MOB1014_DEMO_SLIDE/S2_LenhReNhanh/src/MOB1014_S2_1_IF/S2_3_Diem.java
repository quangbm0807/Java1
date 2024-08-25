/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_S2_1_IF;

import java.util.Scanner;

public class S2_3_Diem {
    public static void main(String[] args) {
        diem();
    }
    public static void diem() {
        Scanner sc = new Scanner(System.in);
        float diem;

        do {
            System.out.println("Nhap vao diem: ");
            diem = sc.nextFloat();

            if (diem > 10 || diem < 0) {
                System.out.println("Diem khong hop le. Vui long nhap lai.");
            }
        } while (diem > 10 || diem < 0);
        
        if (diem >= 9.0) {
            System.out.println("Xuat sac.");
        } else if (diem >= 8 && diem < 9) {
            System.out.println("Gioi.");
        } else if (diem < 8 && diem >= 7) {
            System.out.println("Kha.");
        } else if (diem >= 5 && diem < 7) {
            System.out.println("Trung binh.");
        } else {
            System.out.println("Yeu");
        }
    }
}

