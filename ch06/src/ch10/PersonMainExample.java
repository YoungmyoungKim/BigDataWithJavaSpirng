package ch10;

public class PersonMainExample {

	public static void main(String[] args) {
		Person person = new Person();   
		person.age=20;  //������ �ʱ�ȭ�� �� �� ���¿��� �������� ��. 
		
		person.car.company="�����ڵ���";   
		person.car.engineStart=true;
		
		System.out.println(person.car.engineStart);
		System.out.println(person.car.company);
	}
}
