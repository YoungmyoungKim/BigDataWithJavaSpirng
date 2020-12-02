package ch09;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee[] emp=new Employee[6];
		emp[0]=new SalaryMan("HGD", 5000000);
		emp[1]=new SalaryMan("DJR", 200000);
		emp[2]=new SalaryMan("SEC", 8000000);
		emp[3]=new HourMan("SGE", 15, 9000);
		emp[4]=new HourMan("SFE", 20, 9000);
		emp[5]=new 
				HourMan("SRU", 20, 9500);
		
		for(int i=0; i<emp.length; i++) {
			emp[i].computePay();
			emp[i].computeIncentive();
			emp[i].print();
		}
		
	}

}
