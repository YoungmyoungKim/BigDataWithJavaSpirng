package ch02;

import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		List list=new Vector();
		
		//객체만 저장
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Double(10.5));
		list.add(new Boolean(true));
		
		//컬렉션 요소는 객체만 가능
		//기본 타입 넣어도 오류 안남 => AutoBoxing 되기 때문
		list.add(50);  
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //해당 인덱스에 저장된 값
			//정수인 50의 출력은 Integer.toString() 메소드에 의해 "50"으로 출력
		}
	}
}
