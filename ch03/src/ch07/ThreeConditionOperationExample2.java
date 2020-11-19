package ch07;

public class ThreeConditionOperationExample2 {

	public static void main(String[] args) {
		int score=87;
		//조건? true:(조건? true: (조건? true: false)) : 중첩 가능 
		char grade= score>=90? 'A':(score>=80? 'B': (score>=70? 'C':'F'));
		
		System.out.println("점수: "+score+" 학점: "+grade);
	}

}
