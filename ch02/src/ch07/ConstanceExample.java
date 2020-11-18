package ch07;

public class ConstanceExample {

	public static void main(String[] args) {
		//상수 final 한 번 초기화 이후 값이 변하지 않는 변수  
		final double PI=3.141597;
		System.out.println(PI);
		
		/*에러남 -> 상수는 수정 불가 
		PI=3.151597;
		*/
		System.out.println(PI);

	}

}
