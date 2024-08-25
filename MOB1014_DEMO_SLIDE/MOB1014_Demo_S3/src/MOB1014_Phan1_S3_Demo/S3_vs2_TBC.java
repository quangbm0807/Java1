/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Phan1_S3_Demo;


public class S3_vs2_TBC {
    public static void main(String[] args) {
        tbc();
    }
    public static void tbc() {
        int sum = 0;
        int count = 0;
        int x = 27;
        while (x <= 250) {
            if (x % 3 == 0) {
                sum += x;
                count++;
            }
            x++;
        }

        if (count > 0) {
            double tb = (double) sum / count;
            System.out.println("Trung binh cong cac so chia het cho 3 tu 27 den 250 la: " + tb);
        }
    }
}

