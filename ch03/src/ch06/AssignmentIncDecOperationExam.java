package ch06;

public class AssignmentIncDecOperationExam {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		//대입연산자
		a+=3;
		b*=3;
		c%=2;
		
		System.out.println("a= "+a+" b= "+b+" c= "+c);
		
		int d=3;
		a=d++;
		System.out.println("a= "+a+" d= "+d);
		a=++d;
		System.out.println("a= "+a+" d= "+d);
		
		a=d--;
		System.out.println("a= "+a+" d= "+d);
			
		a=--d;
		System.out.println("a= "+a+" d= "+d);
		
		for(int i=0; i<10;) {
			System.out.println(i);
			i+=2;
		}
	}

}
