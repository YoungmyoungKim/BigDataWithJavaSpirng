package ch08.ch03;

public class UsingOverride {

	public static void main(String[] args) {
		Shape start, last, obj;
		start=new Line();
		last=start;    //last = start(Line)
		obj=new Rect();
		last.next=obj;
		last=obj;      //last = Rect
		obj=new Line();
		last.next=obj;
		last=obj;       //last=Line
		obj=new Circle();
		last.next=obj;    //현재 마지막 객체의 next 값은 Circle
		
		Shape p=start;
		while(p != null) {
			p.draw();
			p=p.next;
		}
		System.out.println();
		Shape[] shapes= {new Line(), new Rect(), new Line(), new Circle()};
		for(Shape s: shapes)
			s.draw();
	}
}
