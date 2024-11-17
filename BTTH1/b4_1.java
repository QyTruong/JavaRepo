import java.util.Scanner;

public class b4_1 {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen bat ky: ");
        int n = sc.nextInt();
        sc.close();

        if (isPrime(n)) System.out.printf("%d la so nguyen to!\n", n);
        else System.out.printf("%d khong la so nguyen to!\n", n);
    }
}
