package ch04;

//기본 타입(byte, short, char, int, long, float, double, boolean)의
//비교연산 ==, !=, <, >, <=, >=
public class CompareOperationExample1 {

	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1 == num2);    //10 == 10 -> true
		boolean result2=(num1 != num2);    //10 != 10 -> false
		boolean result3=(num1 <= num2);    //10 <= 10 -> true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1='A';
		char char2='B';
		boolean result4=char1 < char2;     //66 < 67 -> true
		System.out.println(result4);
		
	}

}
