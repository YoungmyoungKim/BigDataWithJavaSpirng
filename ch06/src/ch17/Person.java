package ch17;

public class Person {
	final String nation="Korea";   //����� ����� ���ÿ� �ʱ�ȭ
	final String ssn;    //�����ڿ��� �ʱ�ȭ�ϱ� ������ ���� �ƴ�. 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
