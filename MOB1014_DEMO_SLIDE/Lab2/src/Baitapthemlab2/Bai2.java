/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapthemlab2;
import MOB1014_S2_1_IF.S2_3_Diem;
import baitapthemLab1.bai4;
import MOB1014_Lab2.L2_B3;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        menu();
    }
        public static void sochinhphuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int number = scanner.nextInt();

        boolean sochinhphuong = false;
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                sochinhphuong = true;
                break;
            }
        }

        if (sochinhphuong) {
            System.out.println(number + " là số chính phương.");
        } else {
            System.out.println(number + " không là số chính phương.");
        }
    }
     public static void menu() {
        Scanner sc = new Scanner(System.in);

        int chon;
        do {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("|   1. Kiem tra so nguyen to.                 |");
            System.out.println("|   2. Kiem tra so chinh phuong.                 |");
            System.out.println("|   3. Tinh tien dien tieu thu.                 |");
            System.out.println("|   4. Xep loai hoc sinh.                      |");
             System.out.println("|   5.Thoat chuong trinh.                      |");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("|................Chon chuc nang:................|");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap vao 1 so!");
                sc.nextLine();
            }
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    baitapthemLab1.bai4.songuyento();
                      ;
                    break;
                case 2:
                    sochinhphuong();
                    ;
                    break;
                case 3:
                    Bai1.tiendien();
                    break;
                case 4:
                    MOB1014_S2_1_IF.S2_3_Diem.diem();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. MỜI BẠN NHẬP LẠI.");
                    menu();
            }
        } while (chon != 5);
        System.out.println("CẢM ƠN BẠN ĐÃ SỬ DỤNG CHƯƠNG TRÌNH!");
        sc.close();
    }
}

