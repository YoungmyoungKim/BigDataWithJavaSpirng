package ch03;

//문자 리터럴
//문자 한 개의 값
public class LiteralExample3 {

	public static void main(String[] args) {
		//문자 타입 (char) 변수에 문자 타입 리터럴 저장 
		char a='A';
		char b='글';
		
		//특수 문자 \다음으로 오는 코드는 기능성 문자이다.  
		//유니 코드에 해당하는 값으로 바껴서 들어감
		char c='\u0041';   //unicode 0041 에 해당하는 값 'A' 저장
		char d='\uae00';   //unicode ae00 에 해당하는 값 '글' 저장
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char fName='\uae40';
		char midName='\uc601';
		char lName='\uba85';
		
		System.out.println("성: "+fName);
		System.out.println("중간: "+midName);
		System.out.println("끝: "+lName);
		
		//문자 리터럴로 생성한 문자 배열을 arr 변수에 저장
		char[] arr= {'\uae40', '\uc601', '\uba85'};  //글자로 변환 되어서 저장. 
		
		//문자 배열을 이용하여 문자열 객체를 생성
		String myName=new String(arr);   //생성자 
		System.out.println(myName);
		
	}

}
