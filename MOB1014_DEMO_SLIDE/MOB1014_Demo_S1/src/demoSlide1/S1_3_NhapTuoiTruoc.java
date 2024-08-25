package demoSlide1;

import java.util.Scanner;

public class S1_3_NhapTuoiTruoc {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        //xuat nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Toi la "+ten+" " +tuoi+ " tuoi");
    }
}
