package ch02;

public class EqualsExample {

	public static void main(String[] args) {
		A a=new A();
		A a2=new A();
		
		if(a==a2) System.out.println("a�� a2�� �ּҰ� ����.");
		else System.out.println("a�� a2�� �ּҰ� �ٸ���.");
		
		if(a.equals(a2)) {
			System.out.println("a�� a2�� ����Ű�� ���� ����.");
		}else System.out.println("a�� a2�� ����Ű�� ���� �ٸ���.");
	}

}
