import java.util.ArrayList;

public class DienThoai extends Diem {
    public String SoDienThoai;
    public boolean HoatDong;
    public String MaTram;
    Diem viTriDT;
    public DienThoai(){}
    public DienThoai(String sdt, boolean tt, double x, double y, String maTram){
        this.SoDienThoai = sdt;
        this.HoatDong = tt;
        this.X = x;
        this.Y = y;
        this.viTriDT = new Diem(x,y);
        this.MaTram = maTram;
    }
    public DienThoai(DienThoai d){}
    public void BatDienThoai(){
        if (HoatDong == true){
            System.out.println("ON");
        }
        else System.out.println("OFF");
    }
    public String toString(){
        return "";
    }
    public boolean CoThePhucVu(TramPhatSong Tram){
        if (Tram.ViTriVoiDiem(this.viTriDT) == 1 || Tram.DoManh == 0){
            return false;
        }
        return true;
    }
    public void TimTram(ArrayList<TramPhatSong> ds){
        long luotTruyCap = Integer.MAX_VALUE;
        TramPhatSong tps = null;
        for (TramPhatSong tram: ds){
            if (CoThePhucVu(tram) == true){
                if (tram.SoLuongKetNoi < luotTruyCap){
                    luotTruyCap = tram.SoLuongKetNoi;
                    tps = tram;
                }
            }
        }
        System.out.println("Tram phat song tot nhat co kha nang phuc vu:");
        if (tps != null){
            System.out.println(tps);
        }
    }
}
