package ch09;

public class SystemApiArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray= {"JAVA", "array", "copy"};
		String[] newStrArray=new String[5];    //반복문으로 복사
		String[] newStrArray2=new String[5];   //System.arraycopy로 복사
		
		for(int i=0; i<oldStrArray.length;i++) {
			newStrArray[i]=oldStrArray[i];
		}
		System.out.println("반복문 이용 복사");
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println("newStrArray["+i+"]의  값: "+newStrArray[i]);
		}
		System.out.println();
		
		//System.arraycopy 이미 존재하는 배열에 기존에 존재하는 배열의 값을 복사 
		System.out.println("arraycopy 함수 이용 복사");
		//시스템 함수로 배열 복사
		//arraycopy(소스, 소스의 시작 인덱스, 목적, 목적의 시작 인덱스, 복사할 개수);
		System.arraycopy(oldStrArray, 0, newStrArray2, 1, oldStrArray.length);
		
		newStrArray2[0]="spring";
		for(int i=0; i<newStrArray2.length; i++) {
			System.out.println("newStrArray2["+i+"]의  값: "+newStrArray2[i]);
		}
	}

}
