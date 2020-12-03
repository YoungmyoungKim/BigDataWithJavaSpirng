package ch05.ch01;

public class MyExam {
	void method1() {
		method2();
	}
	
	void method2() {
		//강제 예외 발생시키기
		//throw new 예외 객체 생성자();
		try {
			throw new Exception("예외 발생");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MyExam2 m=new MyExam2();
		m.method1();
	}
	
}
