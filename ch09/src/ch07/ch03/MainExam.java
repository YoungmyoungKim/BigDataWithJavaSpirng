package ch07.ch03;

public class MainExam {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
		
		//람다식
		//매개변수와 리턴 타입이 없을 때 이런 람다식으로 바꿀 수 있음
		//인터페이스의 추상메소드가 오직 한 개
		//재정의 된 메소드의 실행 부가 명령문 하나면 블럭{} 생략 가능
		button.setOnClickListener(()-> System.out.println("전화를 겁니다."));
		button.touch();
		
		
		button.touch();
	}

}
