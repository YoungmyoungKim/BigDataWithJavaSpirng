package ch04;

import java.util.Scanner;

public class LoginPasswordNestedIfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		while(true) {
			if(count==5) {
				System.out.println("�α��� �õ� Ƚ�� �ʰ�!!");
				break;
			}
			
			System.out.println("���̵� �Է��ϼ���: ");
			String id=scanner.next();
			
			System.out.println("��й�ȣ�� �Է��ϼ���: ");
			String password=scanner.next();
			
			if(!id.equals("hong")) {  //�α��� ����
				System.out.println("���̵� Ȯ���ϼ���. ");
				
			}
			else { 
				if(password.equals("1234")) {
					System.out.println(id+"�� ȯ���մϴ�."); 
					break;
				}
				
				else  System.out.println("��й�ȣ�� Ȯ���ϼ���. ");
						
				}
			count++;
			System.out.println("�α��� �õ� Ƚ��: "+count);
		}
		scanner.close();
		System.out.println("����!!");
	}
}
