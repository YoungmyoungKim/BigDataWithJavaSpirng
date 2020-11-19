package ch04;

import java.util.Scanner;

public class CompareOperationExampleScanner2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean op=true;
		while(op) {
			System.out.println("확인할 문자를 입력하세요: ");
			char c=scanner.next().charAt(0);
			
			//아스키코드에 해당하는 정수값으로 바뀐 뒤 비교 
			if((c>'0')&&(c<'9')) System.out.println("숫자입니다!");
			else if((c>='A')&&(c<='Z'))  System.out.println("영문 대문자 입니다!");
			else if((c>='a')&&(c<='z'))  System.out.println("영문 소문자 입니다!");
			else System.out.println("숫자나 영문이 아닙니다!");
			
			System.out.println("계속 할까요?(y/n로 답하세요)");
			String yesNo=scanner.next();
			
			/*기본 타입만 비교연산자로 연산 가능, 참조 타입(ex. String)은 메소드 사용해야 함. 
			if(yesNo=="n"||yesNo=="N") op=!op;
			*/
			
			//변수.equals(값) <- 변수의 값과 비교대상이 같은지 비교하는 메소드 
			if(yesNo.equals("n")||yesNo.equals("N")) op=!op;
		}
		scanner.close();
		System.out.println("종료");
	}
}
