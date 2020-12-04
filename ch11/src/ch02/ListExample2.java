package ch02;

import java.util.List;
import java.util.Vector;

public class ListExample2 {

	public static void main(String[] args) {
		List list=new Vector();
		
		list.add("서울");
		list.add("대전");
		list.add("서울");
		list.add("대구");
		list.add("부산");
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
