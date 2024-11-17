import java.util.*;
import java.io.*;

public class b10_1 {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\javaproject\\filetxt\\numbers.txt");
            Scanner sc = new Scanner(f);
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (String x : arr){
                int n = Integer.parseInt(x);
                sum += n;
                if (n > max) max = Integer.parseInt(x);
            }
            double avg = (double)sum/arr.length;
            System.out.printf("Trung binh cong: %.2f\n", avg);
            System.out.printf("So lon nhat: %d\n", max);
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("khong tim thay file!");
        }
    }
}
