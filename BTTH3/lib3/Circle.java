package lib3;

public class Circle extends Ellipse{

    public Circle (double bk){
        super(bk, bk);
    }
    @Override
    public String toString() {
        return String.format("Hinh tron\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
