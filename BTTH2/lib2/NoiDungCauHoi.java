package lib2;

import java.util.ArrayList;

public class NoiDungCauHoi {
    private String cauhoi;
    private ArrayList<String> pa;
    private String ketqua;

    public NoiDungCauHoi(){}

    public NoiDungCauHoi(String cauhoi, String ketqua){
        this.cauhoi = cauhoi;
        this.ketqua = ketqua;
        this.pa = new ArrayList<>();
    }

    public String getCauhoi() {
        return cauhoi;
    }
    public String getKetqua() {
        return ketqua;
    }
    public ArrayList<String> getPa() {
        return pa;
    }
    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }
    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    public void setPa(ArrayList<String> pa) {
        this.pa = pa;
    }
}
