public class Circle2 {
    private double x;
    private double y;
    private double R;
    Circle2 (){}

    Circle2 (double x, double y, double R) {
        this.x = x;
        this.x = y;
        this.R = R >= 0 ? R:0;
    }

    public String toString(){
        return "Vong tron co tam O {" + x + "," + y + "} va ban kinh R = " + R;
    }
}
