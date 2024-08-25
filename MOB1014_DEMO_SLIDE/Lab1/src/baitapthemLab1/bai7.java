/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthemLab1;

import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();
        System.out.println("Cac so nho hon n " + n + " là:");
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
    }
}

