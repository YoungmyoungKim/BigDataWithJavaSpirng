package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		Set set=new HashSet();
		
		set.add("서울");
		set.add("대전");
		set.add("서울");
		set.add("대구");
		set.add("부산");
		
		System.out.println(set);
	}
}
