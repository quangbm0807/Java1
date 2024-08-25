
package MOB1014_Lab4.Bai4;


import java.util.Scanner;

public class Lab4Bai4 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenSP;
        double donGia, giamGia;
        System.out.println("Ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Giam gia: ");
        giamGia = sc.nextDouble();
        sc.nextLine();
        SanPham sp1 = new SanPham();
        sp1.setTenSP(tenSP);
        sp1.setDonGia(donGia);
        sp1.setGiamGia(giamGia);
        sp1.xuat();
    }   
}
