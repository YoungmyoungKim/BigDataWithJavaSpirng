package ch01;

import java.util.Scanner;

public class LoginFailExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���: ");
		String id=scanner.next();
		if(!id.equals("hong")) {
			System.out.println("���̵� Ȯ���ϼ���. ");
		}else System.out.println("�α��� ����! ");
		scanner.close();
	}

}
