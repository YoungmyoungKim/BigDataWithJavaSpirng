package ch03;

//�Ǽ� ���ͷ�
//�Ǽ� Ÿ���� ���ͷ��� java������ double Ÿ���� ����Ʈ Ÿ������ ������. 
//-�Ǽ� ���� �ڿ� f�� d�� ������ ������ double Ÿ������ ����. 
public class LiteralExample2 {

	public static void main(String[] args) {
		//�Ǽ� ���ͷ� => ���� �Ҽ��� ���, �ε� �Ҽ��� ���
		double a=0.1234;   //���� �Ҽ��� ���
		double b=1234E-4;   //�ε� �Ҽ��� ��� 1234*10^(-4)
		
		//������ �Ǽ�(32bit)�� float
		float c=0.1234f;  //���� �ڿ� f�� ����, f �Ⱥ��̸� double�� �����ϱ� ������ ���� ��. 
		
		//������ �Ǽ�(64bit)�� double
		double d=.1234d;  //���� �ڿ� d�� ����  
		
		/* ���� ���� Ÿ�԰� �ʱⰪ�� Ÿ���� �ٸ� ��� 
		 * double e=1234E-4F;   // �� ���� ����. ���� �� ���� Ÿ���� ũ�Ⱑ ���� �������� ũ�⺸�� ŭ. 
		 * float f=0.1234D;     //�� ���� �Ұ���. ���� �� ���� Ÿ���� ũ�Ⱑ ���� �������� ũ�⺸�� �۱� ����. 
		 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
