/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Extends;

public class TruongPhong extends NhanVien{
    private double LuongTrachNhiem;

    public TruongPhong(double LuongTrachNhiem) {
        this.LuongTrachNhiem = LuongTrachNhiem;
    }

    public TruongPhong(double LuongTrachNhiem, String hoTen, double Luong) {
        super(hoTen, Luong);
        this.LuongTrachNhiem = LuongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return LuongTrachNhiem;
    }

    public void setLuongTrachNhiem(double LuongTrachNhiem) {
        this.LuongTrachNhiem = LuongTrachNhiem;
    }
    
}
