/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Extends;


public class LaoCong extends NhanVien{
    private double luongGio;
    private int gioLam;
    
    public LaoCong() {
    }

    public LaoCong(double luongGio, int gioLam) {
        this.luongGio = luongGio;
        this.gioLam = gioLam;
    }

    public LaoCong(String hoTen, double Luong,double luongGio, int gioLam) {
        super(hoTen, Luong);
        this.luongGio = luongGio;
        this.gioLam = gioLam;
    }
    public double tinhThuNhap(){
    return luongGio*gioLam;
}
}
