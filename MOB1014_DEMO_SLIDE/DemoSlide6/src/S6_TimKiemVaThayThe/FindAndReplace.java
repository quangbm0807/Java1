/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S6_TimKiemVaThayThe;

import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap thong tin");
            String chuoime =sc.nextLine();
            System.out.println("Nhap noi dung can tim");
            String chuoicon=sc.nextLine();
            System.out.println("Nhap noi dung can thay the: ");
            String thaythe=sc.nextLine();
            String resutl = chuoime.replaceAll(chuoicon, thaythe);
            System.out.println("Noi dung sau khi thay doi la: "+resutl);
            
    }
}
