package ch02;
import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean play=true;
		
		while(play) {
			System.out.print("���� ����>  ");
			int start=scanner.nextInt();
			
			System.out.print("���� ����>  ");
			int end=scanner.nextInt();
			
			for(int i=start;i<=end;i++) {
				String str="";
				if((i%10)%3==0 && (i%10)!=0) str+="¦";
				if(i/10%3==0 & i>10) str+="¦";
				System.out.println(i+":"+str);
			}
			
			System.out.println("��� �ұ��?(y/n�� ���ϼ���)");
			char yesNo=scanner.next().charAt(0);   //��ĳ�ʷ� �Է¹��� ������ ���� 0��° ���ڸ� ����
			if(yesNo=='n'||yesNo=='N') play=!play;
		}
		System.out.println("����");
	}

}
