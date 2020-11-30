package ch22;

public class AccountMainExample {

	public static void main(String[] args) {
		Account account1=new Account("HGD", 1000);
		System.out.println(account1.getOwner()+", "+account1.getAccountNo()+", "+account1.getBalance());
		
		account1.deposit(5000);
		System.out.println(account1.getOwner()+", "+account1.getAccountNo()+", "+account1.getBalance());
		
		account1.withdrawn(3000);
		System.out.println(account1.getOwner()+", "+account1.getAccountNo()+", "+account1.getBalance());
		
	}

}
