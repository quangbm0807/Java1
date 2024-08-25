/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Split;

import java.util.Scanner;


public class Split {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao day so (cach nhau bang dau ,)");
        String dayso = sc.nextLine();
        String [] daySo = dayso.split(",");
           System.out.println("Cac so chan trong chuoi la: ");
        for( String so:daySo){
            int x = Integer.parseInt(so);
            if(x%2==0){
                System.out.printf("%d\t",x);
            }
        }
    }
}
