package ch03;

public class TryCatchFinallyExam2 {

	public static void main(String[] args) {
		try {
			System.out.println("예외 발생 안함");
			throw new Exception("강제 발생");
		}catch(Exception e){
			System.out.println("예외 발생");
		}finally{
			System.out.println("종료 전 반드시 실행 ");
		}
		

	}

}
