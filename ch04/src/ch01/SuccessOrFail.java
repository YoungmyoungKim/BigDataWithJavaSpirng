package ch01;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int score = scanner.nextInt();
		if(score>=80) {
			System.out.println("���ϵ帳�ϴ�. �հ��Դϴ�.");
		}
		
		scanner.close();
	}

}