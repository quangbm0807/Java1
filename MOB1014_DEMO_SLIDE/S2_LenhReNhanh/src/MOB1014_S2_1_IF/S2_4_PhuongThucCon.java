/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_S2_1_IF;

import java.util.Scanner;


public class S2_4_PhuongThucCon {
    //phuong thuc cong 2 so
    public static void cong() {
        //noi dung cong
        System.out.println("Chuong trinh tong 2 so.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Tong 2 so la: "+(a+b));
    }
        public static void tru() {
        //noi dung tru
            System.out.println("Chuong trinh hieu 2 so.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        int hieu = Math.abs(a-b);
        System.out.println("Hieu 2 so la: "+hieu);
    }
    public static void main(String[] args) {
        cong();
        tru();
    }
    //phuoc thuc tru 2 so
    //ham main ==> goi ham cong va ham tru
}
