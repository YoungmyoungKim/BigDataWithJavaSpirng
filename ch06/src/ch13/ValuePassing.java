package ch13;

public class ValuePassing {

	public static void main(String[] args) {
		int n=10;
		increase(n);  //�⺻ Ÿ���� �Ű����� ���� �ǰ��� ���� �Ǿ ���޵�. 
		System.out.println("n: "+n);    //���� ���� ������ ���� 
		
	}
	
	static void increase(int m) {
		m+=1;
		System.out.println("m: "+m);
	}

}
