package ch06;

public class BitOperationExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = "+(45 & 25));
		System.out.println("45 | 25 = "+(45 | 25));
		System.out.println("45 ^ 25 = "+(45 ^ 25));
		System.out.println("~45 = "+(~45));
		
		System.out.println(toBinaryString(45)+" => 45");
		System.out.println(toBinaryString(25)+" => 25");
		System.out.println(toBinaryString((45 & 25))+" => 45 & 25 = "+(45 & 25));
		System.out.println(toBinaryString((45 | 25))+" => 45 | 25 = "+(45 | 25));
		System.out.println(toBinaryString((45 ^ 25))+" => 45 ^ 25 = "+(45 ^ 25));
		System.out.println(toBinaryString(~45)+" => ~45 = "+(~45));
	}
	
	static String toBinaryString(int value) {
		String v=Integer.toBinaryString(value);
		while(v.length()<32) {
			v="0"+v;
		}
		return v;
	}
}
