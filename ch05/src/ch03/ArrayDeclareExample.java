package ch03;

public class ArrayDeclareExample {

	public static void main(String[] args) {
		//두 경우 모두 가능 
		int[] arr1=null;      //타입[] 변수명;
		int arr2[];      //타입 변수명[];
		arr2=new int[] {1, 2, 3};
		
		String[] str1=null;
		String str2[];
		str2=new String[] {"hi", "hello"};
		
		double[] dArr=null;
		double dArr2[];
		dArr2=new double[] {0.1, 0.2};
		
	}

}
