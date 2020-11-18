package ch02;

import java.util.Scanner;

//키보드로부터 입력받는 api
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		final double PI=3.141592;
		
		System.out.println("문자열을 입력하세요> ");
		String message=scanner.next();
		//int message=scanner.nextInt();  //문자열로 입력된 숫자형 문자를 정수로 변환
		System.out.println("입력값 : "+message);
		System.out.println("입력값의 길이 :"+message.length());
		
		System.out.println("반지름을 실수로 입력하세요> ");
		double doubleNumber=scanner.nextDouble();
		System.out.println(PI*doubleNumber*doubleNumber);
		
	}

}
