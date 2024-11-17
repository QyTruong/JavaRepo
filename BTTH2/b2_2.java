import lib2.Diem;
import lib2.DoanThang;

public class b2_2 {
    public static void main(String[] args) {
        DoanThang dt1 = new DoanThang(new Diem(1,2), new Diem(3, 4));
        DoanThang dt2 = new DoanThang(new Diem(5,6), new Diem(7, 8));
        System.out.println(dt1);
        System.out.printf("Do dai doan thang: %.2f \n", dt1.lengthOfLine());
        System.out.println("Trung diem cua d1 la: " + dt1.midPoint());
        if (dt1.isParallel(dt2)) {
            System.out.println(dt1 + " song song voi " + dt2);
        }
        else {
            System.out.println(dt1 + " Khong song song voi " + dt2);
        }
    }
}