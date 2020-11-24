package ch07;

public class TwoDimensionArray3 {

	public static void main(String[] args) {
		//이차원 배열 선언: 타입[][] 변수명 = new 타입[행의 개수][열의 개수];
		int[][] arr= {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {//길이가 가변적인 다차원 배열도 순차탐색 가능 
				System.out.println("arr["+i+"]["+j+"] = "+ arr[i][j]);
			}
			System.out.println();
		}
	}
}
