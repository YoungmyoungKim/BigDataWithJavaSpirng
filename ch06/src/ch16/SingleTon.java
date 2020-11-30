package ch16;

public class SingleTon {
	//자신의 타입 필드 선언 및 초기화
	private static SingleTon instance=new SingleTon();
	
	private SingleTon() {}  //생성자를 외부에서 호출할 수 없도록 

	public static SingleTon getInstance() {
		return instance;
	}	
}
