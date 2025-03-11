package array;

public class foreachEx {
	enum Week {월, 화, 수, 목, 금}
	//enum=열거형 -> 여러 값을 이름으로 나열해 정의하고 코드에서 미맂 정한 값만 사용 하도록 
	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		for (int k: n) {
			System.out.println(k + "");
			sum += k;
		}
		System.out.println("합은" + sum);
		
		
		for (String s : names)
			System.out.println(s + " ");
		System.out.println();
		
		
		for (Week day: Week.values())
			System.out.println(day + "요일 ");
		System.out.println();
	}
}
