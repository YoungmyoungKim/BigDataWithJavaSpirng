package ch03;

//���� ���ͷ�
//���� ���ͷ��� int Ÿ���� ���� Ÿ��
//���ͷ� �ڿ� l�̳� L�� ������ int Ÿ�� ���ͷ��� ������. 
public class LiteralExample1 {

	public static void main(String[] args) {
		int n=15; //10����
		int m=015;  //8����(octa)  0+8����
		int k=0x15;    //16����(hexa)  0x + 16����
		int b=0b0101;    //2����(binary)    0b+ 2����
		
		//���� Ÿ���� ���� l�� int�� �ι� ������ ���� ������ �� �ִ� long Ÿ�� 
		long l=24L;   //�⺻������ long Ÿ���� ���ͷ��� �ڿ� L�̳� l ����. 
		
		//10����, 8����, 16����, 2������ ���ͷ��� ������ ����Ǵ���
		//����� ����� ��� 10������ �ٲ㼭 ����� 
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		System.out.println(b);
		System.out.println(l);
	}

}
