package ch07;

import java.util.Scanner;

public class ScannerInputExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//��ū ������ �ƴ� ���� ������ �Է¹޴� �޼ҵ� nextLine();  
		String str=scanner.nextLine();
		System.out.println(str);
		
		scanner.close();
	}

}
