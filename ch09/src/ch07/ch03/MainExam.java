package ch07.ch03;

public class MainExam {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
		
		//���ٽ�
		//�Ű������� ���� Ÿ���� ���� �� �̷� ���ٽ����� �ٲ� �� ����
		//�������̽��� �߻�޼ҵ尡 ���� �� ��
		//������ �� �޼ҵ��� ���� �ΰ� ��ɹ� �ϳ��� ��{} ���� ����
		button.setOnClickListener(()-> System.out.println("��ȭ�� �̴ϴ�."));
		button.touch();
		
		
		button.touch();
	}

}
