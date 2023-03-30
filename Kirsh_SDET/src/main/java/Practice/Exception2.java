package Practice;

import java.rmi.AccessException;

public class Exception2 {

	public static void main(String[] args) {
		
		
		try {int a=20;
		int b=0;
		int c=a/b;
		
		System.out.println(c);

	}catch (ArithmeticException  e) {
		System.out.println(e);
	}
		System.out.println("my name is jawad");

}
}