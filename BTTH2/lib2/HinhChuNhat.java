package lib2;

public class HinhChuNhat {
    private Diem topLeftPoint;
    private Diem botRightPoint;
    private double width;
    private double length;

    public HinhChuNhat(){
        this.topLeftPoint = new Diem(0,0);
        this.botRightPoint = new Diem(0,0);
        width = Diem.Distance(topLeftPoint, new Diem(topLeftPoint.getHoanhdo(), botRightPoint.getTungdo()));
        length = Diem.Distance(topLeftPoint, new Diem(botRightPoint.getHoanhdo(), topLeftPoint.getTungdo()));
    }
    public HinhChuNhat(Diem topLeftPoint, Diem botRightPoit){
        this.topLeftPoint = topLeftPoint;
        this.botRightPoint = botRightPoit;
        width = Diem.Distance(topLeftPoint, new Diem(topLeftPoint.getHoanhdo(), botRightPoint.getTungdo()));
        length = Diem.Distance(topLeftPoint, new Diem(botRightPoint.getHoanhdo(), topLeftPoint.getTungdo()));
    }
    public Diem getBotRightPoint() {
        return botRightPoint;
    }
    public Diem getTopLeftPoint() {
        return topLeftPoint;
    }
    public void setBotRightPoint(Diem botRightPoint) {
        this.botRightPoint = botRightPoint;
    }
    public void setTopLeftPoint(Diem topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double AreaOfRect(){
        return this.width*this.length;
    }
    public double perimeterOfRect(){
        return (this.width+this.length)/2;
    }
    public void show(){
        System.out.print("Diem tren trai: " + this.topLeftPoint);
        System.out.print("Diem duoi phai: " + this.botRightPoint);
        System.out.println("Dien tich: " + AreaOfRect());
        System.out.println("Chu vi: " + perimeterOfRect());
    }
}
