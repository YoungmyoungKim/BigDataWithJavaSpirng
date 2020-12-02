package ch09;

public abstract class Employee {
	private String name;
	int sal;
	private static final float INCENTIVE_RATE=0.1f;
	public Employee(String name) {
		this.name=name;
	}
	
	abstract int computePay();
	
	final int computeIncentive() {
		int pay=computePay();
		int bonus=0;
		if(pay>1000)
			bonus=(int)(pay*INCENTIVE_RATE);
		return bonus;
	}
	
	void print() {
		System.out.println("=======================");
		System.out.println("이름: "+name);
		System.out.println("급여: "+sal);
		System.out.println("보너스: "+computeIncentive());	
	}
}
