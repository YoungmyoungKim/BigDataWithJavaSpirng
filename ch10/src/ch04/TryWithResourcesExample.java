package ch04;

import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		//try with resources��
		//try() ������ ���� ������ ��ü�� ����
		//��ü�� AutoCloseable �ؾ���. 
		//Scanner�� ��ϳ������� ������ ����� ������ �˾Ƽ� �ڿ� ���� ��.
		try(Scanner scanner=new Scanner(System.in);) {
			System.out.println("try ���: �޼����� �Է��ϼ���>");
			String msg=scanner.next();
			System.out.println("�Է� ����: "+msg);
		}catch(Exception e) {
			
		}

	}

}
