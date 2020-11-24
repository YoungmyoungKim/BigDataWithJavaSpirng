package ch06;

public class StringArgsExample {

	public static void main(String[] args) {
		String[] args1= {"hello", "hi", "goodbye"};
		System.out.println(args1.length);
		
		for(int i=0; i<args1.length; i++) {
			System.out.println(args1[i]);    //인덱스 번호로 접근
			
		}

	}

}
