package ch03;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		try {
			System.out.println("예외 발생 안함");
		}catch(Exception e){
			System.out.println("예외 발생");
		}finally{
			System.out.println("종료 전 반드시 실행 ");
		}
		

	}

}
