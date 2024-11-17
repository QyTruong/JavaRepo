import java.util.*;

public class b1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        sc.close();

        System.out.printf("Xin chao %s, ban %d tuoi\n", ten, tuoi);
    }
}
