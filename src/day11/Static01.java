package day11;

public class Static01 {

	public static void main(String[] args) {
		System.out.println(Method08.fact(5));
		TV t = new TV();
		t.printBrand();
		
		TV.printBrand2();
		t.printBrand2();
	}

}

class TV{
	private boolean power;
	static final String BRAND = "LG";
	
	public void printBrand() {
		System.out.println(BRAND);
		System.out.println(power);
	}
	
	public static void printBrand2() {
		TV t = new TV();
		System.out.println(BRAND);
		System.out.println(t.power);
	}
}