package ch03;

import java.util.Scanner;

public class ForExampleGugu {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����� ���ϴ� �� ���� �Է��ϼ���(2~9): ");
		int dan=scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
		}
		
		for(int i=1; i<10; i++) {
			System.out.println("\n");
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		
	}

}
