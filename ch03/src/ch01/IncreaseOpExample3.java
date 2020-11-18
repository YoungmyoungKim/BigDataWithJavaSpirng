package ch01;

public class IncreaseOpExample3 {

	public static void main(String[] args) {
		int x=0;
		int y=10;
		int z;
		
		System.out.println("----------------------");
		x++;
		++x;
		System.out.println("x= "+x);
		
		System.out.println("----------------------");
		y++;
		++y;
		System.out.println("y= "+y);
		
		System.out.println("----------------------");
		z=x++;    //대입 연산 후에 증감연산을 하기 때문에 z는 1증가하기 전인 2가되고 그 후에 x는 3이 됨.
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		
		System.out.println("----------------------");
		//x는 1 증가하고 z에 더해짐, y는 z에 더해진 후 1 증가
		z=++x + y++;
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		int family= 150;
		System.out.println("홍길동의 가족은 모두 "+ ++family+"명이다.");
		System.out.println("family= "+family);
		System.out.println("홍길동의 가족은 모두 "+ family++ +"명이다.");
		System.out.println("family= "+family);
	}

}
