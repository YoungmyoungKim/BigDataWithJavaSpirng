package ch14;

public class Car {
	//field	
	 //static
	//�����Ǵ°� �ƴϰ� �ε� ��. -��ü ������ �����ϰ� ��� ����
	//�ش� Ŭ�������� �����ϰ� �ϳ��� ����
	//�ش� Ŭ������ ��� ��ü�� ������ �� ���� 
	static int seq;    //������ ���� => 0���� �ʱ�ȭ 
	//non-static
	String name;       
	String color;
	int no;    //������ ���� => 0���� �ʱ�ȭ 
	
	//������
	public Car() {
		no=seq++;
		System.out.println(name+" ��ü�� ���� �Ǿ����ϴ�!"+no+" ��° ��ü �Դϴ�.");
		
		
	}
	
	//method
	//static
	static void Calc() {
		System.out.println("seq: "+seq+"��");
	}
	
	//non-static
	void carInfo() {
		System.out.println(no+", name: "+name+ ", color: "+color);
	}
}
