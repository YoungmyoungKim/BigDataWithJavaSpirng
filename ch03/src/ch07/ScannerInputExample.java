package ch07;

import java.util.Scanner;

public class ScannerInputExample {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요>");
		String name=scanner.next();
		
		System.out.println("도시를 입력하세요>");
		String city=scanner.next();
		
		System.out.println("나이를 입력하세요>");
		int age=scanner.nextInt();
		
		System.out.println("체중을 입력하세요>");
		double weight=scanner.nextDouble();
		
		System.out.println("독신 여부(true/false)를 입력하세요>");
		boolean single=scanner.nextBoolean();
		
		System.out.println("이름: "+name+" ,도시: "+city+" ,나이: "+age+" ,체중: "+weight+" ,독신 여부: "+(single? "싱글":"기혼"));

		scanner.close();
	}

}
