/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab1;

import java.util.Scanner;
public class L1_B3 {
    public static void main(String[] args) {
        double canh, ttlp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        canh = sc.nextDouble();
        ttlp = canh * canh * canh;
        //ttlp = Math.pow(canh, 3);
        System.out.println("The tich = "+ttlp);
        
    }
}
