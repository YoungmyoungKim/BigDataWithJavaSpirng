package ch05.ch01;

public class MyExam {
	void method1() {
		method2();
	}
	
	void method2() {
		//���� ���� �߻���Ű��
		//throw new ���� ��ü ������();
		try {
			throw new Exception("���� �߻�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MyExam2 m=new MyExam2();
		m.method1();
	}
	
}
