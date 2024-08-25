/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLamThemLab3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author buimi
 */
public class ChucNang {

    public static void main(String[] args) {
        float a[] = Nhapspt();
        nhap(a, a.length);
        xuat(a, a.length);
        tangdan(a, a.length);
        giamdan(a, a.length);
        trungbinh(a, a.length);
    }

    public static float[] Nhapspt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        float a[] = new float[n];
        return a;
    }

    public static void nhap(float a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            a[i] = sc.nextFloat();
            sc.nextLine();
        }
    }

    public static void xuat(float a[], int n) {
        int i = 0;
        for (float x : a) {
            System.out.println("Phan tu thu " + (i + 1) + ": " + x);
            i++;
        }
    }

    public static void tangdan(float a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan la: ");
        xuat(a, n);
    }

    public static void giamdan(float a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep giam dan la: ");
        xuat(a, n);
    }

    public static void trungbinh(float a[], int n) {
        float tong = 0;
        for (float x : a) {
            tong += x;
        }
        System.out.println("Trung binh cong cac so trong mang la: " + (tong / n));
    }

    public static void tongchia2(float a[], int n) {
        float tong = 0;
        for (float x : a) {
            if (x % 2 == 0) {
                tong += x;
            }
        }
        System.out.println("Tong cac so chia het cho 2 trong mang la: " + tong);
    }

    public static void tongchia3(float a[], int n) {
        float tong = 0;
        for (float x : a) {
            if (x % 3 == 0) {
                tong += x;
            }
        }
        System.out.println("Tong cac so chia het cho 3 trong mang la: " + tong);
    }

    public static void tongchia2va5(float a[], int n) {
        float tong = 0;
        for (float x : a) {
            if (x % 2 == 0 && x % 5 == 0) {
                tong += x;
            }
        }
        System.out.println("Tong cac so chia het cho 2 va 5 trong mang la: " + tong);
    }

    public static void thongtinsinhvien() {
        Scanner sc = new Scanner(System.in);
        int max = 100; // Số lượng tối đa sinh viên có thể nhập
        String[] hoten = new String[max];
        double[] diemm = new double[max];
        int count = 0;

        do {
            try {
                System.out.printf("Nhap thong tin sinh vien thu %d: ", count + 1);

                System.out.print("Ho va ten: ");
                String hoTen = sc.nextLine();
                hoten[count] = hoTen;

                System.out.print("Diem: ");
                double diem = sc.nextDouble();
                diemm[count] = diem;
                count++;
                System.out.print("Ban co muon tiep tuc nhap thong tin sinh vien khong?(N de thoat): ");
                String luaChon = sc.nextLine();

                if (luaChon.equalsIgnoreCase("N")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Diem la 1 so.");
            }

        } while (count < max);
        xuatsinhvien(hoten, diemm, count);
        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        sc.close();
    }

    public static void xuatsinhvien(String[] hoten, double[] diemm, int count) {
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < count; i++) {
            System.out.println("STT         Ten         Diem");
            System.out.printf("%d\t", count);
            System.out.printf("%s\t", hoten[i]);
            System.out.printf("%f\t", diemm[i]);
            System.out.println();
        }
    }

    public static void tongsochan(float a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri can dung.");
        int s = sc.nextInt();
        int count = 0;
        for (float x : a) {
            if (count >= s) {
                break;
            }
            System.out.printf("%s\t", x);
            count++;
        }
        float tong = 0;
        for (float x : a) {
            if (x % 2 == 0) {
                tong += x;
            }
        }
        System.out.println("Tong cac so chan trong mang la: " + tong);
    }

    public static void tostring(float a[]) {
        Arrays.sort(a);
        System.out.println("Mang tang dan: " + Arrays.toString(a));
    }

    public static float min(float[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử");
        }

        float min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;
    }

    public static void sonhonhat(float a[]) {
        xuat(a, a.length);
        float nhonhat = min(a);
        System.out.println("So nho nhat trong mang la: " + nhonhat);
    }

    public static void nhapTuDong(int soLuong, float[] a) {
        Random random = new Random();

        for (int i = 0; i < soLuong; i++) {
            a[i] = random.nextFloat() * 100 + 1;
        }
    }

    public static void xuatSoLe(float[] a, int n) {
        System.out.println("Cac so le trong mang: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void xuatSoChan(float[] a, int n) {
        System.out.println("Cac so chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static int demSoChan(float[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int demSoLe(float[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void chanle(float []a) {
        int soLuongSoChan = demSoChan(a, a.length);
    int soLuongSoLe = demSoLe(a, a.length);
    System.out.println("So luong so chan: " + soLuongSoChan);
    System.out.println("So luong so le: " + soLuongSoLe);
    }
    public static void xuatPhanTuDuong(float[] a, int n) {
    System.out.println("Cac phan tu duong trong mang: ");
    for (int i = 0; i < n; i++) {
        if (a[i] > 0) {
            System.out.print(a[i] + " ");
        }
    }
    System.out.println();
}

public static void xuatPhanTuAm(float[] a, int n) {
    System.out.println("Cac phan tu am trong mang: ");
    for (int i = 0; i < n; i++) {
        if (a[i] < 0) {
            System.out.print(a[i] + " ");
        }
    }
    System.out.println();
}

 public static void thongTinSinhVien() {
        Scanner sc = new Scanner(System.in);
        int max = 100; // Số lượng tối đa sinh viên có thể nhập
        String[] hoTen = new String[max];
        double[] diem = new double[max];
        int count = 0;
        
        do {
            try {
                System.out.printf("Nhap thong tin sinh vien thu  %d: ", count + 1);

                System.out.print("Ho va ten: ");
                String ten = sc.nextLine();
                hoTen[count] = ten;

                System.out.print("Diem: ");
                double diemSV = sc.nextDouble();
                diem[count] = diemSV;
                count++;
                sc.nextLine(); // Đọc bỏ dòng mới sau khi nhập điểm

                System.out.print("Ban co muon tiep tuc nhap thong tin sinh vien khong: ");
                String luaChon = sc.nextLine();

                if (luaChon.equalsIgnoreCase("N")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Diem la mot so.");
            }
            
        } while (count < max);
        
        sapXepTheoDiemGiamDan(hoTen, diem, count);
        xuatDanhSachSinhVien(hoTen, diem, count);
        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        sc.close();
    }
    
    public static void sapXepTheoDiemGiamDan(String[] hoTen, double[] diem, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (diem[i] < diem[j]) {
                    // Hoán đổi thông tin của hai sinh viên
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;

                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                }
            }
        }
    }
    
    public static void xuatDanhSachSinhVien(String[] hoTen, double[] diem, int count) {
        System.out.println("Danh sach sinh vien:");
        System.out.println("STT\tHo va ten\tDiem");
        
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\t%s\t%.2f\n", i + 1, hoTen[i], diem[i]);
        }
    }
}
