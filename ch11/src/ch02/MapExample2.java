package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		//map에 키와 값으로 객체 저장
		map.put("서울", 30);
		map.put("베이징", 25);
		map.put("도쿄", 28);  
		
		//get(key) : 키에 해당하는 값을 반환
		System.out.println("서울의 온도는 "+map.get("서울"));
		System.out.println("베이징의 온도는 "+map.get("베이징"));
		System.out.println("도쿄의 온도는 "+map.get("도쿄"));
		
	}

}
