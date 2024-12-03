package lib3;

public class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected String moTaSanPham;
    protected String nhaSanXuat;
    protected double giaBan;


    public SanPham(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan){
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.moTaSanPham = moTaSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan < 0 ? 0 : giaBan;
    }
    public String getMaSanPham() {
        return maSanPham;
    }
    public String getTenSanPham() {
        return tenSanPham;
    }
    public String getMoTaSanPham() {
        return moTaSanPham;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return String.format("Ma san pham: %s\nTen san pham: %s\nMo ta san pham: %s\nNha san xuat: %s\nGia ban: %.1f\n", 
        this.maSanPham, this.tenSanPham, this.moTaSanPham, this.nhaSanXuat, this.giaBan);
    }

}
