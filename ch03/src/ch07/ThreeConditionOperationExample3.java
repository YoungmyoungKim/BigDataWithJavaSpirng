package ch07;

import java.util.Scanner;

public class ThreeConditionOperationExample3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean op=true;
		while(op) {
			System.out.println("확인할 문자를 입력하세요: ");
			char c=scanner.next().charAt(0);
			
			String str=((c>'0')&&(c<'9')? "숫자": 
				((c>='A')&&(c<='Z')? "영문 대문자": 
					((c>='a')&&(c<='z')? "영문 소문자":"기타 문자")));
			System.out.println(str+" 입니다!");
			
			System.out.println("계속 할까요?(y/n로 답하세요)");
			String yesNo=scanner.next();
			
			op=(yesNo.equals("n")||yesNo.equals("N"))? !op :op;
		}
		scanner.close();
		System.out.println("종료");
	}
}
