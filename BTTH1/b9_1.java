
import java.util.ArrayList;
import java.util.Scanner;

import lib1.SinhVien;


public class b9_1 {
    static Scanner sc = new Scanner(System.in);

    public static SinhVien inputOneStudent(){
        System.out.print("Last name: ");
        String ln = sc.nextLine();
        System.out.print("First name: ");
        String fn = sc.nextLine();
        SinhVien sv = new SinhVien(ln,fn);
        return sv;
    }

    public static void inputList(ArrayList<SinhVien> dssv){
        System.out.print("Nhap so luong sinh vien ban muon them vao: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.printf("Sinh vien thu %d:\n", i+1);
            dssv.add(inputOneStudent());
        }
    }

    public static void outputList(ArrayList<SinhVien> dssv){
        System.out.printf("\tDanh sach %d sinh vien:\n", dssv.size());
        for (int i = 0; i < dssv.size(); i++){
            System.out.println(dssv.get(i).toString());
        }
    }

    public static SinhVien searchStudent(ArrayList<SinhVien> dssv, String name){
        for (SinhVien sv : dssv)
            if (name.equals(sv.getFirstName()))
                return sv;
        return null;
    }

    public static void removeStudent(ArrayList<SinhVien> dssv, String fullName){
        for (SinhVien sv : dssv)
            if (fullName.equals(sv.getLastName() + " " + sv.getFirstName())){
                dssv.remove(sv);
                System.out.println("Da xoa thanh cong!");
                return;
            }
        System.out.println("Khong tim thay!");
        return;
    }

    public static void menu(){
        System.out.println("0. Thoat");
        System.out.println("1. Them sinh vien vao danh sach");
        System.out.println("2. Xuat danh sach sinh vien");
        System.out.println("3. Xoa 1 sinh vien ra khoi danh sach theo ho va ten");
        System.out.println("4. Tim kiem sinh vien theo ten");
    }
    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        menu();
        int choice;
        do {
            System.out.print("Hay nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> {System.out.println("Ket thuc chuong trinh");}
                case 1 -> {inputList(dssv);}
                case 2 -> {outputList(dssv);}
                case 3 -> {
                    System.out.print("Nhap ho va ten sinh vien ban muon xoa: \n");
                    sc.nextLine();
                    SinhVien sv = inputOneStudent();
                    removeStudent(dssv, sv.getLastName() + " " + sv.getFirstName());
                }
                case 4 -> {
                    System.out.print("Nhap ten sinh vien ban muon tim: ");
                    sc.nextLine();
                    String firstName = sc.nextLine();
                    SinhVien sv = searchStudent(dssv, firstName);
                    if (sv != null)
                        System.out.println(sv.toString());
                    else
                        System.out.println("Khong tim thay!");
                }
                default -> {System.out.println("Khong hop le!");}
            }
        } while (choice != 0);

        
    }
}
