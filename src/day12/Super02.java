package day12;

public class Super02 {

	public static void main(String[] args) {
		Dog d = new Dog("뽀삐","강아지");
		Cat c = new Cat("깜고","고양이");
		Tiger t = new Tiger("태극","호랑이");
		Elephant e = new Elephant("도토","코끼리");
		d.printInfo();
		d.howl();
		c.printInfo();
		c.howl();
		t.printInfo();
		t.howl();
		e.printInfo();
		e.howl();
	}

}

//자식클래스
class Elephant extends Animal{
	public Elephant() {}
	public Elephant(String name, String category) {
		super(name, category);
	}
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("뿌우!!");
	}	
}
class Tiger extends Animal{
	public Tiger() {}
	public Tiger(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥!!");
	}
}
class Cat extends Animal{
	public Cat() {}
	public Cat(String name, String category) {
		super(name, category);
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹!!");
	}
}

class Dog extends Animal{
	public Dog() {}
	public Dog(String name, String category) {
		super(name, category);
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍!!");
	}
}

//부모클래스
class Animal{
	private String name, category;
	
//	생성자
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
//	출력메서드
	public void printInfo() {
		System.out.println("이름 : "+this.name+"("+this.category+")");
	}
//	울음소리 출력 메서드 -> 자식이 구현하도록 남겨둠
	public void howl() {
		System.out.print(name+"의 울음소리 : ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", category=" + category + "]";
	}
}