package lib2;

public class PhanSo {
    private int tuso;
    private int mauso;
    private double ketQuaPhanSo;
    public static int soPhanSoDaTao = 0;

    public PhanSo(){
        this.tuso = 0;
        this.mauso = 1;
        this.ketQuaPhanSo = tuso/mauso;
        soPhanSoDaTao++;
    }
    public PhanSo(int tuso, int mauso){
        this.tuso = tuso;
        this.mauso = mauso;
        this.ketQuaPhanSo = tuso/mauso;
        soPhanSoDaTao++;
    }
    public static int ucln(int tuso, int mauso){
        if (mauso == 0) return tuso;
        return ucln(mauso, tuso%mauso);
    }
    public double getKetQuaPhanSo() {
        return ketQuaPhanSo;
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
    public static PhanSo rutgon(PhanSo ps){
        return new PhanSo(ps.tuso/ucln(ps.tuso, ps.mauso), ps.mauso/ucln(ps.tuso, ps.mauso));
    }
    public static PhanSo congPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso + ps2.tuso*ps1.mauso);
        int mauso = ps1.mauso*ps2.mauso;
        return rutgon(new PhanSo(tuso, mauso));
    }
    public static PhanSo truPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso - ps2.tuso*ps1.mauso);
        int mauso = ps1.mauso*ps2.mauso;
        return rutgon(new PhanSo(tuso, mauso));
    }
    public static PhanSo nhanPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.tuso);
        int mauso = (ps1.mauso*ps2.mauso);
        return rutgon(new PhanSo(tuso, mauso));
    }
    public static PhanSo chiaPhanSo(PhanSo ps1, PhanSo ps2){
        int tuso = (ps1.tuso*ps2.mauso);
        int mauso = (ps1.mauso*ps2.tuso);
        return rutgon(new PhanSo(tuso, mauso));
    }
    public static int soSanh(PhanSo ps1, PhanSo ps2){
        if (rutgon(ps1).equals(rutgon(ps2)))
            return 0;
        if ((double)ps1.tuso/ps1.mauso > (double)ps2.tuso/ps2.mauso)
            return 1;
        return -1;
    }
    public String toString(){
        return tuso + "/" + mauso;
    }
}