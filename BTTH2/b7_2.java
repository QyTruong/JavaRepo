import java.util.Scanner;

import lib2.DanhMucCauHoi;
import java.io.*;

public class b7_2 {
    public static void menu(){
        System.out.println("0. Thoat chuong trinh");
        System.out.println("1. Them cau hoi moi cho chuong trinh");
        System.out.println("2. Bat dau thuc hanh luyen thi trac nghiem TA");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("Hay nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Chuong trinh ket thuc!");
                }
                case 1 -> {
                    System.out.println("\n\tTHEM CAU HOI");
                    try {
                        DanhMucCauHoi.themCauHoi(sc);
                        System.out.println();
                    }
                    catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n\tTHUC HANH TRA LOI CAU HOI");
                    try {
                        DanhMucCauHoi.luyenThiTiengAnh(sc);
                    }
                    catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                }
            
                default -> {
                    System.out.println("Lua chon khong hop le, vui long thu lai!");
                }
            }
        } while (choice != 0);
    }
}
