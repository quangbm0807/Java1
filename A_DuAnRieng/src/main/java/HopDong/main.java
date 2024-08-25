package HopDong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<HopDong> ds = new ArrayList<>();

    static void menu() {
        int chon;
        do {
            System.out.println("==========Chuc-nang-quan-ly-hop-dong==========");
            System.out.println("|1.Nhap danh sach hop dong                   |");
            System.out.println("|2.Xuat danh sach hop dong                   |");
            System.out.println("|3.Tim  hop dong theo ma trong danh sach     |");
            System.out.println("|4.Tim  hop dong theo ten trong danh sach    |");
            System.out.println("|5.Xuat nhung hop dong da duoc ky            |");
            System.out.println("|6.Xuat nhung hop dong chua duoc ky          |");
            System.out.println("|7.Tim va xoa danh sach hop dong             |");
            System.out.println("|8.Cap nhat thong tin hop dong               |");
            System.out.println("|0.Thoat chuong trinh                        |");
            System.out.println("==============================================");
            System.out.print("moi chon chuc nang: ");
            try {//nay kiem tra coi nguoi dung co nhap vao chuoi ky tu hay khong
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ban khong duoc nhap chuoi ky tu:");
                System.out.println("Hay nhap lai mot con so nguyen:");
                break;
            }

            switch (chon) {
                case 1:
                    NhapDS();
                    break;
                case 2:
                    SapXep();
                    XuatDS();
                    break;
                case 3:
                    SapXep();
                    TimHD();
                    break;
                case 4:
                    SapXep();
                    TimHDTheoTen();
                    break;
                case 5:
                    XuatHDDaKy();
                    break;
                case 6:
                    XuatHDChuaKy();
                    break;
                case 7:
                    xoa();
                    break;
                case 8:
                    CapNhatTheoMa();
                    break;
                case 0:
                    System.out.println("tam biet!!!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong dung");
                    System.out.println("hay nhap lai");
            }
        } while (true);
    }

    static void NhapDS() {
        do {
            HopDong hd = new HopDong();
            System.out.println("Dang o trang thai nhap thong tin hop dong`");
            do {
                System.out.print("Nhap ma hop dong: ");
                hd.setMaHD(sc.nextLine());

                if (tonTai(hd.getMaHD())) {
                    System.out.println("Ma hop dong da ton tai. Vui long nhap lai.");
                }
            } while (tonTai(hd.getMaHD()));

            hd.nhap();
            ds.add(hd);
            System.out.println("");
            System.out.println("Nhap Thong tin thanh cong!!!!!!!!");
            System.out.print("Tiep tuc (Y/n): ");
        } while (!sc.nextLine().equalsIgnoreCase("n"));
    }

    static boolean tonTai(String MaHD) {
        boolean kt = false;
        for (HopDong HD : ds) {
            if (HD.getMaHD().equalsIgnoreCase(MaHD)) {
                return true;
            }
        }
        return false;
    }

    static void SapXep() {
        Comparator<HopDong> SXTen = new Comparator<HopDong>() {
            @Override
            public int compare(HopDong o1, HopDong o2) {
                return o1.getTenHD().compareTo(o2.getTenHD());
            }
        };
        Collections.sort(ds, SXTen);
    }

    static void XuatDS() {
        int i = 1;
        if (ds.isEmpty()) {
            System.out.println("Hien tai danh sach trong");
        } else {
            System.out.println("=====================================================Danh-sach-hop-dong==================================================================");
            System.out.println("| STT | Ma hop dong |    Ten hop dong    |       Nguyen Van A     |       Nguyen Van B     | Ngay bat dau | Ngay ket thuc |  trang thai |");
            for (HopDong HD : ds) {
                System.out.printf("|%-5s", i);
                HD.xuat();
                i++;
            }
            System.out.println("=========================================================================================================================================");
        }
    }

    static void XuatHDDaKy() {
        ArrayList<HopDong> dsCon = new ArrayList<>();
        int i = 1;
        for (HopDong hd : ds) {
            if (hd.getTrangThai().equalsIgnoreCase("Da ky")) {
                dsCon.add(hd);
            }
        }

        if (dsCon.isEmpty()) {
            System.out.println("");
            System.out.println("Danh sach hop dong dang trong ");
            System.out.println("");
        } else {
            System.out.println("=====================================================Danh-sach-hop-dong==================================================================");
            System.out.println("| STT | Ma hop dong |    Ten hop dong    |       Nguyen Van A     |       Nguyen Van B     | Ngay bat dau | Ngay ket thuc |  trang thai |");
            for (HopDong HD : dsCon) {
                System.out.printf("|%-5s", i);
                HD.xuat();
                i++;
            }
            System.out.println("=========================================================================================================================================");
        }
    }

    static void XuatHDChuaKy() {
        ArrayList<HopDong> dsCon = new ArrayList<>();
        int i = 1;

        for (HopDong hd : ds) {
            if (hd.getTrangThai().equalsIgnoreCase("Chua ky")) {
                dsCon.add(hd);
            }
        }
        if (dsCon.isEmpty()) {
            System.out.println("");
            System.out.println("Danh sach hop dong dang trong ");
            System.out.println("");
        } else {
            System.out.println("=====================================================Danh-sach-hop-dong==================================================================");
            System.out.println("| STT | Ma hop dong |    Ten hop dong    |       Nguyen Van A     |       Nguyen Van B     | Ngay bat dau | Ngay ket thuc |  trang thai |");
            for (HopDong HD : dsCon) {
                System.out.printf("|%-5s", i);
                HD.xuat();
                i++;
            }
            System.out.println("=========================================================================================================================================");
        }
    }

    static void TimHD() {
        boolean TimThay = true;
        System.out.println("Nhap Ma can tim");
        String tim = sc.nextLine();
        if (ds.isEmpty()) {
            System.out.println("Danh sach hien tai trong");
            return;
        }
        int i = 1;
        System.out.println("=====================================================Danh-sach-hop-dong==================================================================");
        System.out.println("| STT | Ma hop dong |    Ten hop dong    |       Nguyen Van A     |       Nguyen Van B     | Ngay bat dau | Ngay ket thuc |  trang thai |");
        for (HopDong HD : ds) {

            if (HD.getMaHD().equalsIgnoreCase(tim)) {
                System.out.printf("|%-5s", i);
                HD.xuat();
                TimThay = false;
                i++;
            }
        }
        System.out.println("=========================================================================================================================================");
        if (TimThay == true) {
            System.out.println("Khong tim thay ma: " + tim);
        }
    }

    static void TimHDTheoTen() {
        ArrayList<HopDong> dsCon = new ArrayList<>();
        boolean check = false;
        System.out.print("nhap ten can tim: ");
        String TimTen = sc.nextLine();
        int i = 1;
        for (HopDong hd : ds) {
            if (hd.getTenHD().toLowerCase().contains(TimTen.toLowerCase())) {
                dsCon.add(hd);
                check = true;
                i++;
            }
        }
        if (check) {
            System.out.println("=====================================================Danh-sach-hop-dong==================================================================");
            System.out.println("| STT | Ma hop dong |    Ten hop dong    |       Nguyen Van A     |       Nguyen Van B     | Ngay bat dau | Ngay ket thuc |  trang thai |");
            for (HopDong hd : dsCon) {
                System.out.printf("|%-5d", i);
                hd.xuat();
            }
            System.out.println("=========================================================================================================================================");
        }

        if (check == false) {
            System.out.println("Khong tim thay ten: " + TimTen);
        }
    }

    static void xoa() {
        boolean xoaHD = true;
        if (ds.isEmpty()) {
            System.out.println("Danh sach hien tai trong");
            return;
        }
        System.out.print("Nhap ma hop dong can xoa: ");
        String id = sc.nextLine();
        for (HopDong HD : ds) {
            if (HD.getMaHD().equalsIgnoreCase(id)) {
                ds.remove(HD);
                System.out.println("Da xoa thanh cong ma: " + id);
                XuatDS();
                xoaHD = false;
                break;
            }
        }
        if (xoaHD == true) {
            System.out.println("Khong tim thay ma hop dong: " + id);
        }
    }

    static void CapNhatTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID can tim: ");
        String ID = sc.nextLine();
        boolean capnhat = false;
        int index = 0;
        for (HopDong hd : ds) {
            if (hd.getMaHD().equalsIgnoreCase(ID)) {
                System.out.println("Da tim thay ID: " + ID);
                System.out.println("Cap nhat ID (Enter neu khong đoi.): ");
                System.out.print("ID: ");
                capnhat = true;
                boolean isNumeric = false;
                String IDnew = sc.nextLine();
                if (!IDnew.equalsIgnoreCase("")) {
                    System.out.println("Cap nhat ID moi thanh cong.");
                    hd.setMaHD(IDnew);
                }
                String Tennew = "";
                do {
                    System.out.print("Ten hop đong: ");
                    Tennew = sc.nextLine();

                    // Kiểm tra xem chuỗi nhập vào có chứa chữ số hay không
                    isNumeric = Tennew.matches(".*\\d+.*");

                    if (isNumeric) {
                        System.out.println("Ten hop đong khong duoc chưa chư so. Vui lfng nhap lai.");
                    }
                } while (isNumeric);

                System.out.println("Cap nhat ten hop đong moi thanh cong.");
                hd.setTenHD(Tennew);

                String TenAnew = "";
                do {
                    System.out.println("enter de bo qua: ");
                    System.out.print("Nguyen van A: ");
                    TenAnew = sc.nextLine();

                    // Kiểm tra xem chuỗi nhập vào có chứa chữ số hay không
                    isNumeric = TenAnew.matches(".*\\d+.*");

                    if (isNumeric) {
                        System.out.println("Ten khong duoc chưa chư so. Vui lfng nhap lai.");
                    }
                } while (isNumeric);

                String TenBnew = "";
                do {
                    System.out.println("enter de bo qua: ");
                    System.out.print("Nguyen van B: ");
                    TenBnew = sc.nextLine();

                    // Kiểm tra xem chuỗi nhập vào có chứa chữ số hay không
                    isNumeric = TenBnew.matches(".*\\d+.*");

                    if (isNumeric) {
                        System.out.println("Ten khong duoc chưa chư so. Vui lfng nhap lai.");
                    }
                } while (isNumeric);
                do {
                    System.out.println("Nhap ngay/thang/nam bat dau");
                    System.out.println("-----------------------");
                    System.out.print("Ngay: ");
                    String ngayBatdauNew = sc.nextLine();
                    if (!ngayBatdauNew.equalsIgnoreCase(" ")) {
                        int ngayBatdau = Integer.parseInt(ngayBatdauNew);
                        if (ngayBatdau <= 0 || ngayBatdau > 31) {
                            System.out.println("Ngay khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat ngay thanh cong");
                            hd.setNgayBatdau(ngayBatdau);
                            break;
                        }
                    }
                } while (true);

                do {
                    System.out.println("-----------------------");
                    System.out.print("Thang: ");
                    String thangBatdauNew = sc.nextLine();
                    if (!thangBatdauNew.equalsIgnoreCase(" ")) {
                        int ThangBatdau = Integer.parseInt(thangBatdauNew);
                        if (ThangBatdau <= 0 || ThangBatdau > 12) {
                            System.out.println("Thang khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat thang thanh cong");
                            hd.setThangbd(ThangBatdau);
                            break;
                        }
                    }
                } while (true);
                do {
                    System.out.println("----------------------");
                    System.out.print("Nam: ");
                    String namBatdauNew = sc.nextLine();
                    if (!namBatdauNew.equalsIgnoreCase(" ")) {
                        int Nambatdau = Integer.parseInt(namBatdauNew);
                        if (Nambatdau <= 0) {
                            System.out.println("Nam khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat nam thanh cong");
                            hd.setNambd(Nambatdau);
                            break;
                        }
                    }
                } while (true);
                do {
                    System.out.println("Nhap ngay/thang/nam ket thuc");
                    System.out.println("-----------------------");
                    System.out.print("Ngay: ");
                    String ngayketthucNew = sc.nextLine();
                    if (!ngayketthucNew.equalsIgnoreCase(" ")) {
                        int Ngayketthuc = Integer.parseInt(ngayketthucNew);
                        if (Ngayketthuc <= 0 || Ngayketthuc > 31) {
                            System.out.println("Ngay khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat ngay thanh cong");
                            hd.setNgayKetthuc(Ngayketthuc);
                            break;
                        }
                    }
                } while (true);

                do {
                    System.out.println("-----------------------");
                    System.out.print("Thang: ");
                    String thangKetthucuNew = sc.nextLine();
                    if (!thangKetthucuNew.equalsIgnoreCase(" ")) {
                        int Thangketthuc = Integer.parseInt(thangKetthucuNew);
                        if (Thangketthuc <= 0 || Thangketthuc > 12) {
                            System.out.println("Thang khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat thang thanh cong");
                            hd.setThangkt(Thangketthuc);
                            break;
                        }
                    }
                } while (true);
                do {
                    System.out.println("----------------------");
                    System.out.print("Nam: ");
                    String namKetthucNew = sc.nextLine();
                    if (!namKetthucNew.equalsIgnoreCase(" ")) {
                        int Namketthuc = Integer.parseInt(namKetthucNew);
                        if (Namketthuc <= 0) {
                            System.out.println("Nam khong hop le. Moi nhap lai");
                        } else {
                            System.out.println("Cap nhat nam thanh cong");
                            hd.setNamkt(Namketthuc);
                            break;
                        }
                    }
                } while (true);
                System.out.print("Trang thai (1 - Da ky, 0 - Chua ky): ");
                String trangThaiNew = sc.nextLine();
                if (!trangThaiNew.equalsIgnoreCase("")) {
                    boolean daKy = trangThaiNew.equals("1");
                    System.out.println("Cap nhat trang thai thanh cong.");
                    hd.setTrangThai(daKy);
                }

                ds.set(index, hd);
            } else {
                index++;
            }
        }
        if (!capnhat) {
            System.out.println("Khong co ID nay: " + ID);
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
