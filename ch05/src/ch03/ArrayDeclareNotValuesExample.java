package ch03;

import java.util.Scanner;

public class ArrayDeclareNotValuesExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// Ÿ��[] ����=new Ÿ��[����];
		int[] intArr=new int[5];
		
		//length�� ������ �������. 
		System.out.println(intArr.length);
		
		//5���� ������ �Է��Ͽ� ����� ���ϴ� ���α׷�
		for(int i=0; i<intArr.length;i++) {
			System.out.println(i+"��° ������ �Է��ϼ���: ");
			intArr[i]=scanner.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<intArr.length;i++) {
			sum+=intArr[i];
		}
		System.out.println("���: "+sum/intArr.length);
		
	}

}
