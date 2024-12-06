import java.util.ArrayList;

//Khoi Cau
public class HinhCau extends HinhTron
{
		public HinhCau(){ super();}
	public HinhCau (double R)
	{
		super(0,0,R);
	}
	public double DienTichToanPhan()
	{
		return 4*R*R*SOPI;
	}
	public double TheTich()
	{
		return 4.0/3*SOPI*R*R*R;
	}
	public String toString()
	{
		 String s="Hinh cau ban kinh R= "+R+"\n";
		 s+="Dien tich mat cau= "+DienTichToanPhan()+"  The tich hinh cau= "+TheTich()+" (Pi="+SOPI+")\n";
		 return s;
	 }

}

/*
 HinhTron C= new HinhTron(1,1,1.5);
		HinhCau B= new HinhCau(3.6);
		System.out.println(B);
		System.out.println(C);
		B.setSOPI(3.14159);
		System.out.println(B);
		B.setR(4.1);
		System.out.println(B);
		System.out.println("Tao ArrayList va liet ke danh sach");
		ArrayList<HinhTron> list= new ArrayList<HinhTron>();
		list.add(C);
		list.add(B);
        list.forEach(c->System.out.println(c));
		
        
 */