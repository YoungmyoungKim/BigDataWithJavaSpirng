package ch04;
//변수는 선언 된 블록 내에서만 사용 가능 
public class VariableScopeExample {

	public static void main(String[] args) {
		int var1=0;
		
		if(true) {
			int var2=0;
			
			System.out.println(var1);
			System.out.println(var2);
		}
		System.out.println(var1);
		
		/* 볌위를 벗어나 에러남
		System.out.println(var2);		
		 */
		for(int i=0; i<5; i++) {
			int var3=0;
			System.out.println(var1);   //상위 레벨의 var1은 사용가능 
			System.out.println(var3);
			/* 범위를 벗어나 에러남 
			System.out.println(var2);
			*/
		
		System.out.println(var1);   
		
		/* 하위 레벨에서 선언한 var3는 사용 불가 
		System.out.println(var3);
		*/
		}
		
	}

}
