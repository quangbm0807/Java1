/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {

    ArrayList<Sach> ds = new ArrayList<>();

    public void nhap() {
        do {
            Sach sachmoi = new Sach();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ma sach: ");
            String maSach = sc.nextLine();
            sachmoi.setMaSach(maSach);
            System.out.println("Nhap vao ten sach: ");
            String tenSach = sc.nextLine();
            sachmoi.setTenSach(tenSach);
            System.out.println("Nhap vao nam xuat ban: ");
            int nam = sc.nextInt();
            sc.nextLine();
            sachmoi.setNamXB(nam);
            ds.add(sachmoi);
            System.out.println("Ban co muon nhap them khong?(Y/N)");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Danh sach da nhap: ");
        System.out.printf("|\t%-5s\t|\t%-10s\t|\t%-10s\t|", "STT", "Ma Sach", "Ten sach");
        for (int i = 0; i < ds.size(); i++) {
            Sach sach = ds.get(i);
            System.out.printf("\n|\t%-5d\t+\t%-10s\t+\t%-10s\t|", i + 1, sach.getMaSach(), sach.getTenSach(), sach.getNamXB());
        }

    }

    public void xuatSachLapTrinh() {
        System.out.println("\nCac sach co ten bat dau bang 'Lap Trinh':");
        System.out.printf("|\t%-5s\t|\t%-10s\t|\t%-10s\t|", "STT", "Ma Sach", "Ten sach");
        int stt = 1;
        for (Sach sach : ds) {
            if (sach.getTenSach().toLowerCase().startsWith("lap trinh ")) {
                System.out.printf("\n|\t%-5d\t+\t%-10s\t+\t%-10s\t|", stt, sach.getMaSach(), sach.getTenSach(), sach.getNamXB());
                stt++;
            }
        }
    }

    public void capNhatSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach can cap nhat: ");
        String maSach = sc.nextLine();
        boolean found = false;
        for (Sach sach : ds) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Nhap vao ma sach moi: ");
                String maSachmoi = sc.nextLine();
                System.out.println("Nhap vao ten sach moi: ");
                String tenSach = sc.nextLine();
                System.out.println("Nhap vao nam xuat ban moi: ");
                int nam = sc.nextInt();
                sach.setMaSach(maSachmoi);
                sach.setTenSach(tenSach);
                sach.setNamXB(nam);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sach co ma sach: " + maSach);
        }
    }

    public void sapXepSachTheoTen() {
        Collections.sort(ds, new Comparator<Sach>() {
            @Override
            public int compare(Sach sach1, Sach sach2) {
                return sach1.getTenSach().compareToIgnoreCase(sach2.getTenSach());
            }
        });
    }

}
