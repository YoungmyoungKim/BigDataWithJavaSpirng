package ch09;

public class shallowVsDeepCopyExample {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		 //새로운 객체 생성. -> 깊은 복사
		int[] arr2=new int[arr.length];  
		
		//각 요소 복사
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("arr의 값 변경 전: arr2");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		arr[0]=9; arr[1]=8; arr[2]=7;
		System.out.println();
		System.out.println("arr의 값 변경 후: arr");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
		
		//깊은 복사이기 때문에 arr2의 값에 영향 없음. 서로 다른 객체. 
		System.out.println("arr의 값 변경 후: arr2");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}

}
