package ch08.ch03;

public class MethodOverridingEx {
	//�޼ҵ��� �Ű������� �پ��ϰ� ��ȭ��(������)
	static void paint(Shape p) {
		p.draw();   //p�� ����Ű�� ��ü ���� �������̵� �� draw() ȣ��. ���� ���ε�
	}

	public static void main(String[] args) {
		Shape s=new Shape();
		Line line=new Line();
		//paint �޼ҵ忡�� �Ű����� Ȯ���� �� shape���� �ٲ��� ����
		//������ �޼ҵ�� �θ�Ÿ������ ��ȯ�Ǵ��� �����ǵ� �������� ����
		s=line;
		paint(s);
		
		Rect r=new Rect();
		s=r;
		paint(s);
		
		s=new Circle();
		paint(s);  
		
		/*
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		*/
	}

}
