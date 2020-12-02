package ch09;

public class SalaryMan extends Employee {
	private int annualSal;
	
	public SalaryMan(String name, int annualSal) {
		super(name);
		this.annualSal=annualSal;	
	}
	@Override
	public int computePay() {
		super.sal=annualSal/12;
		return super.sal;
	}

}
