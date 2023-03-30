package Practice;

public class OverRiding extends MethodOverloading{
 
	
	public void add(int a,int b)  {
		System.out.println(a-b);
	}
	  
  public void add(double a,double b) {
	  System.out.println(a+b);
  }
	
	public static void main(String[] args) {
		
		  OverRiding obj1 = new OverRiding();
		           obj1.add(23, 23);
		           obj1.add(50.0, 50.0);
		           
}
}
