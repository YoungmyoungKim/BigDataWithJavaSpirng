package ch07;

import java.util.Scanner;

public class ScannerInputExample {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���>");
		String name=scanner.next();
		
		System.out.println("���ø� �Է��ϼ���>");
		String city=scanner.next();
		
		System.out.println("���̸� �Է��ϼ���>");
		int age=scanner.nextInt();
		
		System.out.println("ü���� �Է��ϼ���>");
		double weight=scanner.nextDouble();
		
		System.out.println("���� ����(true/false)�� �Է��ϼ���>");
		boolean single=scanner.nextBoolean();
		
		System.out.println("�̸�: "+name+" ,����: "+city+" ,����: "+age+" ,ü��: "+weight+" ,���� ����: "+(single? "�̱�":"��ȥ"));

		scanner.close();
	}

}
