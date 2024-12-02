package lib2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHocVien {
    ArrayList<HocVien> dshv;
    Scanner sc = new Scanner(System.in);
    
    public DanhSachHocVien(){
        dshv = new ArrayList<>();
    }
    public void nhapDanhSachHocvien(){
        int choice;
        System.out.println("\tNHAP THONG TIN CA NHAN DANH SACH HOC VIEN:");
        do {
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();

            try {
                System.out.print("Ngay sinh (dd/mm/yyyy): ");
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                df.setLenient(false);
                String ngaySinh = sc.nextLine();
                System.out.print("Gioi tinh: ");
                String gioiTinh = sc.nextLine();
                System.out.print("Que quan: ");
                String queQuan = sc.nextLine();
                HocVien hv = new HocVien(hoTen, df.parse(ngaySinh), gioiTinh, queQuan);
                dshv.add(hv);
            }
            catch (ParseException e){
                System.out.println(e.getMessage());
            }
            do {
                System.out.print("Ban co muon them hoc vien khong (0/1): ");
                choice = sc.nextInt();
                sc.nextLine();
                if (choice != 0 && choice != 1){
                    System.out.println("Vui long nhap lai!");
                }
            } while (choice != 0 && choice != 1);
        } while (choice != 0);
    }
    
    public void nhapDiemChoHocVien(){
        System.out.println("\tBANG THUC HIEN NHAP DIEM CHO HOC VIEN:");
        int choice;
        do {
            System.out.print("Ma so hoc vien ma ban can nhap diem: ");
            int stt = sc.nextInt();
            int check = dshv.indexOf(dshv.get(stt-1));
            if (check == -1) System.out.println("Khong tim thay hoc vien nay!");
            else {
                System.out.print("Mon hoc 1: ");
                double monHoc1 = sc.nextDouble();
                System.out.print("Mon hoc 2: ");
                double monHoc2 = sc.nextDouble();
                System.out.print("Mon hoc 3: ");
                double monHoc3 = sc.nextDouble();
                dshv.get(check).setMonHoc1(monHoc1);
                dshv.get(check).setMonHoc2(monHoc2);
                dshv.get(check).setMonHoc3(monHoc3);
            }
            System.out.print("Ban co muon lap lai thao tac nay? (0-1): ");
            choice = sc.nextInt();
        }
        while (choice != 0);
    }

    public int timTheoMaSo(int maSoHocVien){
        for (int i = 0; i < dshv.size(); i++){
            if (dshv.get(i).getMaSoHocVien() == maSoHocVien)
                return i;
        }
        return -1;
    }

    public int timHoTenHoacQueQuan(String s){
        for (int i = 0; i < dshv.size(); i++){
            if (dshv.get(i).getHoTen().toLowerCase().contains(s) || dshv.get(i).getQueQuan().toLowerCase().contains(s))
                return i;
        }
        return -1;
    }

    public void sapXepTheoDiem(){
        dshv.sort((HocVien a, HocVien b) -> {return HocVien.soSanh(a, b);});
    }

    public void danhSachHocVienNhanHocBong(){
        System.out.println("\tDANH SACH HOC VIEN NHAN HOC BONG");
        for (HocVien hv: dshv){
            if (HocVien.dtb(hv.getMonHoc1(), hv.getMonHoc2(), hv.getMonHoc3()) >= 8){
                System.out.println(hv);
            }
        }
    }

    public void xuatDanhSachSinhVien(){
        System.out.println("\tDANH SACH CAC HOC VIEN");
        for (HocVien hv : dshv){
            System.out.println(hv);
        }
    }
}