package ch10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores= {95, 71, 84, 93, 87};
		
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("����: "+sum+ " ���: "+(double)sum/scores.length);
		
		//���� for��
		int sum2=0;
		for(int score: scores) {
			sum2+=score;
		}
		System.out.println("����: "+sum2+ " ���: "+(double)sum2/scores.length);
	}
}
