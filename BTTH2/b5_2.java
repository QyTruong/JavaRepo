import lib2.DsPhanSo;
import lib2.PhanSo;

public class b5_2 {
    public static void main(String[] args) {
        DsPhanSo ds = new DsPhanSo(){};
        ds.addPhanSo(new PhanSo(1,2));
        ds.addPhanSo(new PhanSo(3,6));
        ds.addPhanSo(new PhanSo(4,12));
        ds.addPhanSo(new PhanSo(5,4));
        ds.addPhanSo(new PhanSo(1,4));
        System.out.println(ds.sumListPhanSo());
        System.out.print("Danh sach cac phan so: ");
        ds.showList();
        ds.sortList();
        System.out.print("Danh sach cac phan so sap xep tang dan: ");
        ds.showList();
    }
}
