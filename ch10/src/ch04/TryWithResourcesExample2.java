package ch04;

import java.util.Scanner;

public class TryWithResourcesExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("try ���: �޼����� �Է��ϼ���>");
			String msg=scanner.next();
			System.out.println("�Է� ����: "+msg);
		}catch(Exception e) {
			
		}finally {
			System.out.println("�ڿ� �����ϱ�");
			scanner.close();
		}

	}

}
