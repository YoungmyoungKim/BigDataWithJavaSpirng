package ch05;

public class Outter {
	String field= "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);  //���� ��� this.�ʵ�
			this.method();  ////���� ��� this.���
			
			//�ٱ��� ��� ����: �ٱ���.this.���
			System.out.println(Outter.this.field);  //���� ��� this.�ʵ�
			Outter.this.method(); 
		}
	}

}
