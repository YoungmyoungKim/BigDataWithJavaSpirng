package ch02;

public class NullExam4 {

	public static void main(String[] args) {
		String data=null;
		//NullPointerException, ArrayIndexOutOfBoundsException, 
		//ClassCastException => 모두 Exception의 서브 클래스
		
		Animal animal=new Dog();
		try {
			System.out.println(data.length()); 
			System.out.println(args[1]);
			Cat cat=(Cat)animal;
		}catch(Exception e){  //최상위 예외 하나만 있어도 됨.  
			System.out.println("예외 발생!"); 
		}
		
	}
}