/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap ho ten: ");
            hoTen = scanner.nextLine();
            if (hoTen == null | hoTen.equals("")) {
                System.out.println("Ho ten khong hop le!");
            } else {
                break;
            }
        } while (true);

        Data ds = new Data();
        do {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (ds.isEmail(email)) {
                break;
            }
            System.out.println("Email khong hop le!");
        } while (true);

        do {
            System.out.print("Nhap so dien thoai: ");
            phone = scanner.nextLine();
            if (ds.isPhone(phone)) {
                break;
            }
            System.out.println("SDT khong hop le!");
        } while (true);

        do {
            System.out.print("Nhap so CMND: ");
            cmnd = scanner.nextLine();

            if (ds.isCMND(cmnd)) {
                break;
            }
            System.out.println("CMND khong hop le!");
        } while (true);
    }

    public void xuat() {
        System.out.printf("Ho ten: %s - Email: %s - SDT: %s - CMND: %s \n", hoTen, email, phone, cmnd);
    }


}