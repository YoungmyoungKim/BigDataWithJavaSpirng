package ch16;

public class SingleTon {
	//�ڽ��� Ÿ�� �ʵ� ���� �� �ʱ�ȭ
	private static SingleTon instance=new SingleTon();
	
	private SingleTon() {}  //�����ڸ� �ܺο��� ȣ���� �� ������ 

	public static SingleTon getInstance() {
		return instance;
	}	
}
