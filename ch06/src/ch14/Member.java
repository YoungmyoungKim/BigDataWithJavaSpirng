package ch14;

public class Member {
	static int seq;   //0���� �ʱ�ȭ
	int sno;      //0���� �ʱ�ȭ
	String name;
	String email;
	
	Member(String name, String email){
		seq++;
		this.sno=seq;
		this.name=name;
		this.email=email;
	}
	void info() {
		System.out.println("ȸ�� ��ȣ: "+this.sno+" �̸�: "+this.name+" , "+this.email);
	}
	
	static void total() {
		System.out.println("�� ȸ����: "+seq+" ��");
	}
}
