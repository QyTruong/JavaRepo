package lib2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HocVien {
    private int maSoHocVien;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private String queQuan;
    private double monHoc1;
    private double monHoc2;
    private double monHoc3;
    private static int stt = 0;

    public HocVien(){
        this.maSoHocVien = -1;
        this.hoTen = "N/A";
        this.ngaySinh = new Date(0);
        this.gioiTinh = "N/A";
        this.queQuan = "N/A";
        this.monHoc1 = 0.0;
        this.monHoc2 = 0.0;
        this.monHoc3 = 0.0;
    }
    public HocVien(String hoTen, Date ngaySinh, String gioiTinh, String queQuan){
        stt++;
        this.maSoHocVien = stt;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }
    public int getMaSoHocVien() {
        return maSoHocVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getQueQuan() {
        return queQuan;
    }
    public double getMonHoc1() {
        return monHoc1;
    }
    public double getMonHoc2() {
        return monHoc2;
    }
    public double getMonHoc3() {
        return monHoc3;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void setMonHoc1(double monHoc1) {
        this.monHoc1 = monHoc1;
    }
    public void setMonHoc2(double monHoc2) {
        this.monHoc2 = monHoc2;
    }
    public void setMonHoc3(double monHoc3) {
        this.monHoc3 = monHoc3;
    }

    public static double dtb(double d1, double d2, double d3){
        return (d1+d2+d3)/3;
    }

    public static int soSanh(HocVien a, HocVien b){
        if (dtb(a.monHoc1, a.monHoc2, a.monHoc3) == dtb(b.monHoc1, b.monHoc2, b.monHoc3)){
            return 0;
        }else if (dtb(a.monHoc1, a.monHoc2, a.monHoc3) > dtb(b.monHoc1, b.monHoc2, b.monHoc3)){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Ma so: %d\nHo ten: %s\nGioi tinh: %s\nNgay sinh: %s\nQue quan: %s\nDiem mon hoc 1: %.2f\nDiem mon hoc 2: %.2f\nDiem mon hoc 3: %.2f\n==============\n",this.maSoHocVien, this.hoTen, this.gioiTinh, df.format(ngaySinh), this.queQuan, this.monHoc1, this.monHoc2, this.monHoc3);
        
        
    }
}