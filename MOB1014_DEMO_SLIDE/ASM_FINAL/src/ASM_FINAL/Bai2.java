/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_FINAL;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    ArrayList<SanPham> ds = new ArrayList<>();
    ArrayList<String> danhSachMaQuat = new ArrayList<>();

    public void nhap(ArrayList<SanPham> ds) {
        Scanner sc = new Scanner(System.in);
        do {
            SanPham sp = new SanPham();
            System.out.println("Nhap vao ma quat: ");
            String maQuat = sc.nextLine();
          while (!isValidMaQuat(maQuat) || maQuatDaTonTai(maQuat)) {
            if (!isValidMaQuat(maQuat)) {
                System.out.println("Ma quat khong hop le. Vui long nhap lai!");
            } else {
                System.out.println("Ma quat da ton tai. Vui long nhap lai!");
            }
            System.out.print("Nhap ma quat: ");
            maQuat = sc.nextLine();
        }
        danhSachMaQuat.add(maQuat);
        sp.setMaQuat(maQuat);
            System.out.println("Nhap vao ten quat: ");
            String tenQuat = sc.nextLine();
            sp.setTenQuat(tenQuat);
            do {
                try {
                    System.out.println("Nhap vao gia quat: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    if (gia >= 0) {
                        sp.setGia(gia);
                        break;
                    } else {
                        System.out.println("Gia quat khong duoc am. Vui long nhap lai.");
                    }
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println("Gia quat phai la mot so. Vui long nhap lai!");
                }
            } while (true);

            ds.add(sp);
            System.out.println("Ban co muon tiep tuc nhap khogn? (Y/N)");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

private boolean isValidMaQuat(String maQuat) {
    String pattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]+$";
    return maQuat.matches(pattern);
}


    private boolean maQuatDaTonTai(String maQuat) {
        for (String ma : danhSachMaQuat) {
            if (ma.equalsIgnoreCase(maQuat)) {
                return true;
            }
        }
        return false;
    }

    public void xuat(ArrayList<SanPham> ds) {
        System.out.println("Danh sach san pham la: ");
        System.out.printf("|\t%-5s\t|\t%-10s\t|\t%-10s\t|\t%-10s\t|", "STT", "Ma Quat", "Ten Quat", "Gia Quat");
        for (int i = 0; i < ds.size(); i++) {
            SanPham sp = ds.get(i);
            System.out.printf("\n|\t%-5d\t|\t%-10s\t|\t%-10s\t|\t%-10s\t|", i + 1, sp.getMaQuat(), sp.getTenQuat(), sp.getGia());
        }
    }

    public void timKiemQuatTheoTenGanDung(ArrayList<SanPham> ds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten quat can tim: ");
        String tenQuat = sc.nextLine();
        int i = 1;
        System.out.printf("|\t%-5s\t|\t%-10s\t|\t%-10s\t|\t%-10s\t|", "STT", "Ma Quat", "Ten Quat", "Gia Quat");
        for (SanPham sp : ds) {
            if (sp.getTenQuat().toLowerCase().contains(tenQuat.toLowerCase())) {
                System.out.printf("\n|\t%-5d\t|\t%-10s\t|\t%-10s\t|\t%-10s\t|", i, sp.getMaQuat(), sp.getTenQuat(), sp.getGia());
            }
            i++;
        }
    }
}
