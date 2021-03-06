package Verify;

import java.util.Scanner;

public class BankApplication{

	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		boolean run=true;
		while(run){
			System.out.println("----------------------------------------------------");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금| 4. 출금| 5.종료");
		    System.out.println("----------------------------------------------------");
		    int selectNo = scanner.nextInt();
		
			if(selectNo==1){
				createAccount();
			}else if(selectNo==2){
			  accountList();
			}else if(selectNo==3){
			 deposit();
			}else if(selectNo==4){
			 withdraw();
			}else if(selectNo==5){
			  run=false; }
		}
		System.out.println("프로그램 종료");
	}
		
	private static void createAccount(){
		System.out.println("--------------");
	    System.out.println("계좌 생성");
	    System.out.println("--------------");
	    /*자동 발번
	    System.out.println("계좌 번호: ");
	    String ano=scanner.next();
	    */
	    System.out.println("계좌주: ");
	    String owner=scanner.next();
	    System.out.println("초기 입금액: ");
	    int balance=scanner.nextInt();
	    
	    BankAccount account = new BankAccount(owner, balance);
	    for(int i=0; i< accountArray.length; i++){
	        if(accountArray[i]==null){
	            accountArray[i]=account;
	            System.out.println("결과: 계좌가 생성 되었습니다.");
	            break;
	        }
	    }
	}
	
	//계좌목록보기
	private static void accountList(){
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		for(int i=0; i< accountArray.length; i++){
			if(accountArray[i]==null) break;
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+
					" "+accountArray[i].getBalance()); }
	}
	
	//예금하기
	private static void deposit(){
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int money = scanner.nextInt();
		BankAccount curAccount = findAccount(ano);
		if(curAccount == null) {
			System.out.println("결과 : 계좌가 없습니다.");
		} else {
			curAccount.setBalance((curAccount.getBalance()+money));
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	
	}
	
	//출금하기
	private static void withdraw(){
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int money = scanner.nextInt();
		BankAccount curAccount = findAccount(ano);
		if(curAccount == null) {
			System.out.println("결과 : 계좌가 없습니다.");
		} else {
			curAccount.setBalance((curAccount.getBalance()-money));
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
	}
	
	  //Account 배열에서 ano와 동일한 Account 객체 찾기
	private static BankAccount findAccount(String ano){
		BankAccount acc=null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null && ano.equals(accountArray[i].getAno()))
				acc= accountArray[i];
				break;
		}
		return acc;
	}
}