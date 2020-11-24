package ch09;

public class shallowVsDeepCopyExample2 {

	public static void main(String[] args) {
		// 얕은 복사: 같은 객체를 공유   Vs 깊은 복사: 서로 다른 객체로 값만 복사
		int[] arr= {1, 2, 3, 4, 5};
		int[] arr2=arr;
		System.out.println("arr2는 arr를 얕은 복사, 같은 객체 공유");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		arr[0]=9; arr[1]=8; arr[2]=7;
		System.out.println("arr의 값 변경 후 arr2의 값");
		//얕은 복사이기 때문에 arr2의 값까지 바뀜. 한 객체를 공유함. 
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}

}
