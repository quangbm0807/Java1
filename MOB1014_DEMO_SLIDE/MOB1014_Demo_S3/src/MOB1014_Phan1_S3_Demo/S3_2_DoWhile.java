/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Phan1_S3_Demo;

import java.util.Scanner;

public class S3_2_DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so");
            n = sc.nextInt();
            if(n<0){
                System.out.println("Hay nhap nhung so lon hon 0");
            }
        } while (n < 0);
    }
}
