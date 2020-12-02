package HW;

import java.util.Scanner;

//상품 등록, 입고, 출고, findItem
public class StockApplication {
	private static Item[] itemArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		boolean run=true;
		while(run){
			System.out.println("----------------------------------------------------");
		    System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
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
		System.out.println("프로그램 종료");

}
	private static void createItem(){
		System.out.println("--------------");
	    System.out.println("재고 등록");
	    System.out.println("--------------");
	    /*
	    System.out.println("재고 코드: ");
	    String itemCode=scanner.next();
	    */
	    System.out.println("상품명: ");
	    String name=scanner.next();
	    System.out.println("재고량: ");
	    int qty=scanner.nextInt();
	    
	    Item item = new Item(name, qty);
	    for(int i=0; i< itemArray.length; i++){
	        if(itemArray[i]==null){
	        	itemArray[i]=item;
	            System.out.println("결과: 재고가 등록 되었습니다.");
	            break;
	        }
	    }
	}
	
	//재고목록보기
	private static void itemList(){
		System.out.println("--------------");
		System.out.println("재고 목록");
		System.out.println("--------------");
		for(int i=0; i< itemArray.length; i++){
			if(itemArray[i]==null) break;
			System.out.println(String.format("%-10s",itemArray[i].getItemCode())
					+String.format("%20s", itemArray[i].getName())+String.format("%6d",itemArray[i].getQty())); }
	}
	
	private static void deposit(){
		System.out.println("----------");
		System.out.println("입고처리");
		System.out.println("----------");
		System.out.print("제품 코드 : ");
		String itemCode = scanner.next();
		System.out.print("재고량 : ");
		int qty = scanner.nextInt();
		Item curItem = findItem(itemCode);
		if(curItem == null) {
			System.out.println("결과 : 제품이 없습니다.");
		} else {
			curItem.setQty((curItem.getQty()+qty));
			System.out.println("결과 : 입고 처리 되었습니다.");
		}
	
	}
	
	private static void withdraw(){
		System.out.println("----------");
		System.out.println("출고처리");
		System.out.println("----------");
		System.out.print("제품 코드 : ");
		String itemCode = scanner.next();
		System.out.print("출고량 : ");
		int qty = scanner.nextInt();
		Item curItem = findItem(itemCode);
		if(itemCode == null) {
			System.out.println("결과 : 계좌가 없습니다.");
		} else {
			curItem.setQty((curItem.getQty()-qty));
			System.out.println("결과 : 출고 성공했습니다.");
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
