/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthemLab1;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 so: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double max = Math.max(Math.max(a, b), c);
        double min = Math.min(Math.min(a, b), c);
        double sqrtMax = Math.sqrt(max);
        double sqrtMin = Math.sqrt(min);
        double absMax = Math.abs(max);
        double absMin = Math.abs(min);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Can bac 2 cua Max: " + sqrtMax);
        System.out.println("Can bac 2 cua Min: " + sqrtMin);
        System.out.println("Tri tuyet doi cua Max: " + absMax);
        System.out.println("Tri tuyet doi cua Min: " + absMin);
    }
}

