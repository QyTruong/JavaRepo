package lib2;

public class DoanThang {
    private Diem head;
    private Diem tail;
    public DoanThang(){
        this.head = new Diem(0,0);
        this.tail = new Diem(0,0);
    }
    public DoanThang(Diem head, Diem tail){
        this.head = head;
        this.tail = tail;
    }
    public void setHead(Diem head) {
        this.head = head;
    }
    public void setTail(Diem tail) {
        this.tail = tail;
    }
    public Diem getHead() {
        return head;
    }
    public Diem getTail() {
        return tail;
    }
    public String toString(){
        return "Doan thang [(" + head.getHoanhdo() + "," + head.getTungdo() + "), (" + tail.getHoanhdo() + "," + tail.getTungdo() + ")]";  
    }
    public double lengthOfLine(){
        return Diem.Distance(this.head, this.tail);
    }
    public Diem midPoint(){
        double x1 = head.getHoanhdo();
        double x2 = tail.getHoanhdo();
        double y1 = head.getTungdo();
        double y2 = tail.getTungdo();
        return new Diem((x1 + x2)/2, (y1 + y2)/2);
    }
    public boolean isParallel(DoanThang d2){
        double kq1 = (this.head.getHoanhdo()-this.tail.getHoanhdo())/(this.head.getTungdo()-this.tail.getTungdo());
        double kq2 = (d2.head.getHoanhdo()-d2.tail.getHoanhdo())/(d2.head.getTungdo()-d2.tail.getTungdo());
        if (kq1-kq2 == 0) return true;
        return false;
    }
}