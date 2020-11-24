package ch09;

public class ArraysCopyExample1 {

	public static void main(String[] args) {
		int[] arr1= {10, 20, 30};
		int[] arr2= {40, 50, 60};
		
		//작은 배열 두개를 합친 크기로 배열 생성
		int[] arr3=new int[arr1.length+arr2.length];
		
		//첫번째 배열 복사
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		//두번째 배열 복사
		for(int i=0; i<arr2.length; i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		//합친 배열 출력
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]의  값: "+arr3[i]);
		}
		System.out.println();
		//향상된 for문
		for(int num: arr3) {
			System.out.print(num+"\t");
		}

	}

}
