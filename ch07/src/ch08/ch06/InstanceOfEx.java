package ch08.ch06;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person) {
			System.out.println("Person");
		}
		if(p instanceof Student) {
			System.out.println("Student");
		}
		if(p instanceof Researcher) {
			System.out.println("Researcher");
		}
		if(p instanceof Professor) {
			System.out.println("Professor");
		}	
	}

	public static void main(String[] args) {
		System.out.print("new Student()->\t"); print(new Student());
		System.out.print("new Researcher()->\t"); print(new Researcher());
		
		//Professor ��ü�� Person Ÿ�� �̱⵵ �ϰ� Researcher, Professor Ÿ�� �̱⵵ ��.  
		System.out.print("new Professor()->\t"); print(new Professor());

	}

}
