public class Circle3 {
    private double x;
    private double y;
    private double R;
    Circle3 (){x=y=R=0;};
    Circle3 (double x, double y, double R){
        this.x = x;
        this.y = y;
        setR(R);
    }

    public double getR(){return R;};
    public void setR(double R) {this.R = R >= 0 ? R : this.R;};
    public String toString(){
        return "Vong tron co tam O {" + x + "," + y + "} va ban kinh R = " + R;
    }
}
