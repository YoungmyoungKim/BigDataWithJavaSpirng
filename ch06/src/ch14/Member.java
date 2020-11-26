package ch14;

public class Member {
	static int seq;   //0으로 초기화
	int sno;      //0으로 초기화
	String name;
	String email;
	
	Member(String name, String email){
		seq++;
		this.sno=seq;
		this.name=name;
		this.email=email;
	}
	void info() {
		System.out.println("회원 번호: "+this.sno+" 이름: "+this.name+" , "+this.email);
	}
	
	static void total() {
		System.out.println("총 회원수: "+seq+" 명");
	}
}
