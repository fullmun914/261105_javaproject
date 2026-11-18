package day11;

public class Class06 {

	public static void main(String[] args) {
//		객체를 생성할 때 값을 초기화하는 방법
//		기본값, 명시적 촉기값, 초기화 블럭, 생성자
		
//		1. 기본값 : 멤버변수를 선언하면 컴파일러가 기본적으로 주는 값
//				0,null,false
//		2. 명시적 초기값 : 사용자가 직접 초기값 명시
		Student s = new Student("홍길동");
		System.out.println(s);
		
		
	}

}
class Student{
	private final String gigum="부평";
	private String name, birth;
	private int age;
	{
		this.name = "미상";
		this.age = 20;
		this.birth = "없음";
	}
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", birth=" + birth + ", age=" + age + "]";
	}
}
