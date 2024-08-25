/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Phan1_S3_Demo;

import java.util.Scanner;

public class S3_7_Mang {

    public static void nhapmang(int a[],int spt) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<spt;i++){
            System.out.println("Nhap phan tu thu "+i);
            a[i]=sc.nextInt();
        }
    }

    public static void xuatmang(int a[], int spt) {
        
        System.out.println("Mang vua nhap la: ");
        for(int i=0; i<spt;i++){
            System.out.printf("Phan tu thu %d la: %d\n",i,a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can nhap: ");
        int spt = sc.nextInt();
        int a[] = new int [spt];
        nhapmang(a,spt);
        xuatmang(a,spt);
    }
}
