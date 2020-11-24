package ch07;

public class TwoDimensionArrayLength {

	public static void main(String[] args) {
		//이차원 배열 선언: 타입[][] 변수명 = new 타입[행의 개수][열의 개수];
		int[][] arr=new int[2][3];
		
		System.out.println("arr.length = "+arr.length);
		
		System.out.println("arr[0].length = "+arr[0].length);
		
		System.out.println("arr[1].length = "+arr[1].length);		

	}

}
