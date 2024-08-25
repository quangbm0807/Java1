/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab1;

import java.util.Scanner;
public class L1_B4 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = scan.nextDouble();
        System.out.println("Nhap he so b: ");
        b = scan.nextDouble();
        System.out.println("Nhap he so c: ");
        c = scan.nextDouble();
        delta = (b * b) - (4 * a * c);
        System.out.println("Can delta = "+ Math.sqrt(delta));
        
    }
}
