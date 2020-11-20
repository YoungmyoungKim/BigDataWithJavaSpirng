package ch04;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyConditionExample {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed=0;
		int keyCode=0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("----------------------------");
				System.out.println("����: ");
			}
			keyCode=System.in.read();   //1byte�� ���� �о� 4byte int������ ����  
		
			if(keyCode==49) {  
				speed++;
				System.out.println("���� �ӵ�= "+speed);
			}
			else if(keyCode==50) {
				speed--;
				System.out.println("���� �ӵ�= "+speed);
			}
			else if(keyCode==51) {
				run=!run;
			}
		}
		System.out.println("����");
	}

}
