import java.util.*;
import java.io.*;

public class b12_1 {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\javaproject\\filetxt\\SinhVien.txt");
            PrintWriter pw = new PrintWriter("D:\\javaproject\\filetxt\\SinhVienCNTT.txt");
            Scanner sc = new Scanner(f);
            int cntt = 0, qtkd = 0;
            sc.nextLine();
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                if (arr[4].toLowerCase().contains("cong nghe thong tin")){
                    cntt++;
                    pw.println(line);
                }
                else if (arr[4].toLowerCase().contains("quan tri kinh doanh")){
                    qtkd++;
                }
            }
            System.out.println("So luong sinh vien CNTT: " + cntt);
            System.out.println("So luong sinh vien QTKD: " + qtkd);

            pw.close();
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("khong tim thay file!");
        }
    }
}
