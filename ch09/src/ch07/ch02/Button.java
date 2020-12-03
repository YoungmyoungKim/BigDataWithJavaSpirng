package ch07.ch02;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();  //���� ��ü�� onClick()�޼ҵ� ȣ��
	}
	
	interface OnClickListener{
		void onClick();
	}
}
