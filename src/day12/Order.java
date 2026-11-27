package day12;

public class Order extends Product{
	private int count, total;
	
	public Order(Product p, int count) {
		super(p.getName(),p.getPrice());
		this.count = count;
		this.total = super.getPrice()*count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return super.getName() +" "+ count +" "+ total;
	}
	
}
