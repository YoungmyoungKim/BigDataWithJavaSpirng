package ch04;

public class CompareOperationExample2 {

	public static void main(String[] args) {
		int age = 25;
		boolean result1= age>=20 && age<30;
		System.out.println("결과: "+result1);
		
		int x=10, y=20;
		boolean result2= (x>=0 & y>=0) &(x<=50 & y<=50);
		System.out.println("결과: "+result2);
		
		char c='D';     //69
		boolean result3= c>='A' & c<='Z';     //68>=65 & 68<=90
		System.out.println("결과: "+result3);

	}

}
