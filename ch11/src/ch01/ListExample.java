package ch01;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("HGD");
		list.add("KYT");
		list.add("SER");
		list.add("SEW");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));; //�ش� �ε����� ����� ��
		}

	}

}
