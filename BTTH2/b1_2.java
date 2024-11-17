import lib2.Diem;
public class b1_2 {
    public static void main(String[] args) {
        Diem d1 = new Diem(2,3);
        Diem d2 = new Diem(6, 2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.printf("Khoang cach giua d1 va d2: %.2f\n", Diem.Distance(d1, d2));
    }
}
