package ch01;

public class IncreaseOpExample3 {

	public static void main(String[] args) {
		int x=0;
		int y=10;
		int z;
		
		System.out.println("----------------------");
		x++;
		++x;
		System.out.println("x= "+x);
		
		System.out.println("----------------------");
		y++;
		++y;
		System.out.println("y= "+y);
		
		System.out.println("----------------------");
		z=x++;    //���� ���� �Ŀ� ���������� �ϱ� ������ z�� 1�����ϱ� ���� 2���ǰ� �� �Ŀ� x�� 3�� ��.
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		
		System.out.println("----------------------");
		//x�� 1 �����ϰ� z�� ������, y�� z�� ������ �� 1 ����
		z=++x + y++;
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		int family= 150;
		System.out.println("ȫ�浿�� ������ ��� "+ ++family+"���̴�.");
		System.out.println("family= "+family);
		System.out.println("ȫ�浿�� ������ ��� "+ family++ +"���̴�.");
		System.out.println("family= "+family);
	}

}
