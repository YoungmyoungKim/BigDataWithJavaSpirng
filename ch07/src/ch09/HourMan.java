package ch09;

public class HourMan extends Employee{
	int workHour, moneyPerHour;
	
	public HourMan(String name, int workHour, int moneyHour) {
		super(name);
		this.workHour=workHour;
		this.moneyPerHour=moneyHour;
	}
	@Override
	public int computePay() {
		super.sal=workHour*moneyPerHour*30;
		return super.sal;
	}
}
