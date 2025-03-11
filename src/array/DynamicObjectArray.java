package array;

import java.util.Arrays;
import java.util.Random;

class ValueObject {
	char value; //맴버 변수 
	
	public ValueObject(char c) { //생성자 
		this.value = c; //value 초기화 
	}

	public String toString() {return "V(" + value + ")"; } // 객체를 출력할 때 호출되는 메서드 (오버라이딩)
}
// 오버라이딩이란?
//  상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 것을 의미한다.

public class DynamicObjectArray{
	public static void main(String [] args) {
		Random r = new Random();
		ValueObject[] dynamicArray = new ValueObject[r.nextInt(10)]; //동적 배열 
		for (int i = 0; i < dynamicArray.length; i++) {
			char c = (char) ('a' + r.nextInt(26)); // 랜덤 소문자 생성
			dynamicArray[i] =new ValueObject(c);    // 생성한 문자로 객체 생성 후 배열에 저장
		}
		System.out.println("dynamicArray" + Arrays.toString(dynamicArray));
	}
}
