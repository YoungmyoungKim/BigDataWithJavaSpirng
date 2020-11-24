package ch02;

public class PrimitiveVsWrapperExample {

	public static void main(String[] args) {
		int i=10;
		String result;
		
		//result=i;   참조 타입에 기본 타입 값을 넣음
		
		Integer intValue=new Integer(10);
		result=intValue.toString();
		
		System.out.println(result);

	}

}
