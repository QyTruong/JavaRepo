class A
{
	public A(){System.out.println("==>Ham khoi tao A");}
	public void func(){System.out.println("Ham funcA()");}
}
class B extends A
{
	public B(){System.out.println("==>Ham khoi tao B");}
	public void func(){System.out.println("Ham funcB()");}
}
class C extends B
{
	public C(){System.out.println("Ham khoi tao C");}
	public C(long a){System.out.println("Ham khoi tao C(long a)");}
	public void func(){
		System.out.println("Ham funcC()");
		
	    }
}
public class GoiHamKhoiTao {

	public static void main(String[] args) {
		C c = new C();
		c= new C(12L);
	}

}
