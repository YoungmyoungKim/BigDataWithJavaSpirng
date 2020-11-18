package ch06;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		//byte + int -> int + int => int
		System.out.println(b+i);
		
		//int / int -> int
		System.out.println(10/4);
		
		//double/int -> double(10.0)/double(4.0) -> double(2.5)
		System.out.println(10.0/4);
		
		//int -> char -> 앞의 3byte는 사라짐, 마지막 2byte만 유효
		System.out.println((char)0x12340041);
		
		System.out.println((byte)(b+i));    //오버플로우 
		
		//2.9 -> int 2 + 1.8 -> 3.8 
		System.out.println((int)2.9 + 1.8);
		
		//double + double -> double -> int 로 형 변환 
		System.out.println((int)(2.9 + 1.8));
		
		//double 2.9 -> int 2, double 1.8 -> int 1, int + int -> int (1 + 2 = 3)
		System.out.println((int)2.9 + (int)1.8);
		
		//54 자루의 연필. 12명의 학생에게 몇자루씩 나누어주고, 남은 연필은 몇개?
		int res=(int)(54/12);   //몫
		int l=54-12*res;        //나머지 
		
		System.out.println("몫: "+res);
		System.out.println("나머지: "+l);
				
	}

}
