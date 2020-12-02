package ch04;

public class MainExam {

	public static void main(String[] args) {
		MyInterface mi=new B();
		mi.action();
		
		mi=new C();
		mi.action();
		
		mi=new D();
		mi.action();
		
		mi=new E();
		mi.action();
		
		System.out.println("\nMyInterface Array\n");
		MyInterface[] mis= {new B(), new C(), new D(), new E()};
		
		for(MyInterface m: mis) {
			mi.action();
		}
	}
}
