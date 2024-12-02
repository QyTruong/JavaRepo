import lib2.DanhSachHocVien;

// import lib2.DanhSachHocVien;
// import lib2.HocVien;

public class b6_2 {
    public static void main(String[] args) {
        DanhSachHocVien dshv = new DanhSachHocVien();
        dshv.nhapDanhSachHocvien();
        dshv.nhapDiemChoHocVien();
        dshv.xuatDanhSachSinhVien();

        System.out.println("\tSau khi sap xep:");
        dshv.xuatDanhSachSinhVien();

        dshv.danhSachHocVienNhanHocBong();
    }
}