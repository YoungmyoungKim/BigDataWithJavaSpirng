package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set set=new HashSet();
		
		//set은 중복 허용 안함.
		set.add(new Integer(10));
		set.add(new Integer(20));
		
		//AutoBoxing
		set.add(10);
		set.add(30);
		
		System.out.println(set);
	}
}
