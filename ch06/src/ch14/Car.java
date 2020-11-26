package ch14;

public class Car {
	//field	
	 //static
	//생성되는게 아니고 로딩 됨. -객체 생성과 무관하게 사용 가능
	//해당 클래스에서 유일하게 하나만 생성
	//해당 클래스의 모든 객체가 공유할 수 있음 
	static int seq;    //정수형 변수 => 0으로 초기화 
	//non-static
	String name;       
	String color;
	int no;    //정수형 변수 => 0으로 초기화 
	
	//생성자
	public Car() {
		no=seq++;
		System.out.println(name+" 객체가 생성 되었습니다!"+no+" 번째 객체 입니다.");
		
		
	}
	
	//method
	//static
	static void Calc() {
		System.out.println("seq: "+seq+"대");
	}
	
	//non-static
	void carInfo() {
		System.out.println(no+", name: "+name+ ", color: "+color);
	}
}
