package day09;

public class Class02 {

	public static void main(String[] arg) {
		Test t = new Test();
		t.print();

		int x = t.getX();
		int y = t.getY();
		t.setx(3);
		t.setY(5);
		t.print();

	}
}

class Test {
//	멤버변수
//	초기값을 설정하지 않아도 컴파일러에 의해 자동 설정됨
//	정수, 숫자 = 0 / 문자, 객체 = null
//	생성자가 기본으로 초기값 생성
//	클래스 내부에 모든 메서드가 공유해서 사용
//	멤버변수는 매개변수로 전달할 필요 X
//	메서드 내부에서 멤버변수를 사용할 경우 다른 매개변수나 일반변수와 차별성을 둠(this.멤버변수)
	private int x;
	private int y;

//	생성자

//	메서드
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

	public void print(int x, int y) {
		this.x = x;
		this.y = y;
		print();
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.x;
	}

	public void setY(int x) {
		this.x = x;
	}

	public void setx(int y) {
		this.y = y;
	}
}
