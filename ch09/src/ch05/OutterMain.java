package ch05;

public class OutterMain {

	public static void main(String[] args) {
		Outter out=new Outter();
		
		Outter.Nested nested=out.new Nested();
		nested.print();

	}

}
