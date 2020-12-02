package Verify;

public class BankAccount {
	private static int seq=0;
	private String owner;
	private int balance;
	String ano;
	
	public BankAccount(String owner, int balance) {
		//String.format("format", value);
		//-"%03d" <- d: digit(십진수), 0:빈 공간을 0으로 채움, 3: 전체 자릿수 3 
		this.ano = "100-"+ String.format("%04d",seq++);
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) {this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) {this.balance = balance; }

	
}
