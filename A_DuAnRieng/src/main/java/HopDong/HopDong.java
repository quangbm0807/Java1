package HopDong;

import java.util.Scanner;

public class HopDong {

    static Scanner sc = new Scanner(System.in);
    private String MaHD;
    private String tenHD;
    private String tenA;
    private String tenB;
    private int ngayBatdau;
    private int ngayKetthuc;
    private int thangbd;
    private int nambd;
    private int thangkt;
    private int namkt;
    private boolean trangThai;

    public HopDong() {
    }

    public HopDong(String MaHD, String tenHD, String tenA, String tenB, int ngayBatdau, int ngayKetthuc, int thangbd, int nambd, int thangkt, int namkt) {
        this.MaHD = MaHD;
        this.tenHD = tenHD;
        this.tenA = tenA;
        this.tenB = tenB;
        this.ngayBatdau = ngayBatdau;
        this.ngayKetthuc = ngayKetthuc;
        this.thangbd = thangbd;
        this.nambd = nambd;
        this.thangkt = thangkt;
        this.namkt = namkt;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getTenA() {
        return tenA;
    }

    public void setTenA(String tenA) {
        this.tenA = tenA;
    }

    public String getTenB() {
        return tenB;
    }

    public void setTenB(String tenB) {
        this.tenB = tenB;
    }

    public int getNgayBatdau() {
        return ngayBatdau;
    }

    public void setNgayBatdau(int ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public int getNgayKetthuc() {
        return ngayKetthuc;
    }

    public void setNgayKetthuc(int ngayKetthuc) {
        this.ngayKetthuc = ngayKetthuc;
    }

    public int getThangbd() {
        return thangbd;
    }

    public void setThangbd(int thangbd) {
        this.thangbd = thangbd;
    }

    public int getThangkt() {
        return thangkt;
    }

    public void setThangkt(int thangkt) {
        this.thangkt = thangkt;
    }

    public int getNambd() {
        return nambd;
    }

    public void setNambd(int nambd) {
        this.nambd = nambd;
    }

    public int getNamkt() {
        return namkt;
    }

    public void setNamkt(int namkt) {
        this.namkt = namkt;
    }

    public String getTrangThai() {
        if (trangThai) {
            return "Da ky";
        } else {
            return "Chua ky";
        }
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void nhap() {
        boolean checkhd = true;
        boolean checkA = true;
        boolean checkB = true;
        System.out.println("-----------------------");
        do {
            System.out.print("Nhap ten hop dong: ");
            try {
                tenHD = sc.nextLine();
                Integer.parseInt(tenHD);
                System.out.println("Ten khong duoc la so hay nhap lai!!!");
            } catch (NumberFormatException e) {
                checkhd = false;
            }
        } while (checkhd == true);
        System.out.println("-----------------------");
        System.out.println("Nhan enter de bo qua ");
        do {
            System.out.print("Nhap ten Nguyen Van A: ");
            try {
                tenA = sc.nextLine();
                Integer.parseInt(tenA);
                System.out.println("Ten khong duoc la so hay nhap lai!!!");
            } catch (NumberFormatException e) {
                checkA = false;
            }
        } while (checkA == true);
        System.out.println("-----------------------");
        System.out.println("Nhan enter de bo qua ");
        do {
            System.out.print("Nhap ten Nguyen Van B: ");
            try {
                tenB = sc.nextLine();
                Integer.parseInt(tenB);
                System.out.println("Ten khong duoc la so hay nhap lai!!!");
            } catch (NumberFormatException e) {
                checkB = false;
            }
        } while (checkB == true);
        System.out.println("-----------------------");
        do {
            System.out.println("Nhap ngay/thang/nam bat dau");
            System.out.println("-----------------------");
            System.out.print("Ngay: ");
            ngayBatdau = sc.nextInt();
            if (ngayBatdau <= 0 || ngayBatdau > 31) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Ngay > 0 va >31");
            }
        } while (ngayBatdau <= 0 || ngayBatdau > 31);
        do {
            System.out.println("-----------------------");
            System.out.print("Thang: ");
            thangbd = sc.nextInt();
            if (thangbd <= 0 || thangbd > 12) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Thang > 0 va >=12");
            }
        } while (thangbd <= 0 || thangbd > 12);
        do {
            System.out.println("-----------------------");
            System.out.print("Nam: ");
            nambd = sc.nextInt();
            if (nambd <= 0) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Nam > 0");
            }
        } while (nambd <= 0);
        System.out.println("-----------------------");
        do {
            System.out.println("Nhap ngay/thang/nam ket thuc");
            System.out.println("-----------------------");
            System.out.print("Ngay: ");
            ngayKetthuc = sc.nextInt();
            if (ngayKetthuc <= 0 || ngayKetthuc > 31) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Ngay > 0 va >31");
            }
        } while (ngayKetthuc <= 0 || ngayKetthuc > 31);
        do {
            System.out.println("-----------------------");
            System.out.print("Thang: ");
            thangkt = sc.nextInt();
            if (thangkt <= 0 || thangkt > 12) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Thang > 0 va >=12");
            }
        } while (thangkt <= 0 || thangkt > 12);
        do {
            System.out.println("-----------------------");
            System.out.print("Nam: ");
            namkt = sc.nextInt();
            if (namkt <= 0) {
                System.out.println("ban da nhap sai hay nhap lai");
                System.out.println("Nam > 0");
            }
        } while (namkt <= 0);
        sc.nextLine();
        System.out.print("Trang thai (1 - Da ky, 0 - Chua ky): ");
        String trangThaiNew = sc.nextLine();
        if (!trangThaiNew.equalsIgnoreCase("")) {
            boolean daKy = trangThaiNew.equals("1");
            setTrangThai(daKy);
        }
    }

    public void xuat() {
        System.out.printf("|%-13s", this.MaHD);
        System.out.printf("|%-20s", this.tenHD);
        System.out.printf("|%-24s", this.tenA);
        System.out.printf("|%-24s", this.tenB);
        System.out.printf("|%-2d/%-2d/%-8d", this.ngayBatdau, this.thangbd, this.nambd);
        System.out.printf("|%-2d/%-2d/%-9d", this.ngayKetthuc, this.thangkt, this.namkt);
        System.out.printf("|%-13s",this.getTrangThai());
        System.out.println("|");
    }
}
