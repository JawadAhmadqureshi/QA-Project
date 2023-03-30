package Practice;


class Parent{
	int son=5;
	public void son() {
		
		
		System.out.println(son);
	}
	
}

class mother extends Parent {
	int son=3;
	public void son() {
		
		
		System.out.println(this.son);
		System.out.println(super.son);
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		
		mother obj2= new mother();
		obj2.son();
	
	}

}
