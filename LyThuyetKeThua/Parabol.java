
public class Parabol extends DaThuc {
	static private double kc=0.5;
	static private int sodiem=6;
	   private double delta;
	private double Delta(){return b*b-4*a*c;}
	public Parabol(){super(1,0,0);delta=Delta();}
	public Parabol(double a, double b, double c)
	{
	 if (a==0) throw new ArithmeticException("He so a cua Parabol=0");
	 this.a=a;this.b=b;this.c=c;delta=Delta();
	}
	public Diem ToaDoDinhParabol()
	{
		return new Diem(-b/2/a,-delta/4/a);
	}
	public String BienThien(double left, double right)
	{
		Diem dinh=ToaDoDinhParabol();
		if (a>0)
		{
		  if (dinh.X<=left) return "Nghich bien tren doan ["+left+","+right+"]";
		  if (dinh.X>=right)  return "Dong bien tren doan ["+left+","+right+"]";
		  return "Nghich bien tren doan ["+left+","+dinh.X+"] va Dong bien tren doan ["+dinh.X+","+right+"]";
		}
		if (a<0)
		{
		  if (dinh.X<=left) return "Dong bien tren doan ["+left+","+right+"]";
		  if (dinh.X>=right)  return "Nghich bien tren doan ["+left+","+right+"]";
		  return "Dong bien tren doan ["+left+","+dinh.X+"] va Nghich bien tren doan ["+dinh.X+","+right+"]";
		}
		return "";
	}
	public long ViTriDiemVoiParabol(Diem P)
	{
		double Y=this.GiaTriDaThuc(P.X);
		if (Y==P.Y) return 0;
		if (a>0&&P.Y>Y) return -1;
		if (a<0&&P.Y<Y) return -1;
		return 1;
		
	}
	public Diem[] VeParabol()
	{
	 Diem[] dsdiem= new Diem[sodiem];
	 Diem dinh=ToaDoDinhParabol();
	 double left=dinh.X-(sodiem/2)*kc;
	 for(int i=0;i<sodiem;i++)
	 {
		 Diem x= new Diem (left,this.GiaTriDaThuc(left));
		 dsdiem[i]=x;
		 left+=kc;
	 }
	 return dsdiem;  
	}
	public void GiaoDiemVoiParabol(DaThuc Q)
	{
		String[] kq=this.CongDaThuc(Q.NhanSoThuc(-1)).GiaiPhuongTrinh();
		System.out.println("Giao diem tai:");
		for(String s:kq)System.out.println(s);
	}
	public String toString()
	{
	   String rs="Parabol c� phuong trinh\n";
	   rs+=super.toString()+"\n";
	   rs+="Dinh Parabol la " +ToaDoDinhParabol().toString();
	   return rs;
	}
   }
   
   /*
		  //Thu nghiem khoi tao cac Parabol
		  //(P): 2x2+2x+4
		  Parabol P= new Parabol(2,2,4); 
		  System.out.println(P);
		  Parabol P1= new Parabol();
		  System.out.println(P1);
		  Parabol P2=null;
		  try
		  {
		  P2= new Parabol(0,6,-10);
		  }
		  catch(Exception e){System.out.print(e);}
		  if (P2!=null)System.out.println(P2);
		  //------------------------------------------
		  //Thu nghiem in thong tin va toa do dinh Parabol
		  Parabol P= new Parabol(2,2,4); 
		  System.out.println(P);
		  Parabol P1= new Parabol();
		  System.out.println(P1);
		  System.out.println("Toa do dinh cua P");
		  System.out.println(P.ToaDoDinhParabol());
		  System.out.println("Toa do dinh cua P1");
		  System.out.println(P1.ToaDoDinhParabol()); 
		  //------------------------------------------	    
		  //Thu nghiem tim gia tri y khi biet x
		  Parabol P= new Parabol(2,2,4); 
		  System.out.println(P);
		  Parabol P1= new Parabol();
		  System.out.println(P1);
		  System.out.println("Tung do tai diem x=0 cua P la "+P.GiaTriDaThuc(0));
		  System.out.println("Tung do tai diem x=1 cua P1 la "+P1.GiaTriDaThuc(1));
		  //------------------------------------------
		  //Thu nghiem tim danh sach cac diem de ve Parabol
		  Parabol P= new Parabol(2,2,4); 
		  Parabol P1= new Parabol();
		  //Danh sach cac diem de ve parabol P
		  System.out.println("Danh sach cac diem de ve parabol P");
		  Diem[] dsdiem= P.VeParabol();
		  for(Diem d:dsdiem)
			   System.out.println(d);
		  //Danh sach cac diem de ve parabol P1
		  System.out.println("Danh sach cac diem de ve parabol P1");
		  dsdiem= P1.VeParabol();
		  for(Diem d:dsdiem)
			   System.out.println(d);
		  //------------------------------------------   
		  //Thu nghiem vi tri diem M voi parabol
		  Parabol P= new Parabol(2,2,4); 
		  Parabol P1= new Parabol();
		  Diem M= new Diem();
		  System.out.println("Diem M: "+M);
		  System.out.println("Vi tri diem voi parabol P:");
		  System.out.println(P.ViTriDiemVoiParabol(M));
		  System.out.println("Vi tri diem voi parabol P1:");
		  long kq=P1.ViTriDiemVoiParabol(M);
		  System.out.println((kq==0?"Nam tren P1":(kq==1?"Nam ngoai P1":"Nam trong P1")));
		  //------------------------------------------	      
		 //Thu nghiem xet bien thien cua parabol tren doan [a,b]
		  Parabol P= new Parabol(2,2,4); 
		  Parabol P1= new Parabol();
		  System.out.println("Xet bien thien cua P tren doan [-4,5]");
		  System.out.println(P.BienThien(-4, 5));
		  System.out.println("Xet bien thien cua P1 tren doan [-4,5]");
		  System.out.println(P1.BienThien(-4, 5));
		  //------------------------------------------	   
		  //Thu nghiem tim giao diem cua Parabol voi Parabol, duong thang
		  Parabol P= new Parabol(2,2,4); 
		  Parabol P1= new Parabol(-1,0,10);
		  System.out.println("Parabol P");
		  System.out.println(P);
		  System.out.println("Parabol P1");
		  System.out.println(P1);
		  System.out.println("Xet giao diem giua P va P1");
		  P.GiaoDiemVoiParabol(P1);
		  //Duong thang D co phuong trinh 2x + 10
		  System.out.println("Duong thang D co phuong trinh 2x+10");
		  DaThuc D= new DaThuc(0,2,10);
		  System.out.println("Xet giao diem giua P va D");
		  P.GiaoDiemVoiParabol(D);
		  System.out.println("Xet giao diem giua P1 va D");
		  P1.GiaoDiemVoiParabol(D);	      
		  //------------------------------------------	   
	   
   */