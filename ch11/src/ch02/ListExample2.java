package ch02;

import java.util.List;
import java.util.Vector;

public class ListExample2 {

	public static void main(String[] args) {
		List list=new Vector();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("�뱸");
		list.add("�λ�");
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
