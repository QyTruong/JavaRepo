//Hinh ellipse  DT=Pi*a*b
// Chu vi= 2*Pi* Can bac 2 (a*a+b*b)/2) 
public class HinhEllipse extends HinhVanhKhan{
	public HinhEllipse(){super();}
	public HinhEllipse(double x, double y, double a, double b){super(x,y,a,b);}
	public double ChuVi(){ return 2*SOPI*Math.sqrt((R*R+r*r)/2);}
	public double DienTich(){ return SOPI*R*r;}
	public String toString()
	 {
		 String s="Hinh ellipse tam O("+x+","+y+")\n";
		 s+="Ban kinh lon a= "+R+" Ban kinh nho b= "+r+"\n";
		 s+="Chu vi ellipse= "+ChuVi()+"  Dien tich ellipse= "+DienTich()+" (Pi="+SOPI+")\n";
		 return s;
	 }
}

/*
HinhEllipse e= new HinhEllipse(1,1,6,2);
		System.out.println(e);
		Object[] list= new Object[]{new HinhTron(1,2,0.5),
		                            new HinhVanhKhan(1,1,0.5,0.2),
		                            new HinhEllipse(0,0,3,1)
		                            };
		for(Object o:list )System.out.println(o);
		((HinhVanhKhan)list[1]).setR(((HinhEllipse)list[2]).getR());
		System.out.println(list[1]);
		
*/