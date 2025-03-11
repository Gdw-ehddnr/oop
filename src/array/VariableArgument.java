package array;

public class VariableArgument {
	static void printArray(Object[] args) {
		for (Object o : args) System.out.println(o + "");
		System.out.println('.');
	}
	static void printAgain(Object... args) {
		for (Object o : args) System.out.println(o + "");
		System.out.println('.');
	}

	public static void main(String[] args) {
		Object[] test1 = {new String("OK?"), new Integer(34), new VariableArgument() };
		String[] test2 = {"go", "don't go"};
		
		
		
		printArray(test1);
		printArray(test2);
		
		printAgain();
		printAgain(test1);
		printAgain(test2);
	}
}
