package ch03;

import java.util.Scanner;

public class ArrayDeclareNotValuesExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// 타입[] 변수=new 타입[길이];
		int[] intArr=new int[5];
		
		//length는 생성시 만들어짐. 
		System.out.println(intArr.length);
		
		//5개의 정수를 입력하여 평균을 구하는 프로그램
		for(int i=0; i<intArr.length;i++) {
			System.out.println(i+"번째 정수를 입력하세요: ");
			intArr[i]=scanner.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<intArr.length;i++) {
			sum+=intArr[i];
		}
		System.out.println("평균: "+sum/intArr.length);
		
	}

}
