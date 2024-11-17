import java.util.Scanner;

public class b7_1 {
    static Scanner sc = new Scanner(System.in);

    // Dem ky tu viet hoa
    static int countUpperCase(String s){
        int cnt = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i)))
                cnt++;
        }
        return cnt;
    }

    // Chuyen ho va ten sang thanh email: Nguyen Quoc Khanh -> khanh.nq@ou.edu.vn
    static String convert2Emal(String ho, String tenLot, String ten){
        StringBuilder bd = new StringBuilder();
        bd.append(ten.toLowerCase());
        bd.append(".");
        String [] words = tenLot.split(" ");
        for (String w : words){
            bd.append(Character.toLowerCase(w.charAt(0)));
        }
        bd.append(Character.toLowerCase(ho.charAt(0)));
        bd.append("@ou.edu.vn");
        String res = bd.toString();
        return res;
    }

    // Thay the mien email -> gmail.com
    static String email2Gmail(String s){
        String res = s.replace("ou.edu.vn", "gmail.com");
        return res;
    }
    public static void main(String[] args) {
        System.out.print("Ho: ");
        String ho = sc.nextLine();
        System.out.print("Ten lot: ");
        String tenLot = sc.nextLine();
        System.out.print("Ten: ");
        String ten = sc.nextLine();

        String hoTen = ho + " " + tenLot + " " + ten;
        System.out.println("Xin chao, " + hoTen);

        System.out.println("So luong ky tu viet hoa " + countUpperCase(hoTen));

        String email = convert2Emal(ho, tenLot, ten);
        System.out.println("Email: " + email);
        String gmail = email2Gmail(email);
        System.out.println("Gmail: " + gmail);
    }
}
