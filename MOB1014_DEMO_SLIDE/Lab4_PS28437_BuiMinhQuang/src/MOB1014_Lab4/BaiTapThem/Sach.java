/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab4.BaiTapThem;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach {
    private ArrayList<Sach> list = new ArrayList<>();

    String maSach;
    String tenSach;
    String nxb;
    double gia;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nxb, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Ma sach: ");
//            maSach = sc.nextLine();
//            if (maSach == null || maSach.equals("")) {
//                System.out.println("Nhap lai Ma Sach");
//            } else {
//                break;
//            }
//        } while (true);
//        System.out.println("Ten sach: ");
//        tenSach = sc.nextLine();
//        System.out.println("Nha xuat ban: ");
//        nxb = sc.nextLine();
//        System.out.println("Gia tien: ");
//        gia = sc.nextDouble();
//        Sach sachnew = new Sach();
//        list.add(sachnew);
//    }
    public void nhap() {
    Scanner sc = new Scanner(System.in);
    boolean tiepTucNhap = true;
    
    while (tiepTucNhap) {
        System.out.println("Ma sach: ");
        maSach = sc.nextLine();
        if (maSach == null || maSach.equals("")) {
            System.out.println("Nhap lai Ma Sach");
            continue;
        }
        
        System.out.println("Ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nha xuat ban: ");
        nxb = sc.nextLine();
        System.out.println("Gia tien: ");
        gia = sc.nextDouble();
        sc.nextLine();
        
        Sach sachMoi = new Sach(maSach, tenSach, nxb, gia);
        list.add(sachMoi);
        
        System.out.println("Ban co muon nhap tiep? (y/n)");
        String tiepTuc = sc.nextLine();
        if (!tiepTuc.equalsIgnoreCase("y")) {
            tiepTucNhap = false;
        }
    }
}


    public void xuat() {
    for (Sach sachnew : list) {
        System.out.printf("\nMaSach: %s\tTenSach: %s\tNXB: %s\tGia: %s\t", sachnew.getMaSach(), sachnew.getTenSach(), sachnew.getNxb(), sachnew.getGia());
    }
}

}
