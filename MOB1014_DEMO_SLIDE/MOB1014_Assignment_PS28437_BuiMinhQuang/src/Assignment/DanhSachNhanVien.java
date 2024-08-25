package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap(Scanner sc) {
        boolean tiepTucNhap = true;
        do {
            System.out.println("Nhap loai nhan vien: ");
            System.out.println("1. Hanh chinh");
            System.out.println("2. Truong phong");
            System.out.println("3. Tiep thi");
            System.out.println("Khong nhap gi de thoat");
            String loai = sc.nextLine();
            if (loai == null || loai.equals("")) {
                tiepTucNhap = false;
                break;
            }
            int iloai = Integer.parseInt(loai);
            switch (iloai) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(sc);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(sc);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(sc);
                    list.add(nvtt);
                    break;
            }
        } while (tiepTucNhap);
    }

    public void xuatSoLuongNhanVienTheoLoai() {
        int soLuongHanhChinh = 0;
        int soLuongTruongPhong = 0;
        int soLuongTiepThi = 0;

        for (NhanVien nv : list) {
            if (nv instanceof NhanVienHanhChinh) {
                soLuongHanhChinh++;
            } else if (nv instanceof TruongPhong) {
                soLuongTruongPhong++;
            } else if (nv instanceof NhanVienTiepThi) {
                soLuongTiepThi++;
            }
        }

        System.out.println("So luong nhan vien theo loai:");
        System.out.println("Hanh chinh: " + soLuongHanhChinh);
        System.out.println("Truong phong: " + soLuongTruongPhong);
        System.out.println("Tiep thi: " + soLuongTiepThi);
    }

    public void xuat() {
        xuatSoLuongNhanVienTheoLoai();
        System.out.println("Danh Sach Nhan Vien: ");
        System.out.printf("%-5s\t|\t%-10s\t|\t%-20s\t|\t%-20s \t|\t%-10s\t|\t%-15s\t|", "STT", "MaNV", "Ho va ten", "Loai nhan vien", "Luong", "Thu nhap");
        for (int i = 0; i < list.size(); i++) {
            NhanVien nv = list.get(i);
            System.out.printf("\n%-5d\t|\t%-10s\t|\t%-20s\t|\t%-20s \t|\t%-10.2f\t|\t%-10.2f\t|", i + 1, nv.getMaNV(), nv.getHoTen(), nv.getLoai(), nv.getLuong(), nv.getThuNhap());
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nv).xuat();
            } else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nv).xuat();
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).xuat();
            }
        }
        System.out.println("");
    }

    public void timKiem(Scanner sc) {
        System.out.println("Nhap ma can tim: ");
        String ma = sc.nextLine();
        NhanVien timnv = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                timnv = nv;
                break;
            }
        }
        if (timnv != null) {
            System.out.println("Thong tin nhan vien tim duoc la: ");
            timnv.xuatnv();
            if (timnv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) timnv).xuat();
            } else if (timnv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) timnv).xuat();
            } else if (timnv instanceof TruongPhong) {
                ((TruongPhong) timnv).xuat();
            }
        } else {
            System.out.println("Khong tim thay nhan vien " + ma);
        }
    }

    public void xoaNV(Scanner sc) {
        System.out.println("Nhap MaNV can xoa: ");
        String ma = sc.nextLine();
        NhanVien timnv = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                timnv = nv;
                break;
            }
        }
        if (timnv != null) {
            System.out.println("Thong tin nhan vien tim duoc la: ");
            timnv.xuatnv();
            if (timnv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) timnv).xuat();
            } else if (timnv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) timnv).xuat();
            } else if (timnv instanceof TruongPhong) {
                ((TruongPhong) timnv).xuat();
            }
            list.remove(timnv);
            System.out.println("\nNhan vien da duoc xoa: ");
        } else {
            System.out.println("Khong tim thay nhan vien " + ma);
        }
    }

    public void capNhat(Scanner sc) {
        System.out.println("Nhap ma nhan vien can cap nhat: ");
        String maNV = sc.nextLine();
        NhanVien nv = null;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMaNV().equals(maNV)) {
                nv = nhanVien;
                break;
            }
        }

        if (nv == null) {
            System.out.println("Khong tim thay nhan vien!");
            return;
        }

        nv.xuatnv();
        if (nv instanceof NhanVienHanhChinh) {
            ((NhanVienHanhChinh) nv).xuat();
        } else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi) nv).xuat();
        } else if (nv instanceof TruongPhong) {
            ((TruongPhong) nv).xuat();
        }

        System.out.println("\nNhap lua chon cap nhat:");
        System.out.println("1. Cap nhat ma nhan vien");
        System.out.println("2. Cap nhat ten nhan vien");
        System.out.println("3. Cap nhat luong");

        if (nv instanceof NhanVienHanhChinh) {
            System.out.println("4. Cap nhat tat ca");
        } else if (nv instanceof TruongPhong) {
            System.out.println("4. Cap nhat luong trach nhiem");
            System.out.println("5. Cap nhat tat ca");
        } else if (nv instanceof NhanVienTiepThi) {
            System.out.println("4. Cap nhat doanh so");
            System.out.println("5. Cap nhat hoa hong");
            System.out.println("6. Cap nhat tat ca");
        }

        int luaChon = sc.nextInt();
        sc.nextLine();

        switch (luaChon) {
            case 1:
                String maNVMoi;
                boolean trungMaNV;
                do {
                    System.out.println("Nhap ma nhan vien moi: ");
                    maNVMoi = sc.nextLine();
                    trungMaNV = false;
                    for (NhanVien x : list) {
                        if (x.getMaNV().equals(maNVMoi)) {
                            trungMaNV = true;
                            System.out.println("Ma nhan vien da ton tai. Vui long nhap lai.");
                            maNVMoi = sc.nextLine();
                            break;
                        }
                    }
                } while (trungMaNV);
                nv.setMaNV(maNVMoi);
                System.out.println("Da cap nhat ma nhan vien");
                break;

            case 2:
                System.out.println("Nhap ten nhan vien moi: ");
                String tenNVMoi = sc.nextLine();
                nv.setHoTen(tenNVMoi);
                System.out.println("Da cap nhat ten nhan vien");
                break;
            case 3:
                System.out.println("Nhap luong moi: ");
                double luongMoi = sc.nextDouble();
                nv.setLuong(luongMoi);
                System.out.println("Da cap nhat luong nhan vien");
                break;
            case 4:
                if (nv instanceof NhanVienHanhChinh) {
                    NhanVienHanhChinh nvhc = (NhanVienHanhChinh) nv;
                    nvhc.nhap(sc);
                } else if (nv instanceof TruongPhong) {
                    System.out.println("Nhap luong trach nhiem moi: ");
                    double luongTrachNhiemMoi = sc.nextDouble();
                    ((TruongPhong) nv).setLuongTrachNhiem(luongTrachNhiemMoi);
                    System.out.println("Da cap nhat luong trach nhiem");
                } else if (nv instanceof NhanVienTiepThi) {
                    System.out.println("Nhap doanh so moi: ");
                    double doanhSoMoi = sc.nextDouble();
                    ((NhanVienTiepThi) nv).setDoanhSo(doanhSoMoi);
                    System.out.println("Da cap nhat doanh so ");
                }
                break;
            case 5:
                if (nv instanceof TruongPhong) {
                    TruongPhong tp = (TruongPhong) nv;
                    tp.nhap(sc);
                } else if (nv instanceof NhanVienTiepThi) {
                    System.out.println("Nhap hoa hong moi: ");
                    double hoaHongMoi = sc.nextDouble();
                    ((NhanVienTiepThi) nv).setHoaHong(hoaHongMoi);
                    System.out.println("Da cap nhat hoa hong");
                }
                break;
            case 6:
                if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).nhap(sc);
                }
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }
        sc.nextLine();
    }

    public void timTheoLuong(Scanner sc) {
        System.out.println("Nhap khoang luong thap nhat: ");
        double min = sc.nextDouble();
        System.out.println("Nhap khoang luong cao nhat: ");
        double max = sc.nextDouble();
        sc.nextLine();
        boolean found = false;
        System.out.println("Danh sach nhan vien co luong nam trong khoang tu " + min + " den " + max + ":");
        System.out.printf("%-2s \t%-10s \t%-20s \t%-15s \t%-15s \t%-10s", "STT", "MaNV", "Ho va ten", "Loai nhan vien", "Luong", "Thu Nhap");

        for (int i = 0; i < list.size(); i++) {
            NhanVien nv = list.get(i);
            if (min <= nv.getLuong() && nv.getLuong() <= max) {
                if (!found) {
                    found = true;
                }
                System.out.printf("\n%-2d \t%-10s \t%-20s \t%-15s \t%-15s \t%-10s", i + 1, nv.getMaNV(), nv.getHoTen(), nv.getLoai(), nv.getLuong(), nv.getThuNhap());
                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).xuat();
                } else if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).xuat();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).xuat();
                }
            }
        }

        if (!found) {
            System.out.println("\nKhong co nhan vien nao trong khoang luong  tu " + min + " den " + max + ":");
        }
    }

    public void sapXepTheoHoTen() {
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareToIgnoreCase(nv2.getHoTen());
            }
        });
        System.out.println("Danh sach nhan vien sau khi sap xep theo ho va ten:");
        xuat();
    }

    public void sapXepTheoThuNhap() {
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return Double.compare(nv2.getThuNhap(), nv1.getThuNhap());
            }
        });
        System.out.println("Danh sach nhan vien sau khi sap xep theo thu nhap giam dan:");
        xuat();
    }

    public void xuatTop5ThuNhap() {
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return Double.compare(nv2.getThuNhap(), nv1.getThuNhap());
            }
        });

        System.out.println("Danh sach 5 nhan vien co thu nhap cao nhat:");
        System.out.printf("%-5s\t|\t %-10s\t|\t%-20s\t|\t%-15s\t|\t%-10s", "STT", "MaNV", "Ho va ten", "Loai nhan vien", "Thu nhap");

        int count = Math.min(5, list.size());
        for (int i = 0; i < count; i++) {
            NhanVien nv = list.get(i);
            System.out.printf("\n%-5d\t|\t%-10s\t|\t%-20s\t|\t%-15s\t|\t%-10.2f\t|", i + 1, nv.getMaNV(), nv.getHoTen(), nv.getLoai(), nv.getThuNhap());
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nv).xuat();
            } else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nv).xuat();
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).xuat();
            }
        }
    }

    public void xuatNhanVienTheoTen(Scanner sc) {
        String tenNV;
        System.out.println("Nhap ten nhan vien trung.");
        tenNV = sc.nextLine();
        boolean found = false;
        System.out.println("Cac nhan vien co ten '" + tenNV + "':");
        System.out.printf("%-5s\t|\t%-10s\t|\t%-20s\t|\t%-20s \t|\t%-10s\t|\t%-15s\t", "STT", "MaNV", "Ho va ten", "Loai nhan vien", "Luong", "Thu nhap");

        int stt = 0;
        ArrayList<NhanVien> nhanVienCungTen = new ArrayList<>();
        for (NhanVien nv : list) {
            if (nv.getHoTen().equalsIgnoreCase(tenNV)) {
                found = true;
                stt++;
                nhanVienCungTen.add(nv);
                System.out.printf("\n%-5d\t|\t%-10s\t|\t%-20s\t|\t%-20s \t|\t%-10.2f\t|\t%-10.2f", stt, nv.getMaNV(), nv.getHoTen(), nv.getLoai(), nv.getLuong(), nv.getThuNhap());
                if (nv instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nv).xuat();
                } else if (nv instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nv).xuat();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).xuat();
                }
            }
        }

        if (!found) {
            System.out.println("Khong tim thay nhan vien co ten '" + tenNV + "'");
            return;
        }

        System.out.println("\nBan co muon sua thong tin cac nhan vien nay? (Y/N)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            boolean timThayNhanVien = false;
            while (!timThayNhanVien) {
                System.out.println("Nhap ma nhan vien can cap nhat: ");
                String maNV = sc.nextLine();
                NhanVien nvToUpdate = null;
                for (NhanVien nv : nhanVienCungTen) {
                    if (nv.getMaNV().equals(maNV)) {
                        nvToUpdate = nv;
                        break;
                    }
                }
                if (nvToUpdate != null) {
                    capNhat(sc);
                    NhanVien nvMoi = null;
                    for (NhanVien nv : list) {
                        if (nv.getMaNV().equals(nvToUpdate.getMaNV())) {
                            nvMoi = nv;
                            break;
                        }
                    }
                    if (nvMoi != null) {
                        capNhat(sc);
                    }
                    timThayNhanVien = true;
                } else {
                    System.out.println("Nhan vien "+maNV+ " khong bi trung ten. Vui long nhap lai!");
                }
            }
        }
    }
}
