package ch16;

public class SingleTonMainExample {

	public static void main(String[] args) {
		//�Ұ�
		//SingleTon obj1=new SingleTon();   
		SingleTon obj1=SingleTon.getInstance();
		SingleTon obj2=SingleTon.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� SingleTon ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� SingleTon ��ü�Դϴ�.");
		}
		
	}

}
