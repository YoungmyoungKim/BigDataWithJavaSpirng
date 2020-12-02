package ch08.ch03;

public class MethodOverridingEx {
	//메소드의 매개변수가 다양하게 변화됨(다형성)
	static void paint(Shape p) {
		p.draw();   //p가 가리키는 객체 내에 오버라이딩 된 draw() 호출. 동적 바인딩
	}

	public static void main(String[] args) {
		Shape s=new Shape();
		Line line=new Line();
		//paint 메소드에서 매개변수 확일할 때 shape으로 바껴서 실행
		//재정의 메소드는 부모타입으로 변환되더라도 재정의된 내용으로 실행
		s=line;
		paint(s);
		
		Rect r=new Rect();
		s=r;
		paint(s);
		
		s=new Circle();
		paint(s);  
		
		/*
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		*/
	}

}
