/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab2;

import static MOB1014_Lab2.L2_B1.phuongtrinhbac1;
import java.util.Scanner;

public class L2_B4 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        int chon;
        boolean tiepTuc;
        do {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("|   1. Tính phương trình bậc 1.                 |");
            System.out.println("|   2. Tính phương trình bậc 2.                 |");
            System.out.println("|   3. Tính tiền điện tiêu thụ.                 |");
            System.out.println("|   4. Thoát chương trình.                      |");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("|................Chọn chức năng:................|");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            chon =5;
                    try{
                        chon = sc.nextInt();
                    }catch(Exception e) {
                        System.out.println("Hay nhap vao 1 so.");
                        sc.nextLine();
                    }
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    int a, b;
                    System.out.println("Nhap he so a: ");
                    a = sc.nextInt();
                    System.out.println("Nhap he so b: ");
                    b = sc.nextInt();
                    phuongtrinhbac1(a, b);
                    break;
                case 2:
                    L2_B2.phuongtrinhbac2();
                    break;
                case 3:
                    L2_B3.tiendien();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. MỜI BẠN NHẬP LẠI.");
                    menu();
            }
        } while (chon != 4);
        System.out.println("CẢM ƠN BẠN ĐÃ SỬ DỤNG CHƯƠNG TRÌNH!");
        sc.close();
    }
}
