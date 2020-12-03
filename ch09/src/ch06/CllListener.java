package ch06;

public class CllListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
	//상속 후 추가 된 메소드는 접근 불가
	public void method() {
		System.out.println("추가 된 메소드");
	}
	

}
