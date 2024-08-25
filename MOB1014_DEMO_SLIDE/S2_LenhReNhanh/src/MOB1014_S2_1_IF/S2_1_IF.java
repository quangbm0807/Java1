package MOB1014_S2_1_IF;

import java.util.Scanner;

public class S2_1_IF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem: ");
        float diem = sc.nextFloat();
        if (diem >= 5) {
            System.out.println("Dau");
        } else {
            System.out.println("Rot");
        }
    }
}
