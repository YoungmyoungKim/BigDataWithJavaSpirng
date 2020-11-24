package ch08;

public class ReferenceTypeArraysExample2 {

	public static void main(String[] args) {
		String[] arr=new String[4];
		
		//참조 타입의 배열인 경우 배열의 각 요소가 하나의 객체를 참조할 수 있음. 
		arr[0]="Java";
		arr[1]="Java"; 
		arr[2]="Java";//먼저 생성 된 객체 "Java"를 arr[0]와 arr[1], arr[2]이 같이 가리킴 
		arr[3]=new String("Java");    //별도의 객체 생성
		
		//참조형 변수의 주소값
		System.out.println("참조형 변수의 주소값");
		System.out.println("arr[0]의 주소: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]의 주소: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]의 주소: "+System.identityHashCode(arr[2]));
		System.out.println("arr[3]의 주소: "+System.identityHashCode(arr[3]));
		System.out.println();
		
		//참조형 변수의 값
		System.out.println("참조형 변수의 값");
		System.out.println("arr[0]의  값: "+arr[0]);
		System.out.println("arr[1]의  값: "+arr[1]);
		System.out.println("arr[2]의  값: "+arr[2]);
		System.out.println("arr[3]의  값: "+arr[3]);
		
		arr[2]="C++";
		System.out.println();
		System.out.println("arr[2]의 값 변경");
		System.out.println();
		//참조형 변수의 주소값
		System.out.println("참조형 변수의 주소값");
		System.out.println("arr[0]의 주소: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]의 주소: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]의 주소: "+System.identityHashCode(arr[2]));
		System.out.println("arr[3]의 주소: "+System.identityHashCode(arr[3]));
		System.out.println();
		
		//참조형 변수의 값
		System.out.println("참조형 변수의 값");
		System.out.println("arr[0]의  값: "+arr[0]);
		System.out.println("arr[1]의  값: "+arr[1]);
		System.out.println("arr[2]의  값: "+arr[2]);
		System.out.println("arr[3]의  값: "+arr[3]);
	}

}
