package HW;

import java.util.Scanner;

//��ǰ ���, �԰�, ���, findItem
public class StockApplication {
	private static Item[] itemArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		boolean run=true;
		while(run){
			System.out.println("----------------------------------------------------");
		    System.out.println("1.����� | 2.����� | 3.�԰�ó��| 4. ���ó��| 5.����");
		    System.out.println("----------------------------------------------------");
		    int selectNo = scanner.nextInt();
		
			if(selectNo==1){
				createItem();
			}else if(selectNo==2){
			  itemList();
			}else if(selectNo==3){
			 deposit();
			}else if(selectNo==4){
			 withdraw();
			}else if(selectNo==5){
			  run=false; }
		}
		System.out.println("���α׷� ����");

}
	private static void createItem(){
		System.out.println("--------------");
	    System.out.println("��� ���");
	    System.out.println("--------------");
	    /*
	    System.out.println("��� �ڵ�: ");
	    String itemCode=scanner.next();
	    */
	    System.out.println("��ǰ��: ");
	    String name=scanner.next();
	    System.out.println("���: ");
	    int qty=scanner.nextInt();
	    
	    Item item = new Item(name, qty);
	    for(int i=0; i< itemArray.length; i++){
	        if(itemArray[i]==null){
	        	itemArray[i]=item;
	            System.out.println("���: ��� ��� �Ǿ����ϴ�.");
	            break;
	        }
	    }
	}
	
	//����Ϻ���
	private static void itemList(){
		System.out.println("--------------");
		System.out.println("��� ���");
		System.out.println("--------------");
		for(int i=0; i< itemArray.length; i++){
			if(itemArray[i]==null) break;
			System.out.println(String.format("%-10s",itemArray[i].getItemCode())
					+String.format("%20s", itemArray[i].getName())+String.format("%6d",itemArray[i].getQty())); }
	}
	
	private static void deposit(){
		System.out.println("----------");
		System.out.println("�԰�ó��");
		System.out.println("----------");
		System.out.print("��ǰ �ڵ� : ");
		String itemCode = scanner.next();
		System.out.print("��� : ");
		int qty = scanner.nextInt();
		Item curItem = findItem(itemCode);
		if(curItem == null) {
			System.out.println("��� : ��ǰ�� �����ϴ�.");
		} else {
			curItem.setQty((curItem.getQty()+qty));
			System.out.println("��� : �԰� ó�� �Ǿ����ϴ�.");
		}
	
	}
	
	private static void withdraw(){
		System.out.println("----------");
		System.out.println("���ó��");
		System.out.println("----------");
		System.out.print("��ǰ �ڵ� : ");
		String itemCode = scanner.next();
		System.out.print("��� : ");
		int qty = scanner.nextInt();
		Item curItem = findItem(itemCode);
		if(itemCode == null) {
			System.out.println("��� : ���°� �����ϴ�.");
		} else {
			curItem.setQty((curItem.getQty()-qty));
			System.out.println("��� : ��� �����߽��ϴ�.");
		}
	}
	
	private static Item findItem(String itemCode){
		for(int i = 0; i < itemArray.length; i++) {
			if(itemCode.equals(itemArray[i].getItemCode()))
				return itemArray[i];
		}
		return null;
	}
}
