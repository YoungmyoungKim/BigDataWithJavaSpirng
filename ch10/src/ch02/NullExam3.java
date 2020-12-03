package ch02;

public class NullExam3 {

	public static void main(String[] args) {
		String data=null;
		
		Animal animal=new Dog();
		try {
			System.out.println(data.length()); 
			System.out.println(args[1]);
			Cat cat=(Cat)animal;
		
		//다증 catch절 : 낮은 레벨 -> 높은 레벨순으로 기입 
		}catch(NullPointerException e1){
			System.out.println("예외 발생!"); 
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("예외 발생!"); 
		}catch(ClassCastException e3){
			System.out.println("예외 발생!"); 
		//상위 예외일수록 아래로, 하위 예외 객체일수록 위로 배치	
		}catch(Exception e4){  //생략 가능
			System.out.println("예외 발생!"); 
		}
		
	}
}