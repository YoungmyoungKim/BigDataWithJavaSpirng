package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		//map�� Ű�� ������ ��ü ����
		map.put("HGD", new Integer(85));
		map.put("IJM", 90);
		map.put("HGD", new Integer(88));  
		
		//AutoBoxing
		map.put("IGJ", 75);
		map.put("LSS", 80);
		
		
		//get(key) : Ű�� �ش��ϴ� ���� ��ȯ
		System.out.println(map.get("HGD"));
		System.out.println(map.get("IJM"));
		System.out.println(map.get("IGJ"));
		System.out.println(map.get("LSS"));
	}

}
