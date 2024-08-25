/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Extends;

public class NhanVien {
    //thuoc tinh
    private String hoTen;
    private double Luong;
    // contructor
      public NhanVien() {
    }

    public NhanVien(String hoTen, double Luong) {
        this.hoTen = hoTen;
        this.Luong = Luong;
    }
    
    
    //getset


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    // cac ham tinh toan
    public void nhap(){
        
    }
   public void xuat(){
        
    }
}
