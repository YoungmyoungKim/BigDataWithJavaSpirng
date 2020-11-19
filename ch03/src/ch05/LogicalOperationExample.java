package ch05;

public class LogicalOperationExample {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		//왼쪽은 false, 오른쪽은 연산 중 10/0으로 오류 발생
		//& : 비트 연산자, 일일이 모든 비트의 값을 비교
		//&&: 왼쪽 값을 모두 계산 후 오른쪽 계산, 왼쪽이 false이기 때문에 오른쪽 계산 안하고 바로 false 반환
		if((i != 1) && ((--j)/10 != 1)) {
			System.out.println("true");
		}else
			System.out.println("false");
		
		//왼쪽은 true, 오른쪽은 연산 중 10/0으로 오류 발생
		if(i==1 || (10/(--j) != 1)) {
			System.out.println("여기");
		}else System.out.println("저기");
		
		System.out.println("----------------------");
		//왼쪽 항이 false라서 오른쪽 항 계산 안하고 if문 벗어남. --j연산 하지 않았기 때문에 그래도 값이 0
		if((i!=1)& --j==-1) {
			System.out.println(j);
		}
		System.out.println(j);
	}
}
