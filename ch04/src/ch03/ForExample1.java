package ch03;

public class ForExample1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~100까지의 합: "+sum);
		
		for(int i=1, sum2=0; i<=100; i++) {
			sum2+=i;
			System.out.println("1~"+i+"까지의 합: "+sum2);
		}
		
		int j=1;
		int sum3=0;
		for(;j<=100;j++) {
			sum3+=j;
		}
		System.out.println("1~100까지의 합: "+sum3);
		
		
	}

}
