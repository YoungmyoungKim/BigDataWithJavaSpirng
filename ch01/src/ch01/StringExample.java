package ch01;

public class StringExample {

	public static void main(String[] args) {
		//문자열 값으로 문자열 변수에 저장
		String str1="abc";
		System.out.println(str1);
		
		//문자타입 배열 변수=초기값
		char data[]= {'a', 'b', 'c'};
		System.out.println(data);
		
		//문자타입 배열로 문자열 생성하는 명령문
		String str=new String(data);
		System.out.println(str);
		
		//문자타입 배열의 각 요소를 출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
  