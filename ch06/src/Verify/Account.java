package Verify;

public class Account {
	private int balance;
    private static final int MIN_BALANCE=0; 
	private static final int MAX_BALANCE=1000000;
    
	public int getBalance() {
		return this.balance;
	}
	private void setBalance(int balance) {
        if(balance>=MIN_BALANCE && balance<=MAX_BALANCE){
            this.balance = balance;
        }
	}
}
