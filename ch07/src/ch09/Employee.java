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
		System.out.println("�̸�: "+name);
		System.out.println("�޿�: "+sal);
		System.out.println("���ʽ�: "+computeIncentive());	
	}
}
