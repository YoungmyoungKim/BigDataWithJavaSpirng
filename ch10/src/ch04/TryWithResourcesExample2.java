package ch04;

import java.util.Scanner;

public class TryWithResourcesExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("try 블록: 메세지를 입력하세요>");
			String msg=scanner.next();
			System.out.println("입력 내용: "+msg);
		}catch(Exception e) {
			
		}finally {
			System.out.println("자원 해제하기");
			scanner.close();
		}

	}

}
