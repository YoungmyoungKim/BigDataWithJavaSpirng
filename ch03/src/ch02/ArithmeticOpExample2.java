package ch02;

public class ArithmeticOpExample2 {
	public static void main(String[] args) {
		//자연수의 값 짝, 홀 여부 확인
		for(int i=0; i<=100; i++) {
			if(i%2==0) System.out.println(i+"짝수");
			else System.out.println(i+"홀수");
		}
		//10의 자리수 짝, 홀 여부 확인
		for(int i=10; i<=100; i++) {
			if(i/10%2==0) System.out.println(i+"의 십자리는 짝수");
			else System.out.println(i+"의 십자리는 홀수");
			
			if((i%10)%2==0)System.out.println(i+"의 일의 자리 수는 짝수");
		}
		
		
		for(int i=1; i<100; i++) {
			String str="";
			if((i%10)%3==0 && (i%10)!=0) str+="짝";
			if(i/10%3==0 & i>10) str+="짝";
			System.out.println(i+":"+str);
		}
		
		
	}

}
