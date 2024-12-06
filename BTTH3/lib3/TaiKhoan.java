package lib3;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TaiKhoan {
    protected String soTaiKhoan;
    protected String tenTaiKhoan;
    protected int soDienThoai;
    protected String email;
    protected double soTienTaiKhoan;
    protected Date ngayTaoTaiKhoan;
    protected String trangThaiTaiKhoan;

    public TaiKhoan(String tenTaiKhoan, int soDienThoai, String email, double soTienTaiKhoan, Date ngayTaoTaiKhoan, String trangThaiTaiKhoan){
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.soTienTaiKhoan = soTienTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
        this.trangThaiTaiKhoan = trangThaiTaiKhoan;
    }

    public String getEmail() {
        return email;
    }
    public Date getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }
    public int getSoDienThoai() {
        return soDienThoai;
    }
    public double getSoTienTaiKhoan() {
        return soTienTaiKhoan;
    }
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNgayTaoTaiKhoan(Date ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }
    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void setSoTienTaiKhoan(double soTienTaiKhoan) {
        this.soTienTaiKhoan = soTienTaiKhoan;
    }
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
}
