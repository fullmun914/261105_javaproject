package day12;

public class Abstract01 {

	public static void main(String[] args) {
//		추상클래스 -> 미완성클래스
//		추상 키워드 : abstract
//		추상 클래스는 추상 매서드를 포함하는 클래스
		Dog2 d= new Dog2("뽀삐","강아지");
		d.printInfo();
		d.howl();
		d.eating("고기");
	}

}
class Dog2 extends Animal2{
	private String eat;
	public Dog2(String name, String category) {
		super.name = name;
		super.category = category;
	}
	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 울음소리 멍멍!!");
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		this.eat = eat;
		System.out.println(name+"은 "+eat+"을(를) 좋아해요!");
	}
	
}

abstract class Animal2{
	protected String name;
	protected String category;
	public void printInfo() {
		System.out.println(name+"("+category+")");
	}
	abstract void howl();
	abstract void eating(String eat);
}