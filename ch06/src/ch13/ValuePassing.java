package ch13;

public class ValuePassing {

	public static void main(String[] args) {
		int n=10;
		increase(n);  //기본 타입의 매개변수 값은 실값이 복사 되어서 전달됨. 
		System.out.println("n: "+n);    //원본 값은 변하지 않음 
		
	}
	
	static void increase(int m) {
		m+=1;
		System.out.println("m: "+m);
	}

}
