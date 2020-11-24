package ch09;

public class SystemApiArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray= {"JAVA", "array", "copy"};
		String[] newStrArray=new String[5];    //�ݺ������� ����
		String[] newStrArray2=new String[5];   //System.arraycopy�� ����
		
		for(int i=0; i<oldStrArray.length;i++) {
			newStrArray[i]=oldStrArray[i];
		}
		System.out.println("�ݺ��� �̿� ����");
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println("newStrArray["+i+"]��  ��: "+newStrArray[i]);
		}
		System.out.println();
		
		//System.arraycopy �̹� �����ϴ� �迭�� ������ �����ϴ� �迭�� ���� ���� 
		System.out.println("arraycopy �Լ� �̿� ����");
		//�ý��� �Լ��� �迭 ����
		//arraycopy(�ҽ�, �ҽ��� ���� �ε���, ����, ������ ���� �ε���, ������ ����);
		System.arraycopy(oldStrArray, 0, newStrArray2, 1, oldStrArray.length);
		
		newStrArray2[0]="spring";
		for(int i=0; i<newStrArray2.length; i++) {
			System.out.println("newStrArray2["+i+"]��  ��: "+newStrArray2[i]);
		}
	}

}
