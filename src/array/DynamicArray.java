package array;
import java.util.Random;


public class DynamicArray {
	private static String printArray(int[] target) {
//		String s = "[";
//		
//		for (int i = 0; i < target.length; i++) {
//			s += target[i]; // 배열의 값을 하나씩 문자열에 더함 
//			if (i != target.length -1 ) // 마지막 값이 아니면 쉼표 붙임 
//				s+=",";
//		}
//		s += "]";
//		
//		return s;
		StringBuilder sb = new StringBuilder().append("["); //StringBuilder는 내부에서 가변한 char[]배열을 사용하여 문자열을 이어붙임 
		for (int i = 0; i < target.length; i++ ) {
			sb.append(target[i]); //append()는 새로운 객체를 생성하지 않고 기존 StringBuilder 인스턴스의 버퍼에 내용을 추가함. 
			if ( i != target.length -1)
				sb.append(',');
		}
		sb.append(']');
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] dynamicIntArray = new int[r.nextInt(10)]; //배열 크기가 동적임-> nextInt(10): 0~9까지의 정수 중 하나를 랜덤으로 반환 
		
		for (int i = 0; i < dynamicIntArray.length; i++)
			dynamicIntArray[i] = r.nextInt(100);
		System.out.println("dynamicIntArray" + printArray(dynamicIntArray)); 
	}
}
