package ch13_01;

public class B {

	public static void main(String[] args) {
		int[] array= {1, 2, 3, 4, 5};
		increase(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//¾èÀº º¹»ç
	static void increase(int[] arr) {
		arr[0]=99;
	}
}
