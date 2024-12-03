package lib3;

public class BangDia extends SanPham{
    private int thoiLuongPhat;

    public BangDia(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan, int thoiLuongPhat){
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
        this.thoiLuongPhat = thoiLuongPhat;
    }
    @Override
    public String toString() {
        return String.format("Ma san pham: %s\nTen san pham: %s\nThoi luong phat: %d\nMo ta san pham: %s\nNha san xuat: %s\nGia ban: %.1f\n", 
        this.maSanPham, this.tenSanPham, this.thoiLuongPhat, this.moTaSanPham, this.nhaSanXuat, this.giaBan);
    }
}
