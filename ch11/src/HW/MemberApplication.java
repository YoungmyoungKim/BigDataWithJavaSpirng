package HW;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberApplication {
	private static ArrayList<Member> memberList = new ArrayList<Member>();
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
		   changePassword();}
		else if(selectNo==6){
		   run=false; }
	}
	System.out.println("���α׷� ����");
	}
	
	private static void printMenu() {
		System.out.println("---------------------------------------------------------------------");
	    System.out.println("1.����� | 2.����� | 3.����Ʈ ����| 4. ����Ʈ ���| 5.��й�ȣ ���� | 6. ���� ");
	    System.out.println("----------------------------------------------------------------------");
	}
	
	private static void createMember() {
		System.out.println("--------------");
	    System.out.println("�� ���");
	    System.out.println("--------------");
	    String id;
	    do {
	    System.out.println("id: ");
	    id=scanner.next();
	    if(findMember(id)!=null)  
	    	System.out.println("���: ����! �̹� �����ϴ� ���̵� �Դϴ�.");
	    else break;
	    	}while(true);
	    
	    System.out.println("password: ");
	    String password=scanner.next();
	    System.out.println("����: ");
	    String name=scanner.next();
	    memberList.add(new Member(id, password, name));
        System.out.println("���: ���� ��� �Ǿ����ϴ�.");
	    }
	
	private static void memberList() {
		for(Member mem: memberList) {
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
	
	private static void changePassword() {
		System.out.println("--------------");
	    System.out.println("��й�ȣ ����");
	    System.out.println("--------------");
	    String id;
	    do {
	    System.out.println("id: ");
	    id=scanner.next();
	    if(findMember(id)==null)  
	    	System.out.println("����! �������� �ʴ� �� �Դϴ�.\n");
	    else break;
	    	}while(true);
	    
	    Member mem=findMember(id);
	    do {
	    	System.out.println("password: ");
		    String password=scanner.next();
	    if(password.equals(mem.getPassword())) {
	    	System.out.println("�α��� ����! ������ ��й�ȣ�� �Է��ϼ���.");
	    	mem.setPassword(scanner.next());
	    	System.out.println("���: ��й�ȣ�� ����Ǿ����ϴ�.");
	    	break;
	    }else {
	    	 System.out.println("��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է��ϼ���");
	    }
	    }while(true);
	    }
	
	private static Member findMember(String id){
		Member mem=null;
		for(Member member: memberList) 
			if(id.equals(member.getId()))
				mem=member;
		return mem;
		}
}


