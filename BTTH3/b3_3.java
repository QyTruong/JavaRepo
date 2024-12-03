import java.util.Scanner;

import lib3.BangDia;
import lib3.DanhSachSanPham;
import lib3.Sach;
import lib3.SanPham;

public class b3_3 {
    static void menu(){
        System.out.println("0. Thoat chuong trinh");
        System.out.println("1. Them san pham");
        System.out.println("2. Xoa san pham theo doi tuong hoac ma san pham");
        System.out.println("3. Cap nhap thong tin san pham (ten, mo ta, gia ban)");
        System.out.println("4. Tim kiem san pham (ma san pham, ten san pham, khoang gia ban)");
        System.out.println("5. Sap xep san pham giam dan theo gia ban");
        System.out.println("6. Xem danh sach cac san pham");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSanPham dssp = new DanhSachSanPham();
        // dssp.themSanPham(new SanPham("1", "1", "1", "1", 20000));
        // dssp.themSanPham(new SanPham("2", "2", "1", "1", 50000));
        // dssp.themSanPham(new SanPham("3", "3", "1", "1", 10000));
        // dssp.themSanPham(new SanPham("4", "4", "1", "1", 70000));

        // dssp.sapXepSanPhamGiaGiamDan();
        // dssp.xuatDanhSachSanPham();
        // dssp.capNhatThongTinSanPham("1", sc);
        // dssp.xuatDanhSachSanPham();

        int choice;
        do {
            menu();
            System.out.print("Hay nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Chuong trinh ket thuc!!!");
                }
                case 1 -> {
                    System.out.println("\tTHEM SAN PHAM");
                    int option;
                    
                    do {
                        System.out.print("Ban muon them loai san pham nao (sach - bang dia) (0-1): ");
                        option = sc.nextInt();
                        sc.nextLine();

                        if (option == 0){
                            System.out.print("Nhap ma san pham: ");
                            String maSanPham = sc.nextLine();
                            System.out.print("Nhap ten san pham: ");
                            String tenSanPham = sc.nextLine();
                            System.out.print("So trang: ");
                            int soTrang = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap mo ta san pham: ");
                            String moTaSanPham = sc.nextLine();
                            System.out.print("Nhap nha san xuat: ");
                            String nhaSanXuat = sc.nextLine();
                            System.out.print("Nhap gia ban: ");
                            double giaBan = sc.nextDouble();
                            Sach sp = new Sach(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan,soTrang);
                            dssp.themSanPham(sp);
                            break;
                        }
                        else if (option == 1){
                            System.out.print("Nhap ma san pham: ");
                            String maSanPham = sc.nextLine();
                            System.out.print("Nhap ten san pham: ");
                            String tenSanPham = sc.nextLine();
                            System.out.print("Thoi luong phat: ");
                            int thoiLuongPhat = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap mo ta san pham: ");
                            String moTaSanPham = sc.nextLine();
                            System.out.print("Nhap nha san xuat: ");
                            String nhaSanXuat = sc.nextLine();
                            System.out.print("Nhap gia ban: ");
                            double giaBan = sc.nextDouble();
                            BangDia sp = new BangDia(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan, thoiLuongPhat);
                            dssp.themSanPham(sp);
                            break;
                        }
                        if (option != 0 || option != 1)
                            System.out.println("Khong hop le, vui long thu lai!!");
                    } while (option != 0 || option != 1);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("\tXOA SAN PHAM");
                    System.out.print("Hay nhap ma san pham ban muon xoa: ");
                    String maSanPham = sc.nextLine();
                    dssp.xoaSanPham(maSanPham);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("\tCAP NHAT THONG TIN SAN PHAM");
                    System.out.print("Hay nhap ma san pham ban muon thay doi thong tin: ");
                    String maSanPham = sc.nextLine();
                    dssp.capNhatThongTinSanPham(maSanPham, sc);
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("\tTIM KIEM SAN PHAM");
                    int option;
                    do {
                        System.out.println("Ban muon tim kiem san pham theo tieu chi nao?:");
                        System.out.println("1. Theo ma san pham");
                        System.out.println("2. Theo ten san pham");
                        System.out.println("3. Theo khoang gia ban");
                        System.out.print("Nhap lua chon cua ban: ");
                        option = sc.nextInt();  
                    } while (option < 1 || option > 3);
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            System.out.println("\tTIM KIEM THEO MA SAN PHAM");
                            System.out.print("Hay nhap ma san pham ban muon tim: ");
                            String maSanPham = sc.nextLine();
                            SanPham result = dssp.timKiemSanPham(maSanPham);
                            if (result != null){
                                System.out.println(result);
                            }
                            else System.out.println("Khong tim thay san pham!!!");
                        }
                        case 2 -> {
                            System.out.println("\tTIM KIEM THEO TEN SAN PHAM");
                            System.out.print("Hay nhap ten san pham ban muon tim: ");
                            String tenSanPham = sc.nextLine();
                            SanPham result = dssp.timKiemSanPham(tenSanPham);
                            if (result != null){
                                System.out.println(result);
                            }
                            else System.out.println("Khong tim thay san pham!!!");
                        }
                        case 3 -> {
                            System.out.println("\tTIM KIEM THEO KHOANG GIA BAN");
                            System.out.print("Hay nhap gia thap nhat: ");
                            double giaBanThapNhat = sc.nextDouble();
                            System.out.print("Hay nhap gia cao nhat: ");
                            double giaBanCaoNhat = sc.nextDouble();
                            System.out.printf("Cac san pham trong tam gia %.1f - %.1f:\n", giaBanThapNhat, giaBanCaoNhat);
                            dssp.timKiemSanPham(giaBanThapNhat, giaBanCaoNhat);
                        }
                        default -> {    
                            System.out.println("Khong hop le, vui long thu lai!");
                        }
                           
                    }
                }
                case 5 -> {
                    System.out.println("\tSAP XEP SAN PHAM TRONG DANH SACH");
                    dssp.sapXepSanPhamGiaGiamDan();
                    System.out.println();
                }
                case 6 -> {
                    dssp.xuatDanhSachSanPham();
                    System.out.println();
                }
                default -> {
                    System.out.println("Khong hop le, vui long nhap lai!!!");
                    System.out.println();
                }
            }
        } while (choice != 0);

        sc.close();
    }
}
