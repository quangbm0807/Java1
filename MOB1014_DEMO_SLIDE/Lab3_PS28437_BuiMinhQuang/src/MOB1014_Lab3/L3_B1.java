
package MOB1014_Lab3;

import java.util.Scanner;

public class L3_B1 {
        public static void main(String[] args) {
        songuyento();
    }
    public static void songuyento() {
        boolean songuyento = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        if (n==1||n==0){
            songuyento= false;
        }
        else{
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                songuyento = false;
                break;
            }
        }
        if (songuyento && n > 1) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
      }
        
    }
}
