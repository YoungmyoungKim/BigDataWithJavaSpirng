package ch04;

public class Point {
	private int x, y;
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);  //super()메소드를 통해서 부모 클래스의 private 필드에 접근 가능 
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}