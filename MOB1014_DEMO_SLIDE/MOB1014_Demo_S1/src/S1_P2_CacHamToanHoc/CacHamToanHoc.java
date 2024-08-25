
package S1_P2_CacHamToanHoc;
//nhap tu ban phim 2 so --> tim max, min, can bac 2, tri tuyet doi.

import java.util.Scanner;


public class CacHamToanHoc {
    public static void main(String[] args) {
        double a,b,min,max;
        double cb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        min = Math.min(a, b);
        max = Math.max(a, b);
        cb2 = Math.sqrt(a);
        System.out.println("So lon nhat la: "+max);
        System.out.println("So nho nhat la: "+min);
        double tong, cb2tong;
        tong = a + b;
        cb2tong = Math.sqrt(tong);
        System.out.println("Tong cua 2 so la: "+tong);
        System.out.println("Can bac 2 cua tong 2 so la: "+cb2tong);
        double nguyentren, nguyenduoi;
        nguyentren = Math.ceil(tong);
        nguyenduoi = Math.floor(tong);
        System.out.println("So nguyen tren cua tong 2 so la: "+nguyentren);
        System.out.println("So nguyen duoi cua tong 2 so la: "+nguyenduoi);
        double lamtron;
        lamtron = Math.round(tong);
        System.out.println("Lam tron tong cua 2 so la: "+lamtron);
        double random;
        random = Math.random();
        System.out.println("So tu dong duoc tao la: "+random);
    }
}
