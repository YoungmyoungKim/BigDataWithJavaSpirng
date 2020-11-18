package ch05;

public class PrimitiveTypeScopeExample {

	public static void main(String[] args) {	
	//int -> Integer, byte -> Byte, char -> Character, short -> Short, long -> Long
		
		System.out.println(Integer.MIN_VALUE+"<= int ����<= "+Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"<= Byte ����<= "+Byte.MAX_VALUE);
		
		//���ڰ� �ƴ϶� "(0)<= <=?" �̷��� ����           
		System.out.println(Character.MIN_VALUE+"<= Char ����<= "+Character.MAX_VALUE);
		
		//float -> Float, double -> Double
		//������ Ÿ���� �ּ�, �ִ� ���� �˰� ���� �� ���� Ŭ������ �̿��Ͽ� �˾� �� �� ���� 
		System.out.println(Short.MIN_VALUE+"<= Short ����<= "+ Short.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"<= Long ����<= "+ Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"<= Float ����<= "+ Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"<= Double ����<= "+ Double.MAX_VALUE);

		byte n1=127;
		//byte j=i+1;    //byte ���� ������ �Ѿ�� ���� �Ұ� (-128~127)
		
		System.out.println(n1);
		System.out.println(n1+1);   //byte Ÿ���� �� + ���� ���ͷ� => ���� Ÿ�� 
		
		byte var1=125;
		int var2=2147483645;
		short var3=32765;
		
		for(int i=0; i<10; i++ ) {
			var1++;
			var2++;
			var3++;
			//var1 ���� ������ ���ư� -> �����÷ο� 
			System.out.println("var1: "+var1+" var2: "+var2+" var3: "+var3);	
		}	
	}
}
