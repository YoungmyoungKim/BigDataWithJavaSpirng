package ch06;

//범위가 넓은 데이터 타입에서 범위가 좁은 데이터 타입으로 강제 변환 시 데이터 손실 위험
public class CastingExample {

	public static void main(String[] args) {
		int intValue1= 100;
		byte byteValue1=(byte)intValue1;
		//byte 범위 내에 있는 값이기 때문에 데이터 손실 없음
		System.out.println(byteValue1);
		
		intValue1 = 103029770;
		byteValue1=(byte)intValue1;
		System.out.println(byteValue1);
		
		short shortValue= (short)intValue1;
		System.out.println(shortValue);
	}

}
