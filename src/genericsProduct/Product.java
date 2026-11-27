package genericsProduct;

import java.util.Objects;

public class Product<K,V extends Number> {
	
	private K menu;
	private V price;
	
	public Product() {}
	public Product(K menu) {
		this.menu = menu;
	}
	public Product(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(menu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product<?, ?> other = (Product<?, ?>) obj;
		return Objects.equals(menu, other.menu);
	}
	@Override
	public String toString() {
		return menu + "   \t" + price +"";
	}
}
