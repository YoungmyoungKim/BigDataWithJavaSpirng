package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		//map에 키와 값으로 객체 저장
		map.put("HGD", new Integer(85));
		map.put("IJM", 90);
		map.put("HGD", new Integer(88));  
		
		//AutoBoxing
		map.put("IGJ", 75);
		map.put("LSS", 80);
		
		
		//get(key) : 키에 해당하는 값을 반환
		System.out.println(map.get("HGD"));
		System.out.println(map.get("IJM"));
		System.out.println(map.get("IGJ"));
		System.out.println(map.get("LSS"));
	}

}
