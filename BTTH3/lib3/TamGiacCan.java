package lib3;

public class TamGiacCan extends TamGiac{
    
    public TamGiacCan(double a, double c){
        super(a, a, c);
    }
    @Override
    public String toString() {
        return String.format("Hinh tam giac can\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
