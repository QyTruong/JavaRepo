import java.util.*;
import java.io.*;


public class b13_1 {
    public static int countPlayer(ArrayList<String> al){
        int cnt = 0;
        try {
            File f = new File("D:\\javaproject\\filetxt\\DoiTuyenQuocGiaVN.txt");
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                al.add(line);
                cnt++;
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file!");
        }
        return cnt;
    }

    public static void countPlayerLower20(ArrayList<String> al){
        System.out.println();
        System.out.println("Danh cac cau thu co so ao nho hon 20:");
        for (int i = 0; i < al.size(); i++){
            String[] arr = al.get(i).split(",");
            if (Integer.parseInt(arr[2]) < 20){
                System.out.println(al.get(i));
            }
        }
        System.out.println();
    }

    public static void countPosition(ArrayList<String> al){
        int td = 0, hv = 0, tv = 0, tm = 0;
        for (String player : al){
            String[] arr = player.split(",");
            if (arr[1].toLowerCase().contains("tien dao")) td++;
            else if (arr[1].toLowerCase().contains("hau ve")) hv++;
            else if (arr[1].toLowerCase().contains("thu mon")) tm++;
            else tv++;
        }
        System.out.printf("Tien dao: %d nguoi\n", td);
        System.out.printf("Tien ve: %d nguoi\n", tv);
        System.out.printf("Hau ve: %d nguoi\n", hv);
        System.out.printf("Thu mon: %d nguoi\n", tm);
        System.out.println();
    }

    public static int countHaNoiPlayerWithLastNameNguyen(ArrayList<String> al){
        int cnt = 0;
        for (String player : al){
            String[] arr = player.split(",");
            String s = arr[0].toString();
            String[] fullname = s.split(" ");
            if (fullname[0].toLowerCase().contains("nguyen") && arr[3].toLowerCase().contains("ha noi")){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("So luong cau thu trong doi tuyen: " + countPlayer(al));
        countPlayerLower20(al);
        countPosition(al);
        System.out.println("So luong cau thu thuoc CLB Ha Noi co ho la Nguyen " + countHaNoiPlayerWithLastNameNguyen(al));
    }
}