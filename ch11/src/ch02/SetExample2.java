package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		Set set=new HashSet();
		
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("�뱸");
		set.add("�λ�");
		
		System.out.println(set);
	}
}
