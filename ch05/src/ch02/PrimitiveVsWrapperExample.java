package ch02;

public class PrimitiveVsWrapperExample {

	public static void main(String[] args) {
		int i=10;
		String result;
		
		//result=i;   ���� Ÿ�Կ� �⺻ Ÿ�� ���� ����
		
		Integer intValue=new Integer(10);
		result=intValue.toString();
		
		System.out.println(result);

	}

}
