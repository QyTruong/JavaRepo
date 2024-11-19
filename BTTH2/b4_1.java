import lib2.PhanSo;

public class b4_1 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1,2);
        PhanSo ps2 = new PhanSo(1,4);
        System.out.println(PhanSo.nhanPhanSo(ps1, ps2));
        System.out.println(PhanSo.soSanh(ps1, ps2));
        System.out.println(ps1);
        System.out.println(ps2);
    }
}