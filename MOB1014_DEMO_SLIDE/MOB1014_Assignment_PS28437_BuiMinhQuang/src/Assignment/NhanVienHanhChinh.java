package Assignment;

public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {
        super("", "", "Nhan Vien Hanh Chinh", 0);
    }

    public NhanVienHanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, "Nhan Vien Hanh Chinh", luong);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong();
    }

}
