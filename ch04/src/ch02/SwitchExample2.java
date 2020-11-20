package ch02;

public class SwitchExample2 {

	public static void main(String[] args) {
		//Math.random() 함수의 범위 0.0<= <1.0
		int time=(int)(Math.random()*4)+8;
		System.out.println("[현재시간: "+time+"시]");
		
		switch(time) {
		case 8: System.out.println("출근 합니다."); 
		case 9: System.out.println("회의를 합니다."); 
		case 10: System.out.println("업무를 합니다."); 
		case 11: System.out.println("외근을 나갑니다."); 
		}
	}

}
