/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthemLab1;

import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thuc: ");
        double n = sc.nextDouble();
        double nguyentren = Math.ceil(n);
        double nguyenduoi = Math.floor(n);
        double lamtron = Math.round(n);
        System.out.println("So vua nhap la: "+n);
        System.out.println("Phan nguyen tren la: "+nguyentren);
        System.out.println("Phan nguyen duoi la: "+nguyenduoi);
        System.out.println("Lam tron la: "+lamtron);
    }
}
