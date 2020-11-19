package ch07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerInputExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 여부(true/false)를 빈칸으로 분리하여 입력하세요: ");
	
		//토큰 단위가 아닌 라인 단위로 입력받는 메소드 nextLine();  
		String str=scanner.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		String name=st.nextToken();
		String city=st.nextToken();
		int age=Integer.parseInt(st.nextToken());
		double weight=Double.parseDouble(st.nextToken());
		boolean single=Boolean.parseBoolean(st.nextToken());
		
		System.out.println("이름: "+name+" ,도시: "+city+" ,"
				+ "나이: "+age+" ,체중: "+weight+" ,독신 여부: "
				+(single? "싱글":"기혼"));
		
		//자원 해제
		scanner.close();
	}

}
