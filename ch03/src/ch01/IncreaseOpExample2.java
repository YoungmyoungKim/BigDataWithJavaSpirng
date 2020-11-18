package ch01;

public class IncreaseOpExample2 {

	public static void main(String[] args) {
		//증감연산이 단독으로 사용되면 ++i와 i++이 동일한 결과값을 가짐. 
		int i=10;
		i++;    //11
		System.out.println(i);

		i++;    //12
		System.out.println(i);
		
		i--;    //11
		System.out.println(i);
		
		--i;     //10
		System.out.println(i);

	}

}
