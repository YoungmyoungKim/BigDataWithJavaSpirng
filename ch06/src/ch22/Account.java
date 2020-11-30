package ch22;

public class Account {
	static int seq=0;

	private String accountNo;
	private String owner;
	private int balance;
	
	public Account(String owner, int balance) {
		this.accountNo="001-200"+ seq++;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdrawn(int value) {
		if(balance>=value) {
			balance-=value;
		}
	}
	public void deposit(int value) {
		balance+=value;
	}
}
