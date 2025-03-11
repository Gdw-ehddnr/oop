
public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		// 대입 연산자 사례
		a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		System.out.println("a = " + a + ", b = "+ b + ", c = " + c);
		
		int d=3;
		a = d++; //d를 1증가하고 증가 전의 값 반환 
		System.out.println("a = " + a + ", d = " + d);
		a = ++d;  //d를 1 증가하고 증가된 값 반환 
		System.out.println("a = " + a + ", d = " + d);
		a = d--; //d를 1 감소하고 감소 전의 값 반환 
		System.out.println("a = " + a + ", d = " + d);
		a = --d; //d를 1 감소하고 감소된 값 반환 
		System.out.println("a = " + a + ", d = " + d);
	}
}
