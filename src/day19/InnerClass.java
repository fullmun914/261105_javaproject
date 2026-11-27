package day19;

public class InnerClass {

	public static void main(String[] args) {
		Test test = new Test();
		test.usingClass();
		
		System.out.println("---------------");
//		내부 클래스 객체 가져와서 직접 내부 메서드 출력
		test.getInClass().innerTest();
		
		System.out.println("---------------");		
//		innerClass에 직접 접근
		Test.TestInner inClass = test.new TestInner();
		inClass.innerTest();
	}

}

class Test{
	private int num = 10; 
	private static int sNum = 20;
	private TestInner inClass;
	public Test() {
		inClass = new TestInner();
	}
	class TestInner {
		int innerNum = 100;
		static int innerSNum = 50;
		
		void innerTest() {
			System.out.println("TestClass num : "+num);
			System.out.println("TestClass sNum : "+sNum);
			System.out.println("TestInnerClass innerNum : "+innerNum);
			System.out.println("TestInnerClass innerSNum : "+innerSNum);
			
			
		}
	}
	
//	inerClass 호출 메서드
	public void usingClass() {
//		내부클래스 객체 통해 호출
		System.out.println("TestClass에서 호출됨");
		inClass.innerTest();
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public TestInner getInClass() {
		return inClass;
	}
	public void setInClass(TestInner inClass) {
		this.inClass = inClass;
	}
}