package ch01;

import java.util.Scanner;

public class LoginPasswordNestedIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요: ");
		String id=scanner.next();
		
		System.out.println("비밀번호를 입력하세요: ");
		String password=scanner.next();
		
		if(!id.equals("hong")) {  //로그인 실패
			System.out.println("아이디를 확인하세요. ");
		}else { 
			if(password.equals("1234")) System.out.println(id+"님 환영합니다.");
			else System.out.println("비밀번호를 확인하세요. ");
			}
		scanner.close();

	}

}
