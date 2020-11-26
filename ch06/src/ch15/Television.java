package ch15;

public class Television {
	static String company="Samsung";
	static String model="LCD";
	static String info;
	
	//static 초기화 블록, 생성자가 아니라 블록에서 초기화. 
	//static 멤버만 올 수 있음.(static 블록이 아니면 인스턴스, static 멤버 모두 올 수 있음) 
	static { //객체 인스턴스 생성 이전에 만들어짐. 객체 만들어지기 전에 초기화 하려면 static으로. 
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" + info + "]";
	}
}
