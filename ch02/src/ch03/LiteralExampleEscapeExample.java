package ch03;

//리터럴로 사용되는 문자 중 \로 시작하는 문자는 특수 기능
public class LiteralExampleEscapeExample {

	public static void main(String[] args) {
		//쌍따옴표 사용 시 \"로 사용 
		String str1="홍길동은 \"안녕하세요\"라고 말했다";
		System.out.println(str1);
		
		//따옴표 사용 시 \'로 사용 
		String str2= "\'java\'는 재밌다";
		System.out.println(str2);
		
		//백스페이스 \b
		String str3="앞으로 갔다가    \b\b뒤로 한 칸 간다";
		System.out.println(str3);
		
		//다음 줄 \r, \n, \r\n  (\n\r 은 두 줄 넘어감)
		String str4="다음 줄로 이동 \n 다음 줄 출력";
		System.out.println(str4);
		
		//탭만큼 공백 \t
		String str5="탭크 폭만큼 \t 건너뛰기";
		System.out.println(str5);
		
		// \문자 표시  \\
		String str6="c:\\temp";
		System.out.println(str6);
	}

}
