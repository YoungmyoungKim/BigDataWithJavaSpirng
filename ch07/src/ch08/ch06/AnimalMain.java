package ch08.ch06;

public class AnimalMain {
	static void greet(Animal animal) {
		if(animal instanceof Dog)
		{
			Dog dog=(Dog)animal;
			dog.say();
		}
		else if(animal instanceof Cat) {
			((Cat)animal).say();
		}
		
	}
	public static void main(String[] args) {
		greet(new Dog());    //���� �������� Dog -> Animal -> Dog ���� Ÿ�� ��ȯ ��. 
		greet(new Cat());   //Ÿ�� ��ȯ ������. cat -> Animal (Ok) -> dog (impossible) 
	}

}
