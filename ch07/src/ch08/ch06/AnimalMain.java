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
		greet(new Dog());    //실행 과정에서 Dog -> Animal -> Dog 으로 타입 변환 함. 
		greet(new Cat());   //타입 변환 오류남. cat -> Animal (Ok) -> dog (impossible) 
	}

}
