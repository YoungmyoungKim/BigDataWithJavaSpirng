package ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put("HGD", "Seoul");
		map.put("IJM", "Suwon");
		map.put("HGD", "Incheon");  //Ű�� �ߺ� �Ǽ� ������ ������ �������.
		map.put("IGJ", "Busan");
		map.put("LSS", "Incheon");
		
		
		//get(key) : Ű�� �ش��ϴ� ���� ��ȯ
		System.out.println(map.get("HGD"));
		System.out.println(map.get("IJM"));
		System.out.println(map.get("IGJ"));
		System.out.println(map.get("LSS"));
	}

}
