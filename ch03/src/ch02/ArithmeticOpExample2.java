package ch02;

public class ArithmeticOpExample2 {
	public static void main(String[] args) {
		//�ڿ����� �� ¦, Ȧ ���� Ȯ��
		for(int i=0; i<=100; i++) {
			if(i%2==0) System.out.println(i+"¦��");
			else System.out.println(i+"Ȧ��");
		}
		//10�� �ڸ��� ¦, Ȧ ���� Ȯ��
		for(int i=10; i<=100; i++) {
			if(i/10%2==0) System.out.println(i+"�� ���ڸ��� ¦��");
			else System.out.println(i+"�� ���ڸ��� Ȧ��");
			
			if((i%10)%2==0)System.out.println(i+"�� ���� �ڸ� ���� ¦��");
		}
		
		
		for(int i=1; i<100; i++) {
			String str="";
			if((i%10)%3==0 && (i%10)!=0) str+="¦";
			if(i/10%3==0 & i>10) str+="¦";
			System.out.println(i+":"+str);
		}
		
		
	}

}
