package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		//map�� Ű�� ������ ��ü ����
		map.put("����", 30);
		map.put("����¡", 25);
		map.put("����", 28);  
		
		//get(key) : Ű�� �ش��ϴ� ���� ��ȯ
		System.out.println("������ �µ��� "+map.get("����"));
		System.out.println("����¡�� �µ��� "+map.get("����¡"));
		System.out.println("������ �µ��� "+map.get("����"));
		
	}

}
