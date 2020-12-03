package HW;

public class Item {
	static private int seq=0; 
	String itemCode;
	String name;
	int qty;
	public Item() {}
	public Item(String name, int qty) {
		this.itemCode="88"+String.format("%06d", ++seq);
		this.name=name;
		this.qty=qty;
	}

	public String getItemCode() {
		return itemCode;
	}
	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
}
