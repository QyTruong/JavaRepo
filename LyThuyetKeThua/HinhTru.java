public class HinhTru extends HinhTron{
	protected double H; 
	public HinhTru(){super(0,0,0);H=0;}
	public HinhTru(double R, double H){super(0,0,R);setH(H);}
	
	public double getH(){return H;};
	public void setH(double h){H=h>=0?h:H;}
	public double TheTich(){ return this.DienTich()*H;}
	public double DienTichDay(){ return DienTich();}
	public double DienTichXungQuanh(){return 2*SOPI*R*H;}
	public double DienTichToanPhan(){return DienTichXungQuanh()+2*DienTich();}
	public String toString()
	 {
		 String s="Hinh tru chieu cao H="+H+", ban kinh day R= "+R+ "\n";
		 s+="Dien Tich Toan Phan= "+DienTichToanPhan()+"  The tich hinh tru= "+TheTich()+" (Pi="+SOPI+")\n";
		 return s;
	 }
}

/*
        HinhTru h= new HinhTru(2,5);
		System.out.println(h);
		h.setSOPI(3.15);
		System.out.println(h);
		h.setH(h.getH()*2);
		System.out.println(h);
 */


