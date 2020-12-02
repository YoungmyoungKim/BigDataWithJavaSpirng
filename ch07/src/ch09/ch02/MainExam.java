package ch09.ch02;

public class MainExam {

	public static void main(String[] args) {
		B b=new B();   
		b.method();
		b.absMethod();
		
		//C c=new C();    //추상 클래스는 객체(실체)를 만들지 못함. 
		D d=new D();
		
		d.absMethod();
		d.method();
	}
}
