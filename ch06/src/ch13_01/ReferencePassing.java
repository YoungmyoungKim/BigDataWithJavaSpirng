package ch13_01;

public class ReferencePassing {
	static class Circle{
		int radius;
		
		//»ý¼ºÀÚ
		Circle(int radius){
			this.radius=radius;
		}
	}

	public static void main(String[] args) {
		Circle pizza= new Circle(10);
		
		increase(pizza);    //call by reference
		
		System.out.println(pizza.radius);
	}
	
	static void increase(Circle p) {
		p.radius+=1;
	}

	
}
