import java.util.Scanner;;

public class b6_1 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    
    // Nhap mang
    static void input(int []a, int n){
        for (int i = 0; i < n; i++){
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    // Tinh gia tri bieu thuc
    static int solve(int []a, int n, int x){
        int res = 0;
        for (int i = 0; i < n; i++){
            res += a[i]*Math.pow(x,i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        n++;
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        int []a = new int [MAX];
        
        input(a, n);
        int res = solve(a, n, x);
        System.out.println("Gia tri cua bieu thuc: " + res);
    }
}
