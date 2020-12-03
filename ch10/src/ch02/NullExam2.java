package ch02;

public class NullExam2 {

	public static void main(String[] args) {
		String data=null;
		//NullPointerException, ArrayIndexOutOfBoundsException, 
		//ClassCastException => 모두 Exception의 서브 클래스
		try {
			System.out.println(data.length()); 
		}catch(Exception e){
			System.out.println("예외 발생!"); 
		}
		
		try {
			System.out.println(args[1]);
		}catch(Exception e) {
			System.out.println("예외 발생!"); 
		}
		
		Animal animal=new Dog();
		try {
			Cat cat=(Cat)animal;
		}catch(Exception e) {
			System.out.println("예외 발생!");
		}
	}
}