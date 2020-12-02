package ch08.ch04;

public class Shape {
	protected String name;
	public void paint() {draw();}
	public void draw() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape b=new Circle();
		b.paint();
	}
}

class Circle extends Shape{
	protected String name;
	@Override
	public void draw() {
		name="Circle";
		super.name="Shape";   //정적 바인딩(연결)- 부모의 변수에 내용 저장
		super.draw();    //정적 바인딩 - 부모의 메소드 실행
		System.out.println(name);
	}
}