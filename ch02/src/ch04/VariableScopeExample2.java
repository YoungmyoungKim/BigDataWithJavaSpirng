package ch04;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			int v2=v1-10;
		}
		
		//v2는 범위 밖이라 메모리에서 지워짐. 사용 불가 
		//int v3=v1+v2+5;
		
		

	}

}
