public class CungCau extends DaThuc {
 String mathang;
 boolean cung;
 CungCau(boolean laduongcung, String tenMH)
   {
	 super(); cung=laduongcung;mathang=tenMH;
    }
 CungCau (boolean laduongcung,String tenMH, double a, double b)
    {
	 super(0,a,b);
	 if (laduongcung&&a<0)throw new ArithmeticException("He so a cua duong cung phai>0");
	 if (!laduongcung&&a>0)throw new ArithmeticException("He so a cua duong cau phai<0");
	 cung=laduongcung;mathang=tenMH;}
 CungCau(String tenMH,double Q1, double P1, double Q2, double P2)
 {
	 double b= (P2-P1)/(Q2-Q1);
	 double c= P1-(P2-P1)*Q1/(Q2-Q1);
	 if (b>0)cung=true; else cung=false;
	 mathang=tenMH;
	 this.b=b;
	 this.c=c;
 }
 public double Gia(double SanLuong){return this.GiaTriDaThuc(SanLuong);}
 public double SanLuong(double Gia){return (Gia-c)/b;} 
 public void DiemCanBang(CungCau d)
 {
  DaThuc dt= this.CongDaThuc(d.NhanSoThuc(-1));
  String[] kq= dt.GiaiPhuongTrinh();
  double x= Double.parseDouble(kq[0]);
  System.out.println("Diem can bang tai Q1= "+x+" và P= "+ this.GiaTriDaThuc(x));
 }
 public String toString()
 {
  String rs=(cung?"Duong cung":"Duong cau")+" Mat hang: "+mathang+"\n";
  rs+="Phuong trinh= "+super.toString()+"\n";
  return rs;
  
 }
 
}

/*
   //Thu nghiem khoi tao cac duong cung cau theo phuong trinh
   	 CungCau S= new CungCau(true,"Lo vi song",3,10);
	 CungCau D= new CungCau(false,"Lo vi song",-20,100);
	 CungCau D1= new CungCau(false,"Lo vi song",20,100);
	 System.out.println(S);
	 System.out.println(D);
    
    
    //--------------------------------------------------- 
    //Thu nghiem khoi tao duong cung cau bang cac cap diem
    CungCau S1= new CungCau("Lo nuong",4,10,5,12);
    System.out.println(S1);
    CungCau D1= new CungCau("Lo nuong",10,10,9,12);
    System.out.println(D1);
    //--------------------------------------------------- 
    //Thu nghiem viec tinh Gia va San luong ung voi cac duong
   CungCau S= new CungCau(true,"Lo vi song",3,10);
   CungCau D= new CungCau(false,"Lo vi song",-2,100);
   System.out.println("Duong cung S");
   System.out.println(S);
   System.out.println("Duong cau D");
   System.out.println(D);

   double SoLuong=20;
   System.out.println("Neu san luong cung ung mat hang la "+SoLuong);
   System.out.println("Gia ban theo duong cung S la "+S.Gia(SoLuong));
   System.out.println("Gia mua theo duong cau D la "+D.Gia(SoLuong));
   double Gia=55;
   System.out.println("Neu muc gia ban/mua cua mat hang la "+Gia);
   System.out.println("So luong theo duong cung S la "+S.SanLuong(Gia));
   System.out.println("So luong theo duong cau D la "+D.SanLuong(Gia));
   
   //---------------------------------------------     
   //Thu nghiem viec tim diem can bang cung-cau
    	CungCau S= new CungCau(true,"Lo vi song",3,10);
	CungCau D= new CungCau(false,"Lo vi song",-20,100);
	System.out.println(S);
	System.out.println(D);
	System.out.println("Diem can bang cua mat hang la:");
	S.DiemCanBang(D);
	
	CungCau S1= new CungCau("Lo nuong",4,10,5,12);
    System.out.println(S1);
    CungCau D1= new CungCau("Lo nuong",10,10,9,12);
    System.out.println(D1);
	System.out.println("Diem can bang cua mat hang la:");
	D1.DiemCanBang(S1);


*/