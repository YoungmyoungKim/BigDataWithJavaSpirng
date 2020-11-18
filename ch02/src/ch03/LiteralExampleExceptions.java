package ch03;
//jdk7 이후 숫자에 '_' 허용
public class LiteralExampleExceptions {

	public static void main(String[] args) {
		int price=20_100;
		long cardNumber=1234_5678_1357_9998L;
		long controlBits=0b10110100_01011011_1011001_111110000;
		long maxLong=0x7fff_ffff_ffff_ffffL;
		int age=2____5;
		
		/* 불가능한 경우 
		int x=15_;
		double pi=3_.14;
		long idNum=981231_1234567_L;
		int y = 0_x15;
		 */
		
		System.out.println(price);
		System.out.println(cardNumber);
		System.out.println(controlBits);
		System.out.println(maxLong);
		System.out.println(age);
	}

}
