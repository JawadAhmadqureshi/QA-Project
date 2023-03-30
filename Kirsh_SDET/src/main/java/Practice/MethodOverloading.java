package Practice;


class MethodOverLoad{
	
	public void add(int a,int b) {
	   int c=a+b;
	   System.out.println(c);
	}
	public void add(int a,int b,int c) {
		int d=a+b+c;
	System.out.println(d);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverLoad lo=new MethodOverLoad();
		lo.add(25, 25);
		lo.add(10, 10, 10);
	

	}

}
