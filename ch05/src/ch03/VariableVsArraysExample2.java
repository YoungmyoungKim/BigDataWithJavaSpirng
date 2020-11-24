package ch03;

public class VariableVsArraysExample2 {

	public static void main(String[] args) {
		//동일 타임의 여라 값을 묶어서 사용
		//배열 선언 후 나중에 배열 객체를 생성해서 대입시는 new 타입[]{초기값}으로 생성
		int[] arr1;
		arr1=new int[]{10, 20, 30, 40, 50};    
		System.out.println(arr1[2]);
		
		arr1[2]=arr1[1]+arr1[3];   //arr1[1]=20 + arr1[3]=40  =>60
			
		System.out.println(arr1[2]);
		
		int i=0;
		System.out.println(++arr1[i]);  //배열의 값 증가
		System.out.println(arr1[++i]);	 //인덱스의 값 증가
	}
}
