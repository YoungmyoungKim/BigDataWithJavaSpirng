package ch07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerInputExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸�, ����, ����, ü��, ���� ����(true/false)�� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
	
		//��ū ������ �ƴ� ���� ������ �Է¹޴� �޼ҵ� nextLine();  
		String str=scanner.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		String name=st.nextToken();
		String city=st.nextToken();
		int age=Integer.parseInt(st.nextToken());
		double weight=Double.parseDouble(st.nextToken());
		boolean single=Boolean.parseBoolean(st.nextToken());
		
		System.out.println("�̸�: "+name+" ,����: "+city+" ,"
				+ "����: "+age+" ,ü��: "+weight+" ,���� ����: "
				+(single? "�̱�":"��ȥ"));
		
		//�ڿ� ����
		scanner.close();
	}

}
