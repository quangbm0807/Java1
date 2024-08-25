
package MOB1014_Lab4.Bai3;

import java.util.Scanner;


public class Lab4Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenSP;
        double donGia, giamGia;
        System.out.println("Ten san pham: ");
        tenSP= sc.nextLine();
        System.out.println("Don gia: ");
        donGia= sc.nextDouble();
        System.out.println("Giam gia: ");
        giamGia=sc.nextDouble();
        sc.nextLine();
        SanPham sp1 = new SanPham(tenSP, donGia, giamGia);
        
        System.out.println("Ten san pham: ");
        tenSP= sc.nextLine();
        System.out.println("Don gia: ");
        donGia= sc.nextDouble();
        SanPham sp2 = new SanPham(tenSP, donGia);
        sp1.xuat();
        sp2.xuat();
    }
}
