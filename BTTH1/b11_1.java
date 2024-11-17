import java.util.*;
import java.io.*;


public class b11_1 {
    public static void main(String[] args) {
        try {
            int sv = 0, hs = 0, cd = 0;
            File f = new File("D:\\javaproject\\filetxt\\SV-HS-CD.txt");
            Scanner sc = new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                char c = arr[0].charAt(0);
                if (!Character.isDigit(c)){
                    hs++;
                }
                else {
                    if (arr.length == 7) sv++;
                    else cd++;
                }
            }
            System.out.println("So hoc sinh: " + hs);
            System.out.println("So sinh vien: " + sv);
            System.out.println("So cong dan: " + cd);

            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file!!\n");
        }
    }
}
