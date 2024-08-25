import java.util.ArrayList;
import java.util.Scanner;

public class S5_1 {
    ArrayList<Double> a = new ArrayList<Double>();

    public static void main(String[] args) {
        S5_1 s = new S5_1();
        s.nhapmang();
        s.xuatmang();
    }

    public void nhapmang() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhap phan tu thu a[%d]\n", i + 1);
            double d = sc.nextDouble();
            a.add(d);
        }
    }

    public void xuatmang() {
        for (double item : a) {
            System.out.println("Mang vua nhap la: " + item);
        }
    }
}
