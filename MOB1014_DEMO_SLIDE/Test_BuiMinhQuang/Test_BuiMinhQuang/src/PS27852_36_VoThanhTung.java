
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PS27852_36_VoThanhTung {

    static ArrayList<Double> dssoThuc = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void nhap() {
        do {
            System.out.print("nhap phan tu: ");
            double soThuc = sc.nextDouble();
            dssoThuc.add(soThuc);
            System.out.println("tiep tuc: y/n");
            sc.nextLine();
        } while (!sc.nextLine().equalsIgnoreCase("n"));
    }

    static void xuat() {
        System.out.print("mang vua nhap la: ");
        for (double x : dssoThuc) {
            System.out.print(x + "\t");
        }
    }

    static void tim() {
        boolean timSo = true;
        System.out.println("nhap gia tri can tim: ");
        double tim = sc.nextDouble();
        for (double x : dssoThuc) {
            if (x == tim) {
                System.out.println("gia tri can tim la: " + tim);
                timSo = false;
                break;
            }
        }
        if (timSo) {
            System.out.println("khong tim thay: " + tim);
        }
    }

    static void menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("1.nhap so thuc");
        System.out.println("2.Xuat ");
        System.out.println("3.xuat tang dan");
        System.out.println("4.tim phan tu trong mang");
        System.out.println("5.kiem tra mang rong");
        System.out.println("6.dao nguoc");
        System.out.println("7.them xoa sua");
        int chon = 0;
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                Collections.sort(dssoThuc);
                xuat();
                break;
            case 4:
                tim();
                break;
            case 5:
                if (dssoThuc.isEmpty()) {
                    System.out.println("Mang rong.");
                } else {
                    System.out.println("Mang khong rong.");
                    xuat();
                }
                break;
            case 6:
                Collections.reverse(dssoThuc);
                xuat();
                break;
            case 7:
                xuat();
                System.out.println(" ");
                System.out.println("1.them");
                System.out.println("2.xoa");
                System.out.println("3.sua");
                int chonCon = sc.nextInt();
                switch (chonCon) {
                    case 1:
                        System.out.print("Nhap gia tri them: ");
                        double them = sc.nextDouble();
                        dssoThuc.add(them);
                        System.out.println("da them vao mang");
                        xuat();
                        break;
                    case 2:
                        System.out.println("Nhap vi tri can xoa: ");
                        int vitri = sc.nextInt();
                        if (vitri >= 0&& vitri <dssoThuc.size()) {
                            dssoThuc.remove(vitri);
                            System.out.println("da xoa ");
                            xuat();
                        }
                        break;
                    case 3:
                         System.out.println("nhap vi tri can sua");
                        int vi = sc.nextInt();
                        if (vi >=0 && vi<dssoThuc.size()) {
                            System.out.println("nhap tri moi: ");
                            double GiaTrinew = sc.nextDouble();
                            dssoThuc.set(vi, GiaTrinew);
                            System.out.println("da sua vi tri trong mang");
                            xuat();
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
