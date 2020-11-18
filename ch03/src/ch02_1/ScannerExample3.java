package ch02_1;

import java.util.Scanner;

public class ScannerExample3 {
//���� ������ ����, �ڹٴ� �� �� �̻��� ���� �����ϴ� ���� �Ұ��� 
	static int start, end;
	static Scanner scanner=new Scanner(System.in);
	static boolean play=true;
	
	public static void main(String[] args) {
		while(play) {
			setNumbers();
			
			playGame(start, end);
			
			checkContinue();
		}
		System.out.println("����");
	}
	
	static void setNumbers() {
		System.out.print("���� ����>  ");
		start=scanner.nextInt();
		System.out.print("���� ����>  ");
		end=scanner.nextInt();
	}
	
	static void playGame(int x, int y) {
		int start=x;
		int end=y;
		
		for(int i=start;i<=end;i++) {
			String str="";
			if((i%10)%3==0 && (i%10)!=0) str+="¦";
			if(i/10%3==0 & i>10) str+="¦";
			System.out.println(i+":"+str);
		}
	}
	
	static void checkContinue() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��� �ұ��?(y/n�� ���ϼ���)");
		char yesNo=scanner.next().charAt(0);   //��ĳ�ʷ� �Է¹��� ������ ���� 0��° ���ڸ� ����
		if(yesNo=='n'||yesNo=='N') play=!play;
		}	
}
