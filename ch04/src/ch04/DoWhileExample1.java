package ch04;

public class DoWhileExample1 {

	public static void main(String[] args) {
		char c='a';
		
		do {
			System.out.println(c);
			c=(char)(c+1);    //������ �� int�� �Ǳ� ������ �ٽ� ���ڷ� �� ��ȯ
			
		}while(c<='z');

	}

}
