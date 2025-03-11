
public class HelloWorld {
	public static int sum (int i, int j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		int i;
		int j;
		char a;
		String b;
		final int Ten = 10;
		i = 1;
		j = sum(i, Ten);
		a = '?';
		b = "Hello Minsky!";
		System.out.println(a);
		System.out.println(b);
		System.out.println(Ten);
		System.out.println(j);
	}
}