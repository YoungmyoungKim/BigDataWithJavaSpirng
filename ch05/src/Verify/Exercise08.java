package Verify;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] arr= {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		int sum=0;
		double avg=0.0;
		int count=0;
		for(int[] numbers: arr) {
			for(int num: numbers) {
				sum+=num;
			}
			count+=numbers.length;
		}
		avg=sum/count;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
