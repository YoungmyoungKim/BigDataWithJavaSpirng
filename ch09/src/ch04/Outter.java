package ch04;

public class Outter {
	void method(int arg) {//final int arg로 쓰는 것이 정확하나 표기하지 않아도 됨.(자바 낮은 버전은 써야 함)
		//로컬로 선언된 클래스에서 사용되는 변수는 상수여야만 한다. 
		final int localVariable=1;
		
		//내부 클래스에서 사용되지 않는 변수는 사용가능(값 변경 가능). 
		int i=10;
		i=20;  
		
		//로컬 클래스
		class Inner{
			void method2() {
				int result=arg+localVariable;
			}
		}
	}

}
