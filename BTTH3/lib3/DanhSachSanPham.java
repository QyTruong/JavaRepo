package lib3;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSanPham {
    ArrayList<SanPham> dssp;

    public DanhSachSanPham(){
        this.dssp = new ArrayList<>();
    }

    public void themSanPham(SanPham sp){
        this.dssp.add(sp);
        System.out.println("Da them thanh cong!");
    }
    public void xoaSanPham(SanPham sp){
        this.dssp.remove(sp);
        System.out.println("Da xoa thanh cong!");
    }
    public void xoaSanPham(String maSanPham){
        this.dssp.removeIf(sp -> sp.getMaSanPham() == maSanPham);
    }
    public void xuatDanhSachSanPham(){
        System.out.println("\tDANH SACH CAC SAN PHAM HIEN CO:");
        for (SanPham sp : dssp) {
            System.out.println(sp);
        }
    }
    public void capNhatThongTinSanPham(String maSanPham, Scanner sc){
        for (SanPham sp : dssp){
            if (sp.maSanPham.equals(maSanPham)){
                System.out.printf("Ma san pham: %s\n", sp.maSanPham);
                int flag;

               
                System.out.print("Ban co muon cap lai ten khong (0-1): ");
                flag = sc.nextInt();
                sc.nextLine();
                if (flag == 1){
                    System.out.print("Moi ban cap nhat lai ten san pham: ");
                    String tenSanPham = sc.nextLine();
                    sp.setTenSanPham(tenSanPham);
                }
                System.out.print("Ban co muon cap lai mo ta san pham khong (0-1): ");
                flag = sc.nextInt();
                sc.nextLine();
                if (flag == 1){
                    System.out.println("Moi ban cap nhat lai mo ta san pham: ");
                    String moTaSanPham = sc.nextLine();
                    sp.setMoTaSanPham(moTaSanPham);
                }
                System.out.print("Ban co muon cap lai gia ban khong (0-1): ");
                flag = sc.nextInt();
                sc.nextLine();
                if (flag == 1){
                    System.out.println("Moi ban cap nhat lai gia ban cua san pham: ");
                    double giaBan = sc.nextDouble();
                    sp.setGiaBan(giaBan);
                }
                
            }
        }
    }
    public SanPham timKiemSanPham(String sanpham){
        for (SanPham sp : dssp){
            if (sp.getMaSanPham().equals(sanpham) || sp.getTenSanPham().equals(sanpham)){
                return sp;
            }
        }
        return null;
    }
    public void timKiemSanPham(double giaBanThapNhat, double giaBanCaoNhat){
        for (SanPham sp : dssp){
            if (sp.getGiaBan() >= giaBanThapNhat && sp.getGiaBan() <= giaBanCaoNhat){
                System.out.println(sp);
            }
        }
    }
    private int soSanhSanPham(SanPham a, SanPham b){
        return a.giaBan > b.giaBan ? 1 : (a.giaBan < b.giaBan) ? -1 : 0;
    }
    public void sapXepSanPhamGiaGiamDan(){
        dssp.sort((SanPham a, SanPham b) -> {return -soSanhSanPham(a, b);});
        System.out.println("Danh sach san pham da duoc sap xep giam dan theo gia ban!!!");
    }
    public SanPham timKiemSanPham(){
        return new SanPham(null, null, null, null, 0);
    }
}
