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
		
		System.out.println("점수는 "+score+" 입니다.");
		System.out.println("학점은 "+grade+" 입니다.");
		
	}

}
