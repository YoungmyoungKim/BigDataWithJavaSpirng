package ch03;

public class ArrayDeclareInMethodExample {

	public static void main(String[] args) {
		//배열을 매개변수로 받는 메소드에 배열값 전달시에도 
		//new 타입[]{초기값} 형태로 전달 
		int sum2=add(new int[] {10, 20, 30});   //메소드로 전달시 초기값으로 배열 객체 생성하여 전달 
		
		int[] arr= {10, 20, 30, 40};    //이미 선언 된 배열을 메소드로 전달시 변수명만 전달. 
		int sum3=add(arr);
		
  		
		System.out.println("결과 : "+sum2);
		System.out.println("결과 : "+sum3);


	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		return sum;
	}
}
