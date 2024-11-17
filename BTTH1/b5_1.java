import java.util.Scanner;

public class b5_1 {
    final static int MAX = 100;
    static Scanner sc = new Scanner(System.in);

    // Nhap mang
    public static void input(int []a, int n){
        for (int i = 0; i < n; i++){
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    // Xuat mang
    public static void ouput(int []a, int n){
        System.out.print("Danh sach cac phan tu: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    // Tong cac so nguyen to trong mang
    public static int sumPrime(int []a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (b4_1.isPrime(a[i]))
                sum += a[i];
        }

        return sum;
    }

    // Tim phan tu
    public static int search(int []a, int n, int key){
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int []a = new int [MAX];

        input(a, n);
        ouput(a, n);

        System.out.println("Tong cac so nguyen to trong mang: " + sumPrime(a, n));

        System.out.print("Nhap 1 so ban muon tim trong mang: ");
        int key = sc.nextInt();
        if (search(a, n, key) != -1)
            System.out.printf("Vi tri cua %d la: %d\n", key, search(a, n, key));
        else
            System.out.println("Khong tim thay!");
        sc.close();
    }
}
