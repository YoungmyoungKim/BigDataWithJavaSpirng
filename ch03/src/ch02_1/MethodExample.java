package ch02_1;

public class MethodExample {
	public static void main(String[] args) {
		//��ȯ ���� �ִ� �޼ҵ� ȣ��� ��� ���� �޾Ƽ� ó��
		int result1=method1(5);
		System.out.println(result1);
		
		//void Ÿ�� �޼ҵ� ȣ�� �޼ҵ�� ȣ��
		method2(5);
		
		//���� �� �ް� ����� �����ϴ� �޼ҵ� ȣ��
		String msg=method3();
		System.out.println(msg);
		
		//�Ű����� �����ʰ� ���ϰ��� ���� �޼ҵ� 
		method4();
		
		
	}
	//���� �Է¹ް� ����� �ǵ����ִ� �޼ҵ�
	static int method1(int x) {
		return 0;
	}
	
	//���� �Է¹ް� ����� �ǵ������� �ʴ� �޼ҵ�
	static void method2(int x) {
		System.out.println(x);
	}
	
	//���� ���� �ʰ� ����� ��ȯ�ϴ� �޼ҵ�
	static String method3() {
		return "����� �ǵ�����";
	}
	
	//���� ���� �ʰ� ����� ��ȯ���� �ʴ� �޼ҵ�
	static void method4() {
		System.out.println("���� �ȹް� �ǵ��������� ����");
	}
}
