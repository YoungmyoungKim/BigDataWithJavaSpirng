package ch07;

public class TwoDimensionArray4 {

	public static void main(String[] args) {
		int[][] scores= {{85, 90 , 55}, {90, 70, 88}, {87, 80, 66}};
		String[] names= {"ȫ�浿", "������", "�Ӳ���"};
		
		int total=0;
		int count=0;
		for(int i=0; i<scores.length;i++) {
			int sum=0;
			for(int j=0;j<scores[i].length;j++) {//���̰� �������� ������ �迭�� ����Ž�� ���� 
				System.out.println("scores["+i+"]["+j+"] = "+ scores[i][j]);
				sum+=scores[i][j];
			}
			total+=sum;
			count+=scores[i].length;
			System.out.println(names[i]+"�� ����: "+ sum+ " ���: "+(double)sum/scores[i].length);
			System.out.println();
		}
		System.out.println("Total ����: "+ total+ " Total ���: "+(double)total/count);
	}
}
