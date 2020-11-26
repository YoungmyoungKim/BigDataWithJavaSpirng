package ch14;

public class Fruit {
	static int amount=10;
	
	Fruit(){
		--amount;
	}
	
	static void Rest() {
		System.out.println(amount);
	}

}
