package ch07;

public class ThreeConditionOperationExample2 {

	public static void main(String[] args) {
		int score=87;
		//����? true:(����? true: (����? true: false)) : ��ø ���� 
		char grade= score>=90? 'A':(score>=80? 'B': (score>=70? 'C':'F'));
		
		System.out.println("����: "+score+" ����: "+grade);
	}

}
