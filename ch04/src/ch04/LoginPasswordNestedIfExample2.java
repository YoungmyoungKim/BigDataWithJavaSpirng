package ch04;

import java.util.Scanner;

public class LoginPasswordNestedIfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		while(true) {
			if(count==5) {
				System.out.println("로그인 시도 횟수 초과!!");
				break;
			}
			
			System.out.println("아이디를 입력하세요: ");
			String id=scanner.next();
			
			System.out.println("비밀번호를 입력하세요: ");
			String password=scanner.next();
			
			if(!id.equals("hong")) {  //로그인 실패
				System.out.println("아이디를 확인하세요. ");
				
			}
			else { 
				if(password.equals("1234")) {
					System.out.println(id+"님 환영합니다."); 
					break;
				}
				
				else  System.out.println("비밀번호를 확인하세요. ");
						
				}
			count++;
			System.out.println("로그인 시도 횟수: "+count);
		}
		scanner.close();
		System.out.println("종료!!");
	}
}
