package ch04;

public class Outter {
	void method(int arg) {//final int arg�� ���� ���� ��Ȯ�ϳ� ǥ������ �ʾƵ� ��.(�ڹ� ���� ������ ��� ��)
		//���÷� ����� Ŭ�������� ���Ǵ� ������ ������߸� �Ѵ�. 
		final int localVariable=1;
		
		//���� Ŭ�������� ������ �ʴ� ������ ��밡��(�� ���� ����). 
		int i=10;
		i=20;  
		
		//���� Ŭ����
		class Inner{
			void method2() {
				int result=arg+localVariable;
			}
		}
	}

}
