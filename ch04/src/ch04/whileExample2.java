package ch04;

import java.util.Scanner;

public class whileExample2 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		int n=scanner.nextInt();
		while(n != -1) {
			sum+=n;
			count++;
			n=scanner.nextInt();
		}
		if(count==0) System.out.println("�Է� �� ���� �����ϴ�");
		else {
			System.out.println("������ ������ "+count+"�� �̸�,");
			System.out.println("����� "+ (double)sum/count +"�Դϴ�.");
		}
		

	}

}