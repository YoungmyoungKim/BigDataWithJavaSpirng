package ch07.ch03;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();  //구현 객체의 onClick()메소드 호출
	}
	//내부인터페이스 선언
	@FunctionalInterface
	interface OnClickListener{
		void onClick();
	}
}
