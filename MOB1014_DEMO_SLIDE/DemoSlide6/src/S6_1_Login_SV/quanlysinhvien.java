package S6_1_Login_SV;

import java.util.ArrayList;
import java.util.Scanner;

public class quanlysinhvien {

    public static void main(String[] args) {
        ArrayList<String> qlsv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("Nhap ho va ten sinh vien thu " + i);
            String hoten = sc.nextLine();
            System.out.println("Ban co muon nhap nua khong?(khong nhap gi de thoat)");
            String chon = sc.nextLine();
            if (chon == null || chon.equals("")) {
                System.out.println("Ban da ket thuc nhap.");
                break;
            }
            qlsv.add(hoten);
            i++;
        } while (true);
        for (String itemHoTen : qlsv) {
            itemHoTen = itemHoTen.trim();
            if (itemHoTen.toLowerCase().startsWith("nguyen ") || itemHoTen.toLowerCase().endsWith(" tuan")) {
                String ho = itemHoTen.substring(0, itemHoTen.indexOf(" "));
                String ten = itemHoTen.substring(itemHoTen.lastIndexOf(" "));
                String tendem = itemHoTen.substring(itemHoTen.indexOf(" "), itemHoTen.lastIndexOf(" "));
                System.out.printf("%s %s %s\n", ho.toUpperCase(), tendem, ten.toUpperCase());
            }
            if(itemHoTen.contains(" My ")){
                System.out.println("Nhung nguoi co ten dem la My la: "+itemHoTen);
            }
        }
    }
}
