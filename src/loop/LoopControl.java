package loop;

public class LoopControl {
	public static void main(String[] args) {
		loop:
			for (int outer =0; outer < 4; outer++) {
				System.out.println("begin - outer(" + outer + ").");
				
				for (int inner = 0; inner<4; inner++) {
					System.out.println(String.format("\touter(%d), inner(%d).", outer, inner)); // \t = 공백을 의미
					
					if (outer == 0) break;
					if (inner == 1) continue;
					
					if (outer == 2) break loop;
					if (inner%3 == 0) continue loop;
					
					System.out.println(String.format("\touter(%d), inner(%d).", outer, inner));
				}
				
				System.out.println(String.format("end - outer(%d).", outer));
			}
		System.out.println("all over");
	}

}
