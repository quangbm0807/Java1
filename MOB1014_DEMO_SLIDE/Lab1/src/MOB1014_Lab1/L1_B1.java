/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab1;

import java.util.Scanner;
public class L1_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        float jv1, csdl, nmlt, diemTB;
        System.out.print("Ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem JAVA1: ");
        jv1 = sc.nextFloat();
        System.out.print("Nhap diem CSDL: ");
        csdl = sc.nextFloat();
        System.out.print("Nhap diem NMLT: ");
        nmlt = sc.nextFloat();
        diemTB = (jv1 + csdl + nmlt)/3;
        System.out.println("JAVA1: "+jv1 +" CSDL: "+csdl + " NMLT: "+nmlt);
        System.out.println("Ho ten SV: "+hoTen +" Diem TB: "+diemTB);
       
    }
}
