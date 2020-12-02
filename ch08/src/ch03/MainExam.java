package ch03;

public class MainExam {
	public static void main(String[] args) {
		InterC c=new C();    //인터페이스는 구현 클래스 통해서 객체 생성
		InterD d=new D();
		
		c.method1();
		c.method2();
		c.method3();
		
		d.method4();
		
	}

}
