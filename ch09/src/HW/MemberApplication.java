package HW;

import java.util.Scanner;

public class MemberApplication {
	private static Member[] memberArray = new Member[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){

	boolean run=true;
	while(run){
	   printMenu();
	   int selectNo = scanner.nextInt();

	   if(selectNo==1){
		   createMember();
	   }else if(selectNo==2){
		   memberList();
	   }else if(selectNo==3){
		   deposit();
	   }else if(selectNo==4){
		   withdraw();
	   }else if(selectNo==5){
		   run=false; }
	}
	System.out.println("���α׷� ����");
	}
	
	private static void printMenu() {
		System.out.println("----------------------------------------------------");
	    System.out.println("1.����� | 2.����� | 3.����Ʈ ����| 4. ����Ʈ ���| 5.����");
	    System.out.println("----------------------------------------------------");
	}
	
	private static void createMember() {
		System.out.println("--------------");
	    System.out.println("�� ���");
	    System.out.println("--------------");
	    System.out.println("����: ");
	    String name=scanner.next();
	    System.out.println("id: ");
	    String id=scanner.next();
	    System.out.println("password: ");
	    String password=scanner.next();
	    
	    Member member = new Member(id, password, name);
	    for(int i=0; i<memberArray.length;i++){
	        if(memberArray[i]==null){
	        	memberArray[i]=member;
	            System.out.println("���: ���� ��� �Ǿ����ϴ�.");
	            break;
	        }
	    }
	}
	private static void memberList() {
		for(Member mem: memberArray) {
			if(mem == null) break;
			System.out.println(mem.toString());
		}
	}
	
	private static void deposit() {
		System.out.println("id�� �Է��ϼ���>");
		String id=scanner.next();
		System.out.println("password�� �Է��ϼ���>");
		String password=scanner.next();
		System.out.println("������ ����Ʈ�� �Է��ϼ���>");
		double point=scanner.nextDouble();
		Member mem=findMember(id);
		if(mem!=null && password.equals(mem.getPassword())) {
			System.out.print("�α��� ����!!\n");
			mem.setPoint(point+mem.getPoint());
			System.out.print(mem.getName()+"�� ����Ʈ�� �����߽��ϴ�.\n");
		}
		else if(mem != null && !password.equals(mem.getPassword())) {
			System.out.print("�α��� ����!! �н����尡 Ʋ���ϴ�.\n");
		}
		else if(mem==null) {
			System.out.print("�ش��ϴ� ���� �����ϴ�.\n");
		}
	}
	
	private static void withdraw() {
		System.out.println("id�� �Է��ϼ���>");
		String id=scanner.next();
		System.out.println("password�� �Է��ϼ���>");
		String password=scanner.next();
		System.out.println("��� �� ����Ʈ�� �Է��ϼ���>");
		double point=scanner.nextDouble();
		Member mem=findMember(id);
		if(mem!=null && password.equals(mem.getPassword())) {
			System.out.print("�α��� ����!!\n");
			if(point>mem.getPoint()) {System.out.print("����Ʈ�� �����մϴ�.\n");}
			else{
				mem.setPoint(mem.getPoint()-point);
				System.out.print(mem.getName()+"�� ����Ʈ�� ����߽��ϴ�.\n");
				}
			}
		else if(mem != null && !password.equals(mem.getPassword())) {
			System.out.print("�α��� ����!! �н����尡 Ʋ���ϴ�.\n");
		}
		else if(mem==null) {
			System.out.print("�ش��ϴ� ���� �����ϴ�.\n");
		}
	}
	
	private static Member findMember(String id){
		Member mem=null;
		for(Member member: memberArray) {
			if(member!=null && id.equals(member.getId()))
				return member;
				}
		return mem;
		}

}


