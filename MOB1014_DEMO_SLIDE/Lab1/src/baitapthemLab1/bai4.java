/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthemLab1;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        songuyento();
    }
    public static void songuyento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("1 khong phai la so nguyen to");
        }
        else{
            boolean songuyento = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                songuyento = false;
                break;
            }
        }
        if (songuyento && n > 1) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
      }
        
    }
}

