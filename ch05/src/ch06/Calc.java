package ch06;

public class Calc {
	//main 메소드의 매개변수 String[] args는
	//길이가 정해져있지 않은 배열, 명령 프롬프터에서 실행시 아규먼트 입력할 때
	//배열로 생성되어 main() 메소드로 전달 됨.
	public static void main(String[] args) {  //[10][+][20]
		if(args.length>=3) {
			switch(args[1]) {
			case "+": System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2])); break;
			case "-": System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2])); break;
			case "x": System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[2])); break;
			}
		}
	}

}
