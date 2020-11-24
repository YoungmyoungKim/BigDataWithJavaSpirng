package ch02;

public class NullExample {

	public static void main(String[] args) {
		String refVal1=new String("hello");
		String refVal2=null;
		
		refVal2=refVal1;  
		System.out.println("refVal1: "+refVal1);
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
		
		if(refVal2==refVal1) System.out.println("동일 객체를 참조함");
		else System.out.println("다른 객체를 참조함");
		
		if(refVal1.equals(refVal2)) System.out.println("내용이 같음");
		else System.out.println("내용이 다름");
		System.out.println();
		
		refVal2=new String("hi");  //"hello" 객체와 연결이 끊어지고, "hi" 객체를 참조함
		
		System.out.println("refVal1: "+refVal1);
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
		
		if(refVal2==refVal1) System.out.println("동일 객체를 참조함");
		else System.out.println("다른 객체를 참조함");
		
		if(refVal1.equals(refVal2)) System.out.println("내용이 같음");
		else System.out.println("내용이 다름");
		System.out.println();
		
		//"hi" 객체와 연결이 쓶어짐. 참조하던 객체와 연결이 끊어졌을 때 값을 읽으려 하면 
		//NullPointException 발생
		refVal2=null; 
		
		System.out.println("refVal2: "+refVal2);
		System.out.println("refVal2 length: "+refVal2.length());
	}

}
