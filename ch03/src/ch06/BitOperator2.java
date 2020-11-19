package ch06;

public class BitOperator2 {

	public static void main(String[] args) {
		byte c=20;    //0x14
		byte d=-8;    //0xf8
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);    //c를 2비트 왼쪽 시프트
		System.out.println(c>>2);    //c를 2비트 오른쪽 시프트, 0 삽입
		System.out.println(d>>2);    //상위 부호 비트 1이 채워짐
		System.out.println(d>>>2);    //0이 채워짐 
		System.out.printf("%x\n", (d>>>2));    
		
		
	}

}
