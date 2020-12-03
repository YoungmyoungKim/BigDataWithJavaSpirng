package ch02;

public class NullExam5 {

	public static void main(String[] args) {
		String data=null;
		//NullPointerException, ArrayIndexOutOfBoundsException, 
		//ClassCastException => 모두 Exception의 서브 클래스
		
		Animal animal=new Dog();
		try {
			System.out.println(data.length()); 
			System.out.println(args[1]);
			Cat cat=(Cat)animal;
		
		}catch(NullPointerException |ArrayIndexOutOfBoundsException | ClassCastException e){  
			System.out.println("예외 발생!"); 
		}
		
	}
}