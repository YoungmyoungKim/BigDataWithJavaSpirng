package ch01;

import java.util.Scanner;

public class LoginPasswordNestedIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���: ");
		String id=scanner.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���: ");
		String password=scanner.next();
		
		if(!id.equals("hong")) {  //�α��� ����
			System.out.println("���̵� Ȯ���ϼ���. ");
		}else { 
			if(password.equals("1234")) System.out.println(id+"�� ȯ���մϴ�.");
			else System.out.println("��й�ȣ�� Ȯ���ϼ���. ");
			}
		scanner.close();

	}

}
