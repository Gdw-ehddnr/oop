package exp;


class MinorException extends Exception{}
class SeriousException extends Exception{}

public class LostException {
	public static void main(String[] args) throws Exception{
		try {
			System.out.println("In. try-block");
			
			try {
				throw new SeriousException(); //1번: 여기서 예외 발생 
			} finally {
				System.out.println("In. finally-block"); //2번 : 내부 finally 무조건 실
			}
		} finally {
			System.out.println("Out. finally-block");// 3번: 외부 finally 무조건 실행
			throw new MinorException(); // 4번: 다시 예외 발생 (덮어쓰기 발생!)

		}
	}

}
