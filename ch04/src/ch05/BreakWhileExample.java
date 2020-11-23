package ch05;

public class BreakWhileExample {

	public static void main(String[] args) {
		int i=1, j=1;
		
		b: while(i<10) {
			while(j<=10) {
				if(j==10) break b;
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}

	}

}
