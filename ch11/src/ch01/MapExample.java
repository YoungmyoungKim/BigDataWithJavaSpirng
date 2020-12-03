package ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put("HGD", "Seoul");
		map.put("IJM", "Suwon");
		map.put("HGD", "Incheon");  //키가 중복 되서 마지막 값으로 덮어씌워짐.
		map.put("IGJ", "Busan");
		map.put("LSS", "Incheon");
		
		
		//get(key) : 키에 해당하는 값을 반환
		System.out.println(map.get("HGD"));
		System.out.println(map.get("IJM"));
		System.out.println(map.get("IGJ"));
		System.out.println(map.get("LSS"));
	}

}
