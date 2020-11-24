package ch07;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//이차원 배열 선언: 타입[][] 변수명 = new 타입[행의 개수][열의 개수];
		int[][] mathScores= new int[2][3];
		
		for(int i=0; i<mathScores.length;i++) {
			for(int j=0;j<mathScores[i].length;j++) {//길이가 가변적인 다차원 배열도 순차탐색 가능 
				System.out.println("mathScores["+i+"]["+j+"] = "+ mathScores[i][j]);
			}
			System.out.println();
		}
	}
}
