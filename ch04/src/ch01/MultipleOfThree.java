package ch01;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int num=scanner.nextInt();
		
		if(num%3==0) System.out.println("3의 배수");
		else System.out.println("3의 배수가 아님");

	}

}
