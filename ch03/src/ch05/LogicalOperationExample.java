package ch05;

public class LogicalOperationExample {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		//������ false, �������� ���� �� 10/0���� ���� �߻�
		//& : ��Ʈ ������, ������ ��� ��Ʈ�� ���� ��
		//&&: ���� ���� ��� ��� �� ������ ���, ������ false�̱� ������ ������ ��� ���ϰ� �ٷ� false ��ȯ
		if((i != 1) && ((--j)/10 != 1)) {
			System.out.println("true");
		}else
			System.out.println("false");
		
		//������ true, �������� ���� �� 10/0���� ���� �߻�
		if(i==1 || (10/(--j) != 1)) {
			System.out.println("����");
		}else System.out.println("����");
		
		System.out.println("----------------------");
		//���� ���� false�� ������ �� ��� ���ϰ� if�� ���. --j���� ���� �ʾұ� ������ �׷��� ���� 0
		if((i!=1)& --j==-1) {
			System.out.println(j);
		}
		System.out.println(j);
	}
}
