package S5_MangNangCao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S5_MangNangCao {

    private ArrayList<String> a = new ArrayList<>();

    public void nhapmang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            String ch = sc.nextLine();
            a.add(ch);
        }
    }

    public void xuatmang() {
        int i = 0;
        for (String x : a) {
            System.out.printf("Phan tu thu %d la: %s\n", (i + 1), x);
            i++;
        }
        System.out.println("");
    }

    public void sapxep() {
        System.out.println("MANG SAU KHI SAP XEP: ");
        Collections.sort(a);
        xuatmang();
    }

    public void daonguoc() {
        System.out.println("MANG SAU KHI DAO NGUOC: ");
        Collections.reverse(a);
        xuatmang();
    }

    public void themphantu() {
        System.out.println("MANG SAU KHI THEM PHAN TU HUHU O VI TRI THU 3:");
        a.add(2, "huhu");
        xuatmang();
    }

    public void xoaphantu() {
        a.remove("huhu");
        System.out.println("MANG SAU KHI XOA PHAN TU HUHU LA:");
        xuatmang();
    }

    public void xoavareturn() {
        System.out.println("XOA VA RETURN PHAN TU THU 3 LA: " + a.remove(2));
        xuatmang();
    }

    public void thaydoi() {
        a.set(2, "KAKA");
        System.out.println("MANG SAU KHI THEM THAY DOI PHAN TU O VI TRI THU 3 THANH KAKA");
        xuatmang();
    }

    public void truyxuat() {
        System.out.println("PHAN TU O VI TRI THU 3 LA: " + a.get(2));
    }

    public void sophantu() {
        System.out.println("SO PHAN TU TRONG MANG LA: " + a.size());
    }

    public void vitri() {
        System.out.println("VI TRI CUA PHAN TU HOHO LA: " + a.indexOf("hoho") + 1);
    }
}
