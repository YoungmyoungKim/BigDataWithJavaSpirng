package ch01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set set=new HashSet();
		//set은 중복 허용 안함.
		set.add("HGD");
		set.add("KYT");
		set.add("SER");
		set.add("SEW");
		set.add("HGD");
		
		
		System.out.println(set);

	}

}
