package lib3;

public class TamGiacDeu extends TamGiacCan{
    
    public TamGiacDeu(double a){
        super(a, a);
    }
    @Override
    public String toString() {
        return String.format("Hinh tam giac deu\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
