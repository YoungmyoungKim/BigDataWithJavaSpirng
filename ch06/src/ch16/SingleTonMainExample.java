package ch16;

public class SingleTonMainExample {

	public static void main(String[] args) {
		//불가
		//SingleTon obj1=new SingleTon();   
		SingleTon obj1=SingleTon.getInstance();
		SingleTon obj2=SingleTon.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 SingleTon 객체입니다.");
		}
		else {
			System.out.println("다른 SingleTon 객체입니다.");
		}
		
	}

}
