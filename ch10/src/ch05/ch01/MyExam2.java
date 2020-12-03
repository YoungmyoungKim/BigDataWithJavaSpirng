package ch05.ch01;

public class MyExam2 {
	void method1() {
		try {
			method2();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	void method2() throws Exception{
		//강제 예외 발생시키기
		//throw new 예외 객체 생성자();
		throw new Exception("예외 발생");
		
	}
	
	public static void main(String[] args) {
		MyExam m=new MyExam();
		m.method1();
	}
}
