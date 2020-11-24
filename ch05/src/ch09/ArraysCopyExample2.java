package ch09;

import java.util.Arrays;

public class ArraysCopyExample2 {

	public static void main(String[] args) {
		int[] intArr= {1, 2, 3, 4, 5};
		
		//Arrays.copyOf ���ο� �迭(newArr)�� ���� �� ����
		int[] newArr=Arrays.copyOf(intArr, intArr.length);
		
		System.out.println("Arrays.copyOf (int �� �迭) �Լ� �̿� ����");
		for(int i=0; i<newArr.length; i++) {
			System.out.println("newArr["+i+"]��  ��: "+newArr[i]);
		}
		
		//String �迭 ����
		String[] oldStrArray= {"JAVA", "array", "copy"};
		//String �迭 ���� 
		String[] newStrArray=Arrays.copyOf(oldStrArray, oldStrArray.length);
		
		System.out.println();
		System.out.println("Arrays.copyOf(String �� �迭) �Լ� �̿� ����");
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println("newStrArray["+i+"]��  ��: "+newStrArray[i]);
		}

	}

}
