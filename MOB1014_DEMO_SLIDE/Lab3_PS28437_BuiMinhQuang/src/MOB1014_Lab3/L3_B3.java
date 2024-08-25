/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab3;

import java.util.Scanner;
import java.util.Arrays;

public class L3_B3 {

    public static void nhapmang(int a[], int spt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < spt; i++) {
            System.out.println("Nhap phan tu thu " + i+1);
            a[i] = sc.nextInt();
        }
    }

    public static void xuatmang(int a[], int spt) {

        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < spt; i++) {
            System.out.printf("Phan tu thu %d la: %d\n", i+1, a[i]);
        }
    }

    public static void sapxep(int a[], int spt) {
        Arrays.sort(a);
        System.out.println("Sap xep mang.");
        xuatmang(a, spt);
    }
    public static void min(int a[], int spt) {
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("So nho nhat trong mang la: "+min);
    }
    public static void tbc(int a[]) {
        double tong = 0;
        int count = 0;
        for(int x:a){
            if(x%3==0){
                tong = tong +x;
                count++;
            }
        }
        System.out.println("Tong cac so chia het cho 3 trong mang la: "+(tong/count));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can nhap: ");
        int spt = sc.nextInt();
        int a[] = new int[spt];
        nhapmang(a, spt);
        xuatmang(a, spt);
        sapxep(a, spt);
        min(a,spt);
        tbc(a);
    }
}
