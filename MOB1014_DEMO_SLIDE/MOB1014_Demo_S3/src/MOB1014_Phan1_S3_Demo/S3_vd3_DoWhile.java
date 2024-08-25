/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Phan1_S3_Demo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class S3_vd3_DoWhile {
    public static void main(String[] args) {
        diemtb();
    }
    public static void diemtb() {
        float diem;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap diem: ");
            diem = sc.nextFloat();
            if(diem<0||diem>10){
                System.out.println("Hay nhap diem tu 0-10");
            }
        }while(diem<0||diem>10);
        System.out.println("Diem ban vua nhap la: "+diem);
    }
}
