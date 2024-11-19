package lib2;

import java.util.ArrayList;

public class DsPhanSo {
    private ArrayList<PhanSo> dsps;
    public DsPhanSo(){
        this.dsps = new ArrayList<>();
    }
    public void addPhanSo(PhanSo ps){
        dsps.add(ps);
    }
    public void removePhanSo(PhanSo ps){
        dsps.remove(ps);
    }
    public PhanSo sumListPhanSo(){
        PhanSo ps1 = dsps.get(0);
        for (int i = 1; i < dsps.size(); i++){
            ps1 = PhanSo.congPhanSo(ps1, dsps.get(i));
        }
        return ps1;
    }
    public void sortList(){
        dsps.sort((PhanSo a, PhanSo b) -> {return PhanSo.soSanh(a, b);});
    }
    public void showList(){
        for (PhanSo ps : dsps){
            System.out.print(ps + " ");
        }
        System.out.println();
    }
}
