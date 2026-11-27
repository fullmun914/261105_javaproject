package day18;

import studentManager.Student;

public class Generics01 {

	public static void main(String[] args) {
		Test t = new Test();
		t.setItem(123);
		System.out.println(t.getItem());
		int sum = (int)t.getItem()+100;
		System.out.println(sum);
		
		Test<String> t1 = new Test<String>();
		t1.setItem("123");
		System.out.println(t1.getItem().equals("123"));
		
		Test<Student> t2 = new Test<>();
		t2.setItem(new Student("홍길동"));
		t2.getItem().printStudent();
		}

}
class Test<T>{
	private T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
