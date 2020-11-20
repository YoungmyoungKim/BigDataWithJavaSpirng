package ch04;

public class DoWhileExample1 {

	public static void main(String[] args) {
		char c='a';
		
		do {
			System.out.println(c);
			c=(char)(c+1);    //연산할 때 int가 되기 때문에 다시 문자로 형 변환
			
		}while(c<='z');

	}

}
