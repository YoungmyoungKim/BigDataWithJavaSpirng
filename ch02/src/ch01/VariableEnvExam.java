package ch01;

public class VariableEnvExam {
	public static void main(String[] args) {
		int price=1000;
		int $price=200;  //Ư������ �� $ ��밡��(�ʼ�)
		String _companyName="����it";   //Ư������_��밡��(�ʼ�)
		
		//�ĺ��ڴ� ��ҹ��ڸ� ������(�ʼ�)
		String firstname="������";
		String firstName="�Ӳ���";
		
		//�ĺ��� ��� ��Ģ(����) - ī�� ǥ���(�ռ����� �ι�° �ܾ���ʹ� ù���ڸ� �빮�ڷ� ǥ�� )
		int maxSpeed=210;  //max+speed => maxSpeed
		String carBodyColor="Red";   //car+body+color => carBodyColor
		
		/* �ڹ� �����, ���ͷ� ���� �ĺ��ڷ� ���Ұ�(�ʼ�)
		int class=20;
		int if=50;
		int true=10;
		int null=100;
		*/
		System.out.println("firstname: "+firstname +" / "+"firstName: "+firstName);
		System.out.println("maxSpeed: "+maxSpeed + " / " +"carBodyColor: "+carBodyColor);
	}
}
