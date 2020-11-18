package ch02_1;

import java.util.Scanner;

public class ScannerExample3 {
//전역 변수로 설정, 자바는 두 개 이상의 값을 리턴하는 것이 불가능 
	static int start, end;
	static Scanner scanner=new Scanner(System.in);
	static boolean play=true;
	
	public static void main(String[] args) {
		while(play) {
			setNumbers();
			
			playGame(start, end);
			
			checkContinue();
		}
		System.out.println("종료");
	}
	
	static void setNumbers() {
		System.out.print("시작 구간>  ");
		start=scanner.nextInt();
		System.out.print("종료 구간>  ");
		end=scanner.nextInt();
	}
	
	static void playGame(int x, int y) {
		int start=x;
		int end=y;
		
		for(int i=start;i<=end;i++) {
			String str="";
			if((i%10)%3==0 && (i%10)!=0) str+="짝";
			if(i/10%3==0 & i>10) str+="짝";
			System.out.println(i+":"+str);
		}
	}
	
	static void checkContinue() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("계속 할까요?(y/n로 답하세요)");
		char yesNo=scanner.next().charAt(0);   //스캐너로 입력받은 문자의 제일 0번째 문자를 추출
		if(yesNo=='n'||yesNo=='N') play=!play;
		}	
}
