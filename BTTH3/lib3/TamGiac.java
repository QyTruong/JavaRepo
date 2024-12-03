package lib3;

public class TamGiac {
    protected double a;
    protected double b;
    protected double c;
    
    public TamGiac(double a, double b, double c){
        this.a = a <= 0 ? 1 : a;
        this.b = b <= 0 ? 1 : b;
        this.c = c <= 0 ? 1 : c;
    }

    public double tinhChuVi(){
        return this.a + this.b + this.c;
    }
    public double tinhDienTich(){
        double p = tinhChuVi()/2;
        return Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
    }
    @Override
    public String toString() {
        return String.format("Hinh tam giac\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
