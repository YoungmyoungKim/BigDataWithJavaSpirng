package Verify;

public class sample {

	public static void main(String[] args) {
		int[] scores= {80, 85, 70, 75, 90};
		
		for(int i=0; i<scores.length-1; i++) {
			for(int j=i+1; j<scores.length; j++) {
				if(scores[i]>scores[j]) {
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		
		for(int score: scores) {
			System.out.println(score);
		}

	}

}
