package lib3;

public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuDai+this.chieuRong)*2;
    }
    @Override
    public String toString() {
        return String.format("Hinh chu nhat\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
