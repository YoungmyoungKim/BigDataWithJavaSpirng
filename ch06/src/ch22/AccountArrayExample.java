package ch22;

public class AccountArrayExample {

	public static void main(String[] args) {
		int i=0;
		Account[] accountArray=new Account[10];
		accountArray[i++]=new Account("HGD", 1000);
		accountArray[i++]=new Account("GRS", 5000);
		accountArray[i++]=new Account("ESD", 6000);
		accountArray[i++]=new Account("SRE", 1000);
		accountArray[i++]=new Account("DHT", 9000);
		
		//전체 내역 출력
		for(int j=0; j<accountArray.length;j++) {
			if(accountArray[j] != null) {
				System.out.println(accountArray[j].getAccountNo()+", "
						+accountArray[j].getOwner()+", "+accountArray[j].getBalance());
				}
			}
		//HGD 내역 출력 
		for(int j=0; j<accountArray.length;j++) {
			if(accountArray[j] != null && accountArray[j].getOwner().equals("HGD")) {
				System.out.println(accountArray[j].getAccountNo()+", "
						+accountArray[j].getOwner()+", "+accountArray[j].getBalance());
				}
			}
 
	}

}
