package ch01;

public class GradeExample2 {

	public static void main(String[] args) {
		char grade;
		
		int score=(int)(Math.random()*100);
		
		if(score>=90) grade='A';
		else if(score>=80) grade='B';
		else if(score>=70) grade='C';
		else if(score>=60) grade='D';
		else grade='F';
		
		System.out.println("������ "+score+" �Դϴ�.");
		System.out.println("������ "+grade+" �Դϴ�.");
		
	}

}
