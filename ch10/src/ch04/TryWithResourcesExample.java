package ch04;

import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		//try with resources절
		//try() 내에서 선언 가능한 객체의 조건
		//객체가 AutoCloseable 해야함. 
		//Scanner가 블록내에서만 쓰여서 블록이 끝나면 알아서 자원 해제 됨.
		try(Scanner scanner=new Scanner(System.in);) {
			System.out.println("try 블록: 메세지를 입력하세요>");
			String msg=scanner.next();
			System.out.println("입력 내용: "+msg);
		}catch(Exception e) {
			
		}

	}

}
