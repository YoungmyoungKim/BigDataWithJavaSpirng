package ch02;

import java.util.Scanner;

public class ArithmeticOpExample5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(1~100):  ");
		int i=scanner.nextInt();
		String str="";
		if((i%10)%3==0 && (i%10)!=0) str+="¦";
		if(i/10%3==0 & i>10) str+="¦";
		System.out.println(i+":"+str);
				
	}
}
