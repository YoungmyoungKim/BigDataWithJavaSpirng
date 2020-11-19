package ch06;

import java.util.Date;

//System.out.printf(format, 값);
//%n: 줄바꿈
//%s: string
//%d: integer
//%f: float
//%0: 8진수
//%x: 16진수
//%b: boolean
//%e: 지수형식 
public class PrintfExample {

	public static void main(String[] args) {
		System.out.printf("%b%n", null);
		System.out.printf("%b%n", true);
		
		System.out.printf("Hello %s %n", "길동");
		System.out.printf("%15s%n", "하이");   //전체 문자열의 길이를 15로 잡고 오른쪽 정렬
		System.out.printf("%-15s%n", "하이");    //전체 문자열의 길이를 15로 잡고 왼쪽 정렬
		System.out.printf("%2.4s%n", "Hello World!");    //.4s: 출력할 문자 갯수 
		
		System.out.printf("%d%n", 100L);
		System.out.printf("%f%n", 123.456);
		System.out.printf("%5.2f%n", 123.456);   //.2f: 소숫점 두 자리수
		System.out.printf("%5.2e%n", 123.456);    //e 지수 표현 
		
		Date date=new Date();
		System.out.printf("hours:%tH, minute: %tM, second: %tS %n", date, date, date);
		System.out.printf("%tA, %tB, %tY %n", date, date, date);
		
		
		

	}

}
