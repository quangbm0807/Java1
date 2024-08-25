
package bai3;

import java.util.Scanner;

public class album {
    static Scanner sc = new Scanner(System.in);
    private String maAlbum;
    private String tenAlbum;
    private double gia;

    public album() {
    }

    public album(String maAlbum, String tenAlbum, double gia) {
        this.maAlbum = maAlbum;
        this.tenAlbum = tenAlbum;
        this.gia = gia;
    }

    public String getMaAlbum() {
        return maAlbum;
    }

    public void setMaAlbum(String maAlbum) {
        this.maAlbum = maAlbum;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void nhap(){
        
        System.out.print("Nhap ma album: ");
        maAlbum = sc.nextLine();
        System.out.print("Nhap ten album: ");
        tenAlbum = sc.nextLine();
        System.out.print("Nhap gia album: ");
        gia = sc.nextDouble();
        sc.nextLine();
        
    }
    public void xuat(){
        System.out.printf("|%-12s",this.getMaAlbum());
        System.out.printf("|%-13s",this.getTenAlbum());
        System.out.printf("|%-12s",this.getGia());
        System.out.println("|");
    }
}
