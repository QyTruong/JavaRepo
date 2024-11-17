import java.util.Scanner;

public class b2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = sc.nextFloat();
        sc.close();

        System.out.printf("Dien tich hinh tron: %.3f\n", Math.PI*Math.pow(r,2));
        System.out.printf("Chu vi hinh tron: %.3f", Math.PI*2*r);
    }    
}
