package ch02;

import java.util.Scanner;

public class ArithmeticOpExample6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean play=true;
		while (play) {
			System.out.print("정수를 입력하세요(1~100):  ");
			int i=scanner.nextInt();
			
			String str="";
			if((i%10)%3==0 && (i%10)!=0) str+="짝";
			if(i/10%3==0 & i>10) str+="짝";
			System.out.println(i+":"+str);
			
			System.out.println("계속 할까요?(y/n로 답하세요)");
			char yesNo=scanner.next().charAt(0);   //스캐너로 입력받은 문자의 제일 0번째 문자를 추출
			if(yesNo=='n'||yesNo=='N') play=!play;
		}
		System.out.println("종료");
		
	}
}
