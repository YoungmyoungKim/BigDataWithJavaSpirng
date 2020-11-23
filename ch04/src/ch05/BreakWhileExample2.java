package ch05;

public class BreakWhileExample2 {

	public static void main(String[] args) {
		int i=1, j=1;
		
		while(i<10) {
			while(j<=10) {
				if(j==10) break;
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}

	}

}
