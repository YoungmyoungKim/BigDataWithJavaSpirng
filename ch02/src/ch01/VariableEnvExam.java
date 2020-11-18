package ch01;

public class VariableEnvExam {
	public static void main(String[] args) {
		int price=1000;
		int $price=200;  //특수문자 중 $ 사용가능(필수)
		String _companyName="서울it";   //특수문자_사용가능(필수)
		
		//식별자는 대소문자를 구분함(필수)
		String firstname="일지매";
		String firstName="임꺽정";
		
		//식별자 명명 규칙(관례) - 카멜 표기법(합성어의 두번째 단어부터는 첫글자를 대문자로 표기 )
		int maxSpeed=210;  //max+speed => maxSpeed
		String carBodyColor="Red";   //car+body+color => carBodyColor
		
		/* 자바 예약어, 리터럴 값은 식별자로 사용불가(필수)
		int class=20;
		int if=50;
		int true=10;
		int null=100;
		*/
		System.out.println("firstname: "+firstname +" / "+"firstName: "+firstName);
		System.out.println("maxSpeed: "+maxSpeed + " / " +"carBodyColor: "+carBodyColor);
	}
}
