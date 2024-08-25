/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_S2_1_IF;

//nam 1m68

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao(cm): ");
        int cao = sc.nextInt();
        if(cao>=168){
            System.out.println("Dep");
        }else{
            System.out.println("Xau");
        }
    }
}
