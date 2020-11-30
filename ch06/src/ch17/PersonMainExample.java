package ch17;

public class PersonMainExample {

	public static void main(String[] args) {
		Person p1=new Person("20010101-11000123", "HGD");
		Person p2=new Person("20010101-11000124", "YGS");
		
		System.out.println(p1.nation+", "+p1.ssn+", "+p1.name);
		System.out.println(p2.nation+", "+p2.ssn+", "+p2.name);

	}

}
