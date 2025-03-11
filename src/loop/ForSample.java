package loop;

public class ForSample {
	public static void main(String[] args) {
		int sum=0;
		
		for (int i=1; i<=10; i++) { //for(초기문;조건식; 반복 후 작업) {작업}
			sum += i;
			System.out.println(i);
			if(i<=9)
				System.out.println("+");
			else {
				System.out.println("=");
				System.out.println(sum);
			}
		}
	}
}
