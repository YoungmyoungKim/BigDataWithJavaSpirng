package ch01;

import java.util.Scanner;

public class LoginFailExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요: ");
		String id=scanner.next();
		if(!id.equals("hong")) {
			System.out.println("아이디를 확인하세요. ");
		}else System.out.println("로그인 성공! ");
		scanner.close();
	}

}
