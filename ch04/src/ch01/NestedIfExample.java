package ch01;

public class NestedIfExample {

	public static void main(String[] args) {
		int score=(int)(Math.random()*20)+81;     //0~19+81 => 81~100
		
		String grade;
		
		if(score>=90) {
			if(score>=95) grade="A+";
			else grade="A";
			
		}
		else {
			if(score>=85) grade="B+";
			else grade="B";
		}
		
		System.out.println("������ "+score+" �Դϴ�.");
		System.out.println("������ "+grade+" �Դϴ�.");

	}

}
