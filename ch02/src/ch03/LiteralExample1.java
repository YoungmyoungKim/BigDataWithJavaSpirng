package ch03;

//정수 리터럴
//정수 리터럴은 int 타입이 기준 타입
//리터럴 뒤에 l이나 L이 없으면 int 타입 리터럴로 간주함. 
public class LiteralExample1 {

	public static void main(String[] args) {
		int n=15; //10진수
		int m=015;  //8진수(octa)  0+8진수
		int k=0x15;    //16진수(hexa)  0x + 16진수
		int b=0b0101;    //2진수(binary)    0b+ 2진수
		
		//정수 타입의 변수 l은 int의 두배 길이의 값을 저장할 수 있는 long 타입 
		long l=24L;   //기본적으로 long 타입의 리터럴은 뒤에 L이나 l 붙임. 
		
		//10진수, 8진수, 16진수, 2진수의 리터럴로 변수에 저장되더라도
		//저장된 결과는 모두 10진수로 바꿔서 저장됨 
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		System.out.println(b);
		System.out.println(l);
	}

}
