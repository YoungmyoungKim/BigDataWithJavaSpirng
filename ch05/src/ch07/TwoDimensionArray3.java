package ch07;

public class TwoDimensionArray3 {

	public static void main(String[] args) {
		//������ �迭 ����: Ÿ��[][] ������ = new Ÿ��[���� ����][���� ����];
		int[][] arr= {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {//���̰� �������� ������ �迭�� ����Ž�� ���� 
				System.out.println("arr["+i+"]["+j+"] = "+ arr[i][j]);
			}
			System.out.println();
		}
	}
}
