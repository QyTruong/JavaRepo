package lib2;

public class PhanSo {
    private int tuso;
    private int mauso;
    public static int soPhanSoDaTao = 0;

    public PhanSo(){
        this.tuso = 0;
        this.mauso = 1;
        soPhanSoDaTao++;
    }
    public PhanSo(int tuso, int mauso){
        this.tuso = tuso;
        this.mauso = mauso;
        soPhanSoDaTao++;
    }
    public static int ucln(int tuso, int mauso){
        if (mauso == 0) return tuso;
        return ucln(mauso, tuso%mauso);
    }
    public int getMauso() {
        return mauso;
    }
    public int getTuso() {
        return tuso;
    }
    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    public void setTuso(int tuso) {
        this.tuso = tuso;
    }
    public static String rutgon(PhanSo ps){
        return ps.tuso/ucln(ps.tuso, ps.mauso) + "/" + ps.mauso/ucln(ps.tuso, ps.mauso);
    }
    public static String congPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso + ps2.tuso*ps1.mauso);
        int mauso = ps1.mauso*ps2.mauso;
        return "Phep cong: " + rutgon(new PhanSo(tuso, mauso));
    }
    public static String truPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso - ps2.tuso*ps1.mauso);
        int mauso = ps1.mauso*ps2.mauso;
        return "Phep tru: " + rutgon(new PhanSo(tuso, mauso));
    }
    public static String nhanPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.tuso);
        int mauso = (ps1.mauso*ps2.mauso);
        return "Phep nhan: " + rutgon(new PhanSo(tuso, mauso));
    }
    public static String chiaPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso);
        int mauso = (ps1.mauso*ps2.tuso);
        return "Phep chia: " + rutgon(new PhanSo(tuso, mauso));
    }
    public static String soSanh(PhanSo ps1, PhanSo ps2){
        if (rutgon(ps1).equals(rutgon(ps2)))
            return "2 Phan so bang nhau";
        if ((double)ps1.tuso/ps1.mauso > (double)ps2.tuso/ps2.mauso)
            return "Phan so 1 lon hon Phan so 2";
        return "Phan so 1 nho hon Phan so 2";
    }
    public String toString(){
        return tuso + "/" + mauso;
    }
}