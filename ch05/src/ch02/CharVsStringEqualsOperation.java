package ch02;

public class CharVsStringEqualsOperation {

	public static void main(String[] args) {
		char c1='A';
		char c2='A';
		
		if(c1==c2) System.out.println("c1의 값과 c2의 값이 같다");
		
		//참조타입은 == 으로 연산하면 주소가 같은지를 비교함. 
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1==s2) System.out.println("s1과 s2가 가리키는 주소가 같다.");
		else System.out.println("s1과 s2가 가리키는 주소가 다르다.");
		
		if(s1.equals(s2)) System.out.println("s1과 s2가 가리키는 값이 같다.");
		else System.out.println("s1과 s2가 가리키는 값이 다르다.");
		
		

	}

}
