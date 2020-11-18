package ch01;

public class BitReverseOperationExample {

	public static void main(String[] args) {
		int v1=10;
		int v2=~v1;
		int v3=~v1 +1;   //비트연산
		System.out.println(toBinaryString(v1)+" (십진수: " +v1+")");
		System.out.println(toBinaryString(v2)+" (십진수: " +v2+")");
		System.out.println(toBinaryString(v3)+" (십진수: " +v3+")");
		System.out.println();
		
		int v4=-10;
		int v5=~v4;
		int v6=~v4 +1;
		System.out.println(toBinaryString(v1)+" (십진수: " +v4+")");
		System.out.println(toBinaryString(v2)+" (십진수: " +v5+")");
		System.out.println(toBinaryString(v3)+" (십진수: " +v6+")");
		System.out.println();
	
	}
	
	//int 타입의 값을 받아서 처리 후 String 타입으로 전달하는 메소드 
	public static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
		
		while(str.length() < 32) {
			str="0"+str;
		}
		return str;
	}

}
