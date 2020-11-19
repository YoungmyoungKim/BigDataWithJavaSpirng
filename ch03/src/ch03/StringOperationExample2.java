package ch03;

public class StringOperationExample2 {

	public static void main(String[] args) {
		String str3="JDK"+6.0;   //String + double -> String
		String str4=str3+"Æ¯Â¡";
		System.out.println(str4);
		
		String str5="JDK"+3+3.0;    //String + int +double -> String + String + String
		String str6=3+3.0+"JDK";    //int + double => double, double + String -> String
		System.out.println(str5);
		System.out.println(str6);
		
		String str="JDK"+(3+3.0); // (3.0+3.0) -> 6.0 -> "JDK"+"6.0" °áÇÕ -> "JDK6.0"
		System.out.println(str);
	}

}
