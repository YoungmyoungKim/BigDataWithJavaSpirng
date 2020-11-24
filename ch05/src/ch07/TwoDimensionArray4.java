package ch07;

public class TwoDimensionArray4 {

	public static void main(String[] args) {
		int[][] scores= {{85, 90 , 55}, {90, 70, 88}, {87, 80, 66}};
		String[] names= {"홍길동", "일지매", "임꺽정"};
		
		int total=0;
		int count=0;
		for(int i=0; i<scores.length;i++) {
			int sum=0;
			for(int j=0;j<scores[i].length;j++) {//길이가 가변적인 다차원 배열도 순차탐색 가능 
				System.out.println("scores["+i+"]["+j+"] = "+ scores[i][j]);
				sum+=scores[i][j];
			}
			total+=sum;
			count+=scores[i].length;
			System.out.println(names[i]+"의 총점: "+ sum+ " 평균: "+(double)sum/scores[i].length);
			System.out.println();
		}
		System.out.println("Total 총점: "+ total+ " Total 평균: "+(double)total/count);
	}
}
