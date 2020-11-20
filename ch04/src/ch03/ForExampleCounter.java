package ch03;

public class ForExampleCounter {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		//부동 소수점으로 하면 정확한 횟수 실행 X => 정수를 써야 함.
		

	}

}
