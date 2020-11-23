package ch05;

public class BreakForExample {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==10) break;
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
