package ch09;

import java.util.Arrays;

public class ArraysCopyExample2 {

	public static void main(String[] args) {
		int[] intArr= {1, 2, 3, 4, 5};
		
		//Arrays.copyOf 새로운 배열(newArr)을 만든 뒤 복사
		int[] newArr=Arrays.copyOf(intArr, intArr.length);
		
		System.out.println("Arrays.copyOf (int 형 배열) 함수 이용 복사");
		for(int i=0; i<newArr.length; i++) {
			System.out.println("newArr["+i+"]의  값: "+newArr[i]);
		}
		
		//String 배열 생성
		String[] oldStrArray= {"JAVA", "array", "copy"};
		//String 배열 복사 
		String[] newStrArray=Arrays.copyOf(oldStrArray, oldStrArray.length);
		
		System.out.println();
		System.out.println("Arrays.copyOf(String 형 배열) 함수 이용 복사");
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println("newStrArray["+i+"]의  값: "+newStrArray[i]);
		}

	}

}
