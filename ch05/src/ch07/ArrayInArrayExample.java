package ch07;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//������ �迭 ����: Ÿ��[][] ������ = new Ÿ��[���� ����][���� ����];
		int[][] mathScores= new int[2][3];
		
		for(int i=0; i<mathScores.length;i++) {
			for(int j=0;j<mathScores[i].length;j++) {//���̰� �������� ������ �迭�� ����Ž�� ���� 
				System.out.println("mathScores["+i+"]["+j+"] = "+ mathScores[i][j]);
			}
			System.out.println();
		}
	}
}
