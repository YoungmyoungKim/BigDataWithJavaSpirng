package ch04;

public class StringEqualsExample {

	public static void main(String[] args) {
		//기본 타입으로 선언한 str1, str2는 주소값이 같음. -> 객체지향
		String str1="홍길동";
		String str2="홍길동";
		//생성자를 이용하여 객체를 새로 생성했기 때문에 str1, str2와는 주소 다름.  
		String str3=new String("홍길동");
		
		//참조 타입에서 == 연산자를 사용하면 참조번지가 같은지 여부를 물어보는 것 
		System.out.println("str1과 str2가 가리키는 저장소가 같은가? "+(str1==str2));
		System.out.println("str1과 str3가 가리키는 저장소가 같은가? "+(str1==str3));
		
		//str1, str2, str3의 물리주소 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//객체 내용이 같으면 hashcode 값이 같음
		//참조타입의 비교 메소드인 equals()는 hasycode()값으로 같은지 다른지 비교함 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println();
		
		//참조 타입에서 값 비교는 equals() 메소드로 비교해야 함. 
		System.out.println("str1과 str2의 내용은 같은가? "+(str1.equals(str2)));
		System.out.println("str1과 str3의 내용은 같은가? "+(str1.equals(str3)));
		

	}

}
