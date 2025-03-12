package exp;

import java.io.IOException;

public class TryException {
	//f() 메서드는 Math.Random으로 0~1사이의 난수를 반환함
	public static void f() throws IOException, ClassNotFoundException {
		double choice = Math.random();
		if (choice <= 0.33)
			System.out.println("Safely ended");
		else if (choice <= 0.66)
			throw new IOException("Throwing an IOException");
		else 
			throw new ClassNotFoundException("Throwing an ClassNotFoundException");
	}
	
	public static void main(String[] args) {
//		int i = 5/0;
		
		String s = null;
//		System.out.println(s.length());
		
//		if(s == null)
//			throw new NullPointerException("oops!");
		 try {
			f();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Here!");

	}

}
 