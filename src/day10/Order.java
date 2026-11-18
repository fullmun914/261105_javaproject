package day10;

import java.util.Arrays;

public class Order {
//	주문
//	상품명, 갯수, 가격(product것), 총 금액
//	주문 추가
	private String name;
	private int price, total, count;
	
	public Order() {}
	public Order(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this.total = price*count;
	}
	public void insertOrder(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this. total = price*count;
	}
//	public void addOrder(Product product) {
//		if(count==this.name.length) {
//			String[] nTmp = new String[this.name.length+3];
//			int[] pTmp = new int[this.price.length+3];
//			System.arraycopy(this.name, 0, nTmp, 0, this.name.length);
//			System.arraycopy(this.price, 0, pTmp, 0, this.price.length);
//			this.name=nTmp;
//			this.price=pTmp;
//		}
//		this.name[count] = product.getName();
//		this.price[count] = product.getPrice();
//		count++;	
//	}
//	public int total() {
//		for(int i=0;i<price.length;i++) {
//			total+=price[i];
//		}
//		return total;
//	}
//	@Override
//	public String toString() {
//		return "Order [name=" + Arrays.toString(name) + ", price=" + Arrays.toString(price) + "]";
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "[" + name + " : " + price + "   " + count + " = " + total + "]";
	}

}
