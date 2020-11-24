package ch10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores= {95, 71, 84, 93, 87};
		
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("ÃÑÁ¡: "+sum+ " Æò±Õ: "+(double)sum/scores.length);
		
		//Çâ»óµÈ for¹®
		int sum2=0;
		for(int score: scores) {
			sum2+=score;
		}
		System.out.println("ÃÑÁ¡: "+sum2+ " Æò±Õ: "+(double)sum2/scores.length);
	}
}
