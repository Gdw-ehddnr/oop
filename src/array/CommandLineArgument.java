package array;

public class CommandLineArgument {
	public static void main(String[] args) {
		
		int sum = 0; //총합을 저장할 변
		System.out.println("Arguments: " );
		
		//반복문으로 args 배열을 순회하고 출력 + 합산 
		for (int i = 0; i < args.length - 1; i++) { // 마지막 인자를 반복문에서 제외한 이유: 마지막 원소 뒤에는 콤마를 출력하면 안되므로
			System.out.println(args[i] + ", "); // 현재 인자를 출력하고 
			sum += Integer.parseInt(args[i]); // 숫자로 변환해서 더해줌 
		}
		System.out.println(args[args.length -1]);  //마지막 인자 출력 
		sum += Integer.parseInt(args[args.length -1]); //마지막 인자를 숫자로 변환하고 합산 
		
		System.out.println("Sum = " + sum);
	}
}
 