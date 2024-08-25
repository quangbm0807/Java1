/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S6_1_Login_SV;

import java.util.Scanner;

public class S6_1_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String name = sc.nextLine();
        System.out.println("Nhap pass: ");
        String pass = sc.nextLine();
        String user = "phong", password="ps1234";
        if(name.equals(user)&&password.equals(pass)&&pass.length()>=6){
            System.out.println("Dang nhap thanh cong");
        }else{
            System.out.println("Dang nhap khong thanh cong");
        }
    }
}
