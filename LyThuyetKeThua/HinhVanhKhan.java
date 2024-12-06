import java.util.ArrayList;

//Hinh Vanh Khan
public class HinhVanhKhan extends HinhTron {
	protected double r;
	public HinhVanhKhan(){super();r=0;}
	public HinhVanhKhan(double x, double y, double R, double r)
	  {super(x,y,R);this.r=r<=this.R?r:this.R;}
	public double getr(){return r;};
	public void setr(double r){this.r=r>this.R?this.r:r;}
	public double DienTich(){ return (R*R-r*r)*SOPI;}
	public long ViTriVoiDiem(Diem p)
	{
		long kq= super.ViTriVoiDiem(p);
		if (kq>=0) return kq;
		
		Diem q= new Diem(x,y);
		double kc= q.Dist(p);
		if (kc>=r)return 0;
		else return -1;
	
	}
	public String toString()
	 {
		 String s="Hinh vanh khan tam O("+x+","+y+")\n";
		 s+="Ban kinh lon R= "+R+" Ban kinh nho r= "+r+"\n";
		 s+="Chu vi ngoai= "+ChuVi()+"  Dien tich hinh vanh khan= "+DienTich()+" (Pi="+SOPI+")\n";
		 return s;
	 }
}

/*
HinhVanhKhan A= new HinhVanhKhan();
		HinhVanhKhan A1= new HinhVanhKhan(1,2,3,4);
		HinhVanhKhan A2= new HinhVanhKhan(1,2,3,2);
		System.out.println(A);
		System.out.println(A1);
		System.out.println(A2);
		A1.setr(1);
		A1.setSOPI(3.15);
		System.out.println(A1);

		System.out.println("Tao ArrayList va liet ke danh sach");
		ArrayList<HinhTron> list= new ArrayList<HinhTron>();
		list.add(A);list.add(A1);list.add(A2);
		list.add(new HinhTron(1,1,1));
		list.add(new HinhVanhKhan(1,1,1,1));
		list.forEach(c->System.out.println(c));
*/