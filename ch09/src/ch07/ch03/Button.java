package ch07.ch03;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();  //���� ��ü�� onClick()�޼ҵ� ȣ��
	}
	//�����������̽� ����
	@FunctionalInterface
	interface OnClickListener{
		void onClick();
	}
}
