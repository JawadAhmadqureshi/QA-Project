package Practice;


 class  add{
	public int No(int a, int b) {
		int c=a+b;
		return c;
		
	}
	public String car(String car1, String car2) {
		String car3=car1+car2;
		return car3;
		
	}
	
	
	
}
public class ReturnTypeMethod {

	public static void main(String[] args) {
	add aa=new add();
	
	int result ;
	result =aa.No(45, 45);
  System.out.println(result);
  
  String fullcar;
  fullcar=aa.car("red", "Honda");
  System.out.println(fullcar);
	}

}
