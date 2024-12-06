import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Diem P= new Diem(1,2);
		HinhTron C= new HinhTron(2,3,5);
		HinhVanhKhan V= new HinhVanhKhan(1,2,5,3);
		HinhTru T= new HinhTru(2, 4.7);
		HinhEllipse E= new HinhEllipse(5,3,10,2.5);
		ArrayList<HinhTron> ds= new ArrayList<HinhTron>();
		ds.add(C);ds.add(V);ds.add(E);
		for(HinhTron o:ds)System.out.println(o.DienTich());
		
		}
   
}





//Thu nghiem Mang/ArrayList cac doi tuong
// va thu nghiem casting
/*
 HinhVanhKhan[] list= new HinhVanhKhan[]{
				 new HinhVanhKhan(),
				 new HinhEllipse(),
				 new HinhTron()};
 HinhTron[] list= new HinhTron[]{
				 new HinhVanhKhan(),
				 new HinhEllipse(),
				 new HinhTron()};
				 
ArrayList<HinhTron> list= new ArrayList<HinhTron>();
		list.add(new HinhTron());
		list.add(new HinhVanhKhan());
		list.add(new HinhEllipse());
//down-casting
	   HinhTron P= new HinhTron();
	   HinhVanhKhan Q= (HinhVanhKhan)P;
	   HinhEllipse R= (HinhEllipse)Q;
	   HinhEllipse S= (HinhEllipse)P;
	   
	   //up-casting
	   HinhVanhKhan vk1= new HinhVanhKhan(); 
	   HinhTron C = vk1;
	   HinhTron C1= (HinhTron)vk1;	
	   
						 
*/