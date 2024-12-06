//Hinh chop voi day la hinh tron
public class HinhChopTron extends HinhTru{
 public HinhChopTron(){super();}
 public HinhChopTron(double R, double H){super(R,H);}
 public double TheTich(){return super.TheTich()/3;}
 public double DienTichXungQuanh()
 {
 double CanhXien=Math.sqrt(H*H+R*R);
 return 2*SOPI*R*CanhXien;
 }
 public double DienTichToanPhan(){return DienTichXungQuanh()+DienTich();}
 public String toString()
 {
	 String s="Hinh chop tron chieu cao H="+H+", ban kinh day R= "+R+ "\n";
	 s+="Dien Tich Toan Phan= "+DienTichToanPhan()+"  The tich hinh tru= "+TheTich()+" (Pi="+SOPI+")\n";
	 return s;
 }
}
