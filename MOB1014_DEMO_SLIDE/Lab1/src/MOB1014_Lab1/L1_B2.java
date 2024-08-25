/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab1;

import java.util.Scanner;
public class L1_B2 {
    public static void main(String[] args) {
        int dai, rong;
        float chuvi, dientich, canhnho;
        Scanner in = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        dai = in.nextInt();
        System.out.print("Chieu rong: ");
        rong = in.nextInt();
        chuvi = (dai + rong)*2;
        dientich= dai * rong;
        canhnho = Math.min(dai, rong);
        System.out.println("Chu vi: "+chuvi);
        System.out.println("Dien tich: "+dientich);
        System.out.println("Canh nho nhat: "+canhnho);
    }
}
