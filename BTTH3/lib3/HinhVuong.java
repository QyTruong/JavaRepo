package lib3;

public class HinhVuong extends HinhChuNhat{
    
    public HinhVuong(double canh){
        super(canh, canh);
    }
    @Override
    public String toString() {
        return String.format("Hinh hinh vuong\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
