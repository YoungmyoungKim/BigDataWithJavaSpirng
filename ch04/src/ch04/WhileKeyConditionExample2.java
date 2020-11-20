package ch04;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyConditionExample2 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed=0;
		int keyCode=0;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("----------------------------");
				System.out.println("선택: ");
			}
		
			keyCode=scanner.nextInt();
			
			if(keyCode==1) {  
				speed++;
				System.out.println("현재 속도= "+speed);
			}
			else if(keyCode==2) {
				speed--;
				System.out.println("현재 속도= "+speed);
			}
			else if(keyCode==3) {
				run=!run;
			}
		}
		System.out.println("종료");
		scanner.close();
	}

}
