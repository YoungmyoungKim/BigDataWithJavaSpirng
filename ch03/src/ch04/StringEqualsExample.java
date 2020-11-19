package ch04;

public class StringEqualsExample {

	public static void main(String[] args) {
		//�⺻ Ÿ������ ������ str1, str2�� �ּҰ��� ����. -> ��ü����
		String str1="ȫ�浿";
		String str2="ȫ�浿";
		//�����ڸ� �̿��Ͽ� ��ü�� ���� �����߱� ������ str1, str2�ʹ� �ּ� �ٸ�.  
		String str3=new String("ȫ�浿");
		
		//���� Ÿ�Կ��� == �����ڸ� ����ϸ� ���������� ������ ���θ� ����� �� 
		System.out.println("str1�� str2�� ����Ű�� ����Ұ� ������? "+(str1==str2));
		System.out.println("str1�� str3�� ����Ű�� ����Ұ� ������? "+(str1==str3));
		
		//str1, str2, str3�� �����ּ� ���
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//��ü ������ ������ hashcode ���� ����
		//����Ÿ���� �� �޼ҵ��� equals()�� hasycode()������ ������ �ٸ��� ���� 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println();
		
		//���� Ÿ�Կ��� �� �񱳴� equals() �޼ҵ�� ���ؾ� ��. 
		System.out.println("str1�� str2�� ������ ������? "+(str1.equals(str2)));
		System.out.println("str1�� str3�� ������ ������? "+(str1.equals(str3)));
		

	}

}
