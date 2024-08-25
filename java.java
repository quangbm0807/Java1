import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int chon;
        boolean tiepTuc = true;
        do {
            System.out.println("1. Giai phuong trinh cong.");
            System.out.println("2. Giai phuong trinh tru.");
            System.out.println("0. Thoat chuong trinh.");
            System.out.print("Chon chuc nang: ");
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap mot so!");
                sc.next();
            }
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("Hihi");;
                    break;
                case 2:
                    System.out.println("Huhu");;
                    break;
                case 0:
                    tiepTuc = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Moi ban nhap lai.");
                    menu();
                    break;
            }
            sc.close();
            System.out.print("Ban co muon tiep tuc su dung chuong trinh khong? (Y hoac y de tiep tuc): ");
            String luaChon = sc.nextLine();

            if (luaChon.equalsIgnoreCase("Y") || luaChon.equalsIgnoreCase("y")) {
                tiepTuc = true;
            } else {
                System.out.println("Thoat chuong trinh.");
                tiepTuc = false;
                break;
            }
            
        } while (tiepTuc);
        System.out.println("Cam on ban da su dung chuong trinh!");
        sc.close();
    }
}
