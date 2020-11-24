package ch03;

public class VariableVsArraysExample3 {

	public static void main(String[] args) {
		//동일 타임의 여라 값을 묶어서 사용
		//배열 선언 후 나중에 배열 객체를 생성해서 대입시는 new 타입[]{초기값}으로 생성
		//int[] arr1;
		//arr1=new int[]{10, 20, 30, 40, 50};   => 가능 
		
		int[] arr1= {10, 20, 30, 40, 50};
		//배열의 길이는 선언시 고정됨- 생셩 된 배열의 길이값은 length라는 필드가 가지고 있음. 읽기전용 수정불가.
		System.out.println(arr1.length);
		
		
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			sum+=arr1[i]; 
		}
		
		System.out.println(sum);
		System.out.println((double)sum/arr1.length);
	}

}
