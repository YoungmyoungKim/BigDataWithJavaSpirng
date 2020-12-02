package Verify;

import java.util.Scanner;

public class BankApplication{

	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		boolean run=true;
		while(run){
			System.out.println("----------------------------------------------------");
		    System.out.println("1.���»��� | 2.���¸�� | 3.����| 4. ���| 5.����");
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
		System.out.println("���α׷� ����");
	}
		
	private static void createAccount(){
		System.out.println("--------------");
	    System.out.println("���� ����");
	    System.out.println("--------------");
	    /*�ڵ� �߹�
	    System.out.println("���� ��ȣ: ");
	    String ano=scanner.next();
	    */
	    System.out.println("������: ");
	    String owner=scanner.next();
	    System.out.println("�ʱ� �Աݾ�: ");
	    int balance=scanner.nextInt();
	    
	    BankAccount account = new BankAccount(owner, balance);
	    for(int i=0; i< accountArray.length; i++){
	        if(accountArray[i]==null){
	            accountArray[i]=account;
	            System.out.println("���: ���°� ���� �Ǿ����ϴ�.");
	            break;
	        }
	    }
	}
	
	//���¸�Ϻ���
	private static void accountList(){
		System.out.println("--------------");
		System.out.println("���� ���");
		System.out.println("--------------");
		for(int i=0; i< accountArray.length; i++){
			if(accountArray[i]==null) break;
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+
					" "+accountArray[i].getBalance()); }
	}
	
	//�����ϱ�
	private static void deposit(){
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("���ݾ� : ");
		int money = scanner.nextInt();
		BankAccount curAccount = findAccount(ano);
		if(ano == null) {
			System.out.println("��� : ���°� �����ϴ�.");
		} else {
			curAccount.setBalance((curAccount.getBalance()+money));
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
	
	}
	
	//����ϱ�
	private static void withdraw(){
		System.out.println("----------");
		System.out.println("���");
		System.out.println("----------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("��ݾ� : ");
		int money = scanner.nextInt();
		BankAccount curAccount = findAccount(ano);
		if(ano == null) {
			System.out.println("��� : ���°� �����ϴ�.");
		} else {
			curAccount.setBalance((curAccount.getBalance()-money));
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
	}
	
	  //Account �迭���� ano�� ������ Account ��ü ã��
	private static BankAccount findAccount(String ano){
		for(int i = 0; i < accountArray.length; i++) {
			if(ano.equals(accountArray[i].getAno()))
				return accountArray[i];
		}
		return null;
	}
}