package ch05;

public class PrimitiveTypeScopeExample {

	public static void main(String[] args) {	
	//int -> Integer, byte -> Byte, char -> Character, short -> Short, long -> Long
		
		System.out.println(Integer.MIN_VALUE+"<= int 범위<= "+Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"<= Byte 범위<= "+Byte.MAX_VALUE);
		
		//숫자가 아니라서 "(0)<= <=?" 이렇게 나옴           
		System.out.println(Character.MIN_VALUE+"<= Char 범위<= "+Character.MAX_VALUE);
		
		//float -> Float, double -> Double
		//데이터 타입의 최소, 최대 값을 알고 싶을 때 내포 클래스를 이용하여 알아 볼 수 있음 
		System.out.println(Short.MIN_VALUE+"<= Short 범위<= "+ Short.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"<= Long 범위<= "+ Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"<= Float 범위<= "+ Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"<= Double 범위<= "+ Double.MAX_VALUE);

		byte n1=127;
		//byte j=i+1;    //byte 값의 범위를 넘어가서 저장 불가 (-128~127)
		
		System.out.println(n1);
		System.out.println(n1+1);   //byte 타입의 값 + 정수 리터럴 => 정수 타입 
		
		byte var1=125;
		int var2=2147483645;
		short var3=32765;
		
		for(int i=0; i<10; i++ ) {
			var1++;
			var2++;
			var3++;
			//var1 음수 값으로 돌아감 -> 오버플로우 
			System.out.println("var1: "+var1+" var2: "+var2+" var3: "+var3);	
		}	
	}
}
