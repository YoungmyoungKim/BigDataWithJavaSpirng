package ch02;   //class가 저장 될 패키지 선언: (명령문 = 세미콜론으로 끝나는 것)

//클래스명 : 대문자로 시작하고 카멜방식
public class AutoVendingMachine {
	//변수명은 소문자로 시작하고 카멜방식
	int myAge;   //my+age => myAge
	boolean isSingle;    //is+single => isSingle
	
	//상수는 대문자로 표기
	final static double PI=3.141592;
	
	//메소드명은 소문자로 시작하고 카멜방식 
	public int getAge() {return myAge;}   //get+age => getAge
}
