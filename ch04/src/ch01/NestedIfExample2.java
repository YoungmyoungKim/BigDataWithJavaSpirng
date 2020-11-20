package ch01;

import java.util.Scanner;

public class NestedIfExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		int score=scanner.nextInt();
		System.out.println("학년을 입력하세요(1~4): ");
		int year=scanner.nextInt();
		
		if(score>=60) {
			if(year != 4) {
				System.out.println("합격");   //4학년 아니고 60점 이상
			}else if(score>=70) System.out.println("합격");  //4학년 & 70점 이상
			
			else System.out.println("불합격");   //4학년 & 70점 미만
			
		}else System.out.println("불합격");
		
		scanner.close();
	}

}
