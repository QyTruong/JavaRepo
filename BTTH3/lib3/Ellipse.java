package lib3;

public class Ellipse {
    protected double bkTrucLon;
    protected double bkTrucNho;

    // public Ellipse(){
    //     bkTrucLon = bkTrucNho = 0;
    // }
    public Ellipse(double bkTrucLon, double bkTrucNho){
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }
    public double getBkTrucNho() {
        return bkTrucNho;
    }
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    public double tinhDienTich(){
        return Math.PI * this.bkTrucLon * this.bkTrucNho;
    }
    public double tinhChuVi(){
        double bkl = this.bkTrucLon * this.bkTrucLon;
        double bkn = this.bkTrucNho * this.bkTrucNho;
        return 2 * Math.PI * Math.sqrt((bkl + bkn)/2);
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.2f\nChu vi: %.2f\n", tinhDienTich(), tinhChuVi());
    }
}
