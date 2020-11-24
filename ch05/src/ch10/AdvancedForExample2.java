package ch10;

public class AdvancedForExample2 {

	public static void main(String[] args) {
		int[][] numbers= {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		
		//Çâ»óµÈ for¹®
		int sum=0;
		int count=0;
		for(int[] n: numbers) {
			for(int j: n) {
				sum+=j;
			}
			count+=n.length;
		}
		System.out.println("ÃÑÁ¡: "+sum+ " Æò±Õ: "+(double)sum/count);
	}
}
