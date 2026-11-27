package day18;

public class Generic02 {
	public static void main(String[] args) {
		GenericsPrint<Powder> powderPrint = new GenericsPrint<>();
		powderPrint.setMaterial(new Powder());
		System.out.println(powderPrint);
		
		GenericsPrint<Plastic> plasticPrint = new GenericsPrint<>();
		plasticPrint.setMaterial(new Plastic());
		System.out.println(plasticPrint);
		
		GenericsPrint print = new GenericsPrint();
		print.setMaterial("아무거나");
		System.out.println(print);
	}

}

class GenericsPrint<T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "GenericPrint [material=" + material + "]";
	}
	
}
class Powder{
	public String toString() {
		return "재료는 파우더입니다.";
	}
}
class Plastic{
	public String toString() {
		return "재료는 플라스틱입니다.";
	}
}