/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_DoiTuong;

//chuong trinh quan li sinh vien: Ten va diem

import java.util.Scanner;

public class S4_1_SinhVien {
    //định nghĩa các trường dữ liệu: tên, diểm.
    // khai báo các phương thức (hàm nhập ds sinh viên, xuất ds sinh viên, tính học lực, thêm 1 sv, xóa 1 sv
    String hoten;
    double diem;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Ten SV");
        hoten = sc.nextLine();
        diem = sc.nextDouble();
    }
    public void Xuat(){
        System.out.println("SV vua nhap la: ");
        System.out.println("");
    }
}
