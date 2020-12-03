package ch01;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		if(y != 0) {
			result=x/y;
		}else {System.out.println("계산 불가");}
}

}
