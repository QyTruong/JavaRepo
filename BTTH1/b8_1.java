import java.util.Scanner;;

public class b8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rd = (int)(Math.random()*100 + 1);
        int choice, n;
        do {
            do {
                System.out.print("So ban doan la: ");
                n = sc.nextInt();
                if (n > rd) System.out.println("So cua ban lon hon!");
                else if (n < rd) System.out.println("So cua ban nho hon!");
            } while (n != rd);
            System.out.println("Ban doan dung roi");
            System.out.print("Ban co muon choi tiep ?: ");
            choice = sc.nextInt();
        } while (choice != 0);
        sc.close();
    }
}
