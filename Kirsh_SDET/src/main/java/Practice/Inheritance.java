package Practice;

public class Inheritance {

	public void age() {
		
		int age =30;
		System.out.println(age);
	}
	
	public void name() {
		
		String st="my name is jawad";
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		
		Inheritance obj =new Inheritance();
		obj.age();
		obj.name();

	}

}

class Inh extends Inheritance {
	
	public void location() {
		String st2="Belong to pakistan";
	}
	
	public void continent() {
		
		String st3=" Asia";
		
	}
	public static void main (String []arg) {
		
		Inh obj2= new Inh();
		obj2.age();
		obj2.continent();
		obj2.name();
	}
}
	class Mul extends Inh{
		
		public void war() {
			String ist="win 1965";
			System.out.println(ist);
			
		}
		public static void main (String []arg) {
			Mul obj4=new Mul();
			obj4.continent();
			obj4.name();
			obj4.war();
			
		}
				
	}
	

