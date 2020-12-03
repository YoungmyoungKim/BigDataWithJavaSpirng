package ch05.ch02;

public class ExceptionMain {

	public static void main(String[] args) {
		Account acc= new Account();
		
		acc.setBalance(10000);
		acc.deposit(1000);
		
		System.out.println(acc.getBalance());
		
		try {
			//withdraw 함수에서 예외 떠넘기기 처리 해야 됨
			acc.withdraw(50000);  
		}catch(BalanceException e) {
			e.printStackTrace();
		}
		
	}

}
