package ch03;

//boolean Ÿ���� ���ͷ��� true/false �� �� ����.
public class LiteralExampleBoolean {

	public static void main(String[] args) {
		//boolean Ÿ���� ���� ���� �� true ����	
		boolean a= true;
		
		//boolean Ÿ���� ���� ���� �� �ʱⰪ���� ������ ��� �� true ����
		boolean b= 10>0;
		
		//boolean Ÿ���� �������� int Ÿ���� �� ���� �Ұ� 
		//boolean c=1;
		
		//a�� true�� ��� ���� 
		if(a) {
			System.out.println("Hello! a�� true �Դϴ�.");
		}
		
		//�ݺ��� 
		int i=1;
		while(a) {
			System.out.println("Hi");
			if(i==10) a=false;
			i=i+1;
			
		}
		
	}

}
