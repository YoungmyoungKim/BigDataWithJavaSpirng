package ch05;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("--------------------------------------");
			System.out.println("����>");
			
			int num=scanner.nextInt();
			switch(num) {
			case 1: System.out.println("���ݾ�>");
					int plus=scanner.nextInt();
					balance+=plus;
					break;
			case 2: System.out.println("��ݾ�>");
					int minus=scanner.nextInt();
					balance-=minus;
					break;
			case 3: System.out.println("�ܰ�>"+balance);
					break;
			default: run = !run; break;			
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");

	}

}
