package ch02;

import java.util.Date;

public class ArithmeticOpExample3 {

	public static void main(String[] args) {
		int time=5000;
		
		int second=time%60; 
		int minute=(time/60)%60;
		int hour= (time/60)/60;
		
		System.out.println(time+"초는 ");
		System.out.println(hour+"시간 ");
		System.out.println(minute+"분 ");
		System.out.println(second+"초 입니다. ");
		
		//날짜 정보 api를 이용하여 날짜 출력
		Date now=new Date();
		System.out.println(now);
		System.out.println(now.getTime()); //1970, 1, 1, 0시 이후의 밀리세컨드 값 
	}

}
