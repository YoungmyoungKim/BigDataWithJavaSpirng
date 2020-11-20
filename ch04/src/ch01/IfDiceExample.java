package ch01;

public class IfDiceExample {

	public static void main(String[] args) {
		//Math.random() 함수의 범위 0.0<= <1.0
		int num=(int)(Math.random()*6)+1;
		//System.out.println(num);
		if(num==1) System.out.println("숫자 1이 나왔습니다.");
		else if(num==2) System.out.println("숫자 2가 나왔습니다.");
		else if(num==3) System.out.println("숫자 3이 나왔습니다.");
		else if(num==4) System.out.println("숫자 4가 나왔습니다.");
		else if(num==5) System.out.println("숫자 5가 나왔습니다.");
		else System.out.println("숫자 6이 나왔습니다.");

	}

}
