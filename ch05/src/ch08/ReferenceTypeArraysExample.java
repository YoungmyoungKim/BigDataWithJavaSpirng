package ch08;

public class ReferenceTypeArraysExample {

	public static void main(String[] args) {
		String[] arr=new String[3];
		
		arr[0]="Java";
		arr[1]="C++";
		arr[2]="C#";
		
		//참조형 변수의 주소값
		System.out.println("참조형 변수의 주소값");
		System.out.println("arr[0]의 주소: "+System.identityHashCode(arr[0]));
		System.out.println("arr[1]의 주소: "+System.identityHashCode(arr[1]));
		System.out.println("arr[2]의 주소: "+System.identityHashCode(arr[2]));
		System.out.println();
		//참조형 변수의 값
		System.out.println("참조형 변수의 값");
		System.out.println("arr[0]의 주소: "+arr[0]);
		System.out.println("arr[1]의 주소: "+arr[1]);
		System.out.println("arr[2]의 주소: "+arr[2]);
	}

}
