/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_S2_1_IF;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class S2_2_IF_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diem: ");
        float diem = sc.nextFloat();
        if (diem >= 6.5 && diem < 7) {
            System.out.println("Kha.");
        } else if (diem >= 5 && diem <= 6) {
            System.out.println("Trung binh.");
        } else {
            System.out.println("Yeu");
        }
    }
}
