package lib3;

public class Sach extends SanPham{
    private int soTrang;

    public Sach(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan, int soTrang){
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }
    @Override
    public String toString() {
        return String.format("Ma san pham: %s\nTen san pham: %s\nSo trang: %d\nMo ta san pham: %s\nNha san xuat: %s\nGia ban: %.1f\n", 
        this.maSanPham, this.tenSanPham, this.soTrang, this.moTaSanPham, this.nhaSanXuat, this.giaBan);
    }
}
