package ch05.ch01;

public class MyExam3 {
	void method1() throws Exception{
		method2();
		
	}
	
	void method2() throws Exception{
		//���� ���� �߻���Ű��
		//throw new ���� ��ü ������();
		throw new Exception("m2 ���� �߻�");
		
	}
	
	public static void main(String[] args) {
		MyExam3 m=new MyExam3();
		try {
			m.method1();
		}catch(Exception e) {}
		
	}
}
