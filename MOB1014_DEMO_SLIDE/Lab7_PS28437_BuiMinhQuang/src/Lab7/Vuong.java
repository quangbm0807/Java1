/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.util.Scanner;

public class Vuong extends ChuNhat {

   private  double canh;

    public Vuong() {
    }

    public Vuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    @Override
    public double getchuvi() {
        return canh * 4;
    }


   @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh");
        this.canh = sc.nextDouble();
    }
@Override
    public void xuat() {
        System.out.println("Do dai canh  la: " + canh);
        System.out.println("Chu vi la: " + getchuvi());
        System.out.println("Dien tich la: " + getdientich());
    }

}
