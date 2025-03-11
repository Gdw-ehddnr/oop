package loop;

public class Loop {
	public static boolean getBoolean() {
		boolean doLoop = Math.random() <0.8;
		if (!doLoop)
			System.out.println("false!");
		return doLoop;
	}
	
	public static void main(String[] args) {
		int loopCounter = 0;
		
		while (getBoolean()) { //while (조건) {작업}
			loopCounter++;
			System.out.println("true");
		}
		System.out.println("while ended (loopCounter=" + loopCounter + ").");
		
		loopCounter = 0;
		do { //do{..작업} while (조건식);
			loopCounter++;
			System.out.println("true");
		} while (getBoolean());
		System.out.println("do-while ended (loopCounter" + loopCounter + ").");
		
		for (char c = 0; c < 128; c++)
			if (Character.isLowerCase(c))
				System.out.println("char(" + c + ") Value= " + (int) c);
	}
	
}
