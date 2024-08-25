/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_S2_1_IF;

import java.util.Scanner;


public class thuethunhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhap(trieu): ");
        float thunhap = sc.nextFloat();
        if (thunhap >= 30) {
            System.out.println("20%: "+thunhap*20/100);
        } else if (thunhap >= 15 && thunhap < 30) {
            System.out.println("15%:"+thunhap*15/100);
        } else if (thunhap < 15 && thunhap >= 9) {
            System.out.println("10%:"+thunhap*10/100);
        } else {
            System.out.println("Khong can dong thue");
        }
    }
}
