package ch08;
//자바는 정수 연산일 경우 int 타입으로 변환 후 연산 함. 피연산자를 4byte 단위로 저장하기 때문. 
//(byte, short, char, int) -> int 
public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3= byteValue1+byteValue2;   //int + int -> int     
		
		int intValue1=byteValue1+byteValue2;    //int + int -> int 
		System.out.println(intValue1);
		
		char charValue1='A';
		char charValue2=1;
		
		//int + int -> int 
		//char charValue3=charValue1+charValue2;    //int 타입의 결과를 char에 저장 X 	
		int intValue2=charValue1+charValue2;
		
		//출력시 char 타입으로 강제 변환 후 출력 가능 
		System.out.println("유니코드 = "+intValue2);   //int로 66, 0x41
		System.out.println("출력문자 = "+(char)intValue2);   //문자로 'B'
		
		int intValue3=10;
		int intValue4=intValue3/4;
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0;    // int / double -> double
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
