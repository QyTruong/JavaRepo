package lib3;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TaiKhoanKhongKyHan extends TaiKhoan{
    private double lai_suat;

    public TaiKhoanKhongKyHan(String tenTaiKhoan, int soDienThoai, String email, double soTienTaiKhoan, Date ngayTaoTaiKhoan, String trangThaiTaiKhoan){
        super(tenTaiKhoan, soDienThoai, email, soTienTaiKhoan, ngayTaoTaiKhoan, trangThaiTaiKhoan);
        this.lai_suat = 0.001;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("So tai khoan: %s\nTen tai khoan: %s\nSo dien thoai: %d\nEmail: %s\nSo tien tai khoan: %.1f\nNgay tao tai khoan: %s\nTrang thai tai khoang: %s\n"
        , this.soTaiKhoan, this.tenTaiKhoan, this.soDienThoai, this.email, this.soTienTaiKhoan, df.format(this.ngayTaoTaiKhoan), this.trangThaiTaiKhoan);
    }
}
