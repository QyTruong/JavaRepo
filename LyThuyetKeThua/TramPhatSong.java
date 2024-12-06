import java.util.ArrayList;

public class TramPhatSong extends HinhTron {
    public String MaTram;
    public String DiaChi;
    public double DoManh;
    public long SoLuongKetNoi;
    public ArrayList<DienThoai> danhsach;
    public TramPhatSong(){ super();}
    public TramPhatSong(String ma, String dc, double domanh, long somay, double r){
        this.MaTram = ma;
        this.DiaChi = dc;
        this.DoManh = domanh;
        this.SoLuongKetNoi = somay;
        this.R = r;
    }

    public String toString(){
        return String.format("Ma tram: %s\nDia chi: %s\nDo manh: %.2f\nSo luong may truy cap: %d\n",
        this.MaTram, this.DiaChi, this.DoManh,this.SoLuongKetNoi);
    }
}
