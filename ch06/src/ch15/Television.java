package ch15;

public class Television {
	static String company="Samsung";
	static String model="LCD";
	static String info;
	
	//static �ʱ�ȭ ���, �����ڰ� �ƴ϶� ��Ͽ��� �ʱ�ȭ. 
	//static ����� �� �� ����.(static ����� �ƴϸ� �ν��Ͻ�, static ��� ��� �� �� ����) 
	static { //��ü �ν��Ͻ� ���� ������ �������. ��ü ��������� ���� �ʱ�ȭ �Ϸ��� static����. 
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" + info + "]";
	}
}
