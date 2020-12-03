package ch02;

public class OutterMain {
	public static void main(String[] args) {
		//바깥타입.안쪽타입 변수=new 바깥클래스.안쪽클래스()
		//A객체 생성 전 B 객체에 바로 접근 가능 
		A.B b=new A.B();
		
		//인스턴스 필드 & 메소드
		b.field1=3;
		b.method1();
		
		//static 멤버, 클래스 명으로 접근
		A.B.field2=3;
		A.B.method2();
	}

}
