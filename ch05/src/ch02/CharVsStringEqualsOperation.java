package ch02;

public class CharVsStringEqualsOperation {

	public static void main(String[] args) {
		char c1='A';
		char c2='A';
		
		if(c1==c2) System.out.println("c1�� ���� c2�� ���� ����");
		
		//����Ÿ���� == ���� �����ϸ� �ּҰ� �������� ����. 
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1==s2) System.out.println("s1�� s2�� ����Ű�� �ּҰ� ����.");
		else System.out.println("s1�� s2�� ����Ű�� �ּҰ� �ٸ���.");
		
		if(s1.equals(s2)) System.out.println("s1�� s2�� ����Ű�� ���� ����.");
		else System.out.println("s1�� s2�� ����Ű�� ���� �ٸ���.");
		
		

	}

}
