import java.util.Scanner;

public class b3_1 {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        final int month = sc.nextInt();
        sc.close();
        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.printf("%d la thang co 31 ngay", month);
            case 4,6,9,11 -> System.out.printf("%d la thang co 30 ngay", month);
            case 2 -> System.out.printf("%d la thang co 28 hoac 29 ngay", month);
            default -> System.out.println("Khong hop le!");
        }
    }
}
