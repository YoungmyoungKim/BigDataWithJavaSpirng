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
	System.out.println("프로그램 종료");
	}
	
	private static void printMenu() {
		System.out.println("---------------------------------------------------------------------");
	    System.out.println("1.고객등록 | 2.고객목록 | 3.포인트 적립| 4. 포인트 사용| 5.비밀번호 변경 | 6. 종료 ");
	    System.out.println("----------------------------------------------------------------------");
	}
	
	private static void createMember() {
		System.out.println("--------------");
	    System.out.println("고객 등록");
	    System.out.println("--------------");
	    String id;
	    do {
	    System.out.println("id: ");
	    id=scanner.next();
	    if(findMember(id)!=null)  
	    	System.out.println("결과: 실패! 이미 존재하는 아이디 입니다.");
	    else break;
	    	}while(true);
	    
	    System.out.println("password: ");
	    String password=scanner.next();
	    System.out.println("고객명: ");
	    String name=scanner.next();
	    memberList.add(new Member(id, password, name));
        System.out.println("결과: 고객이 등록 되었습니다.");
	    }
	
	private static void memberList() {
		for(Member mem: memberList) {
			System.out.println(mem.toString());
		}
	}
	
	private static void deposit() {
		System.out.println("id를 입력하세요>");
		String id=scanner.next();
		System.out.println("password를 입력하세요>");
		String password=scanner.next();
		System.out.println("적립할 포인트를 입력하세요>");
		double point=scanner.nextDouble();
		Member mem=findMember(id);
		if(mem!=null && password.equals(mem.getPassword())) {
			System.out.print("로그인 성공!!\n");
			mem.setPoint(point+mem.getPoint());
			System.out.print(mem.getName()+"의 포인트를 적립했습니다.\n");
		}
		else if(mem != null && !password.equals(mem.getPassword())) {
			System.out.print("로그인 실패!! 패스워드가 틀립니다.\n");
		}
		else if(mem==null) {
			System.out.print("해당하는 고객이 없습니다.\n");
		}
	}
	
	private static void withdraw() {
		System.out.println("id를 입력하세요>");
		String id=scanner.next();
		System.out.println("password를 입력하세요>");
		String password=scanner.next();
		System.out.println("사용 할 포인트를 입력하세요>");
		double point=scanner.nextDouble();
		Member mem=findMember(id);
		if(mem!=null && password.equals(mem.getPassword())) {
			System.out.print("로그인 성공!!\n");
			if(point>mem.getPoint()) {System.out.print("포인트가 부족합니다.\n");}
			else{
				mem.setPoint(mem.getPoint()-point);
				System.out.print(mem.getName()+"의 포인트를 사용했습니다.\n");
				}
			}
		else if(mem != null && !password.equals(mem.getPassword())) {
			System.out.print("로그인 실패!! 패스워드가 틀립니다.\n");
		}
		else if(mem==null) {
			System.out.print("해당하는 고객이 없습니다.\n");
		}
	}
	
	private static void changePassword() {
		System.out.println("--------------");
	    System.out.println("비밀번호 변경");
	    System.out.println("--------------");
	    String id;
	    do {
	    System.out.println("id: ");
	    id=scanner.next();
	    if(findMember(id)==null)  
	    	System.out.println("실패! 존재하지 않는 고객 입니다.\n");
	    else break;
	    	}while(true);
	    
	    Member mem=findMember(id);
	    do {
	    	System.out.println("password: ");
		    String password=scanner.next();
	    if(password.equals(mem.getPassword())) {
	    	System.out.println("로그인 성공! 변경할 비밀번호를 입력하세요.");
	    	mem.setPassword(scanner.next());
	    	System.out.println("결과: 비밀번호가 변경되었습니다.");
	    	break;
	    }else {
	    	 System.out.println("비밀번호가 틀립니다. 다시 입력하세요");
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


