package lib2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.io.*;
import java.nio.file.Files;

public class DanhMucCauHoi {
    public static void themCauHoi(Scanner sc) throws IOException{
        sc.nextLine();
        System.out.print("Nhap noi dung cau hoi: ");
        String nd = sc.nextLine();

        System.out.print("Nhap phuong an A: ");
        String paA = sc.nextLine();

        System.out.print("Nhap phuong an B: ");
        String paB = sc.nextLine();

        System.out.print("Nhap phuong an C: ");
        String paC = sc.nextLine();
        
        System.out.print("Nhap phuong an D: ");
        String paD = sc.nextLine();

        System.out.print("Nhap dap an dung cho cau hoi nay (A/B/C/D): ");
        String dapan = sc.nextLine().toUpperCase();
    
        String myFile = UUID.randomUUID().toString();
        File file = new File("D:\\javaproject\\filetxt\\CauHoi\\" + myFile + ".txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(nd);
            writer.newLine();
            writer.write(paA);
            writer.newLine();
            writer.write(paB);
            writer.newLine();
            writer.write(paC);
            writer.newLine();
            writer.write(paD);
            writer.newLine();
            writer.write(dapan);
            writer.newLine();
        }

        System.out.println("Da them cau hoi thanh cong!");
    }

    public static void luyenThiTiengAnh(Scanner sc) throws IOException{
        File folder = new File("D:\\javaproject\\filetxt\\CauHoi");
        File[] files = folder.listFiles();

        if (files == null || files.length == 0){
            System.out.println("Khong co cau hoi nao trong danh sach!!!");
            return;
        }

        System.out.print("Hay nhap so luong cau hoi ban muon thuc hanh: ");
        int soCauHoi = sc.nextInt();
        sc.nextLine();

        ArrayList<File> cauHoiDuocChonRa = new ArrayList<>(Arrays.asList(files));
        Collections.shuffle(cauHoiDuocChonRa);
        
        int traLoiDung = 0;

        // Phong truong hop nguoi dung chon so luong cau hoi vuot qua so luoong cau hoi trong danh muc
        int soLuongCauHoi = Math.min(soCauHoi, cauHoiDuocChonRa.size());

        for (int i = 0; i < soLuongCauHoi; i++){
            File f = cauHoiDuocChonRa.get(i);
            List<String> line = Files.readAllLines(f.toPath());

            System.out.printf("\tCau hoi so %d: \n", i+1);

            String nd = line.get(0);
            String paA = line.get(1);
            String paB = line.get(2);
            String paC = line.get(3);
            String paD = line.get(4);
            String dapan = line.get(5);

            System.out.printf("Noi dung cau hoi: %s\n", nd);
            System.out.printf("Phuong an A: %s\n", paA);
            System.out.printf("Phuong an B: %s\n", paB);
            System.out.printf("Phuong an C: %s\n", paC);
            System.out.printf("Phuong an D: %s\n", paD);
            System.out.print("Moi ban chon phuong an cua minh (A/B/C/D): ");
            String choice;
            choice = sc.nextLine();

            if (choice.toUpperCase().equals(dapan)){
                System.out.println("Chuc mung ban, dap an cua ban dua ra dung!!!");
                traLoiDung++;
            }
            else {
                System.out.println("Dap an cua ban dua ra da sai!! =((");
            }
        }

        System.out.printf("Tong ket so cau tra loi dung cua ban: %d cau !!!\n\n", traLoiDung);
    }
}
