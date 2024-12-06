import java.util.InputMismatchException;

public class test {
     public static int divide(String s1, String s2) {
 int c = -1;
 try {
 int a = Integer.parseInt(s1);
 int b = Integer.parseInt(s2);
 c = a/b;
 } catch (InputMismatchException ex) {
 System.out.println("InputMismatch");
 } finally {
 System.out.println("Finally");
 }
 return c;
 }
    public static void main(String[] args) {
        try {
            System.out.println("A");
            System.out.println(10/0);
            System.out.println("B");
            } catch (NumberFormatException ex) {
            System.out.println("ERROR");
            } finally {
            System.out.println("DONE");
            }

    }
}