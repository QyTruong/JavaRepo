package lib2;

public class Diem {
    private double hoanhdo;
    private double tungdo;
    private static int stt = 0;
    private int tenDiem;

    public Diem(){
        this.hoanhdo = 0;
        this.tungdo = 0;
        stt++;
        tenDiem = stt;
    }
    public Diem(double hoanhdo, double tungdo){
        this.hoanhdo = hoanhdo;
        this.tungdo = tungdo;
        stt++;
        tenDiem = stt;
    }
    public double getHoanhdo() {
        return hoanhdo;
    }
    public double getTungdo() {
        return tungdo;
    }
    public void setHoanhdo(double hoanhdo) {
        this.hoanhdo = hoanhdo;
    }
    public void setTungdo(double tungdo) {
        this.tungdo = tungdo;
    }
    public String toString(){
        return "Diem " + tenDiem + "(" + this.hoanhdo + ", " + this.tungdo + ")\n";
    }
    public static double Distance(Diem d1, Diem d2){
        return Math.sqrt(Math.pow((d1.hoanhdo - d2.hoanhdo), 2) + Math.pow((d1.tungdo - d2.tungdo), 2));
    }
}
