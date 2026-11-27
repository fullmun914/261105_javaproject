package day12;

public class Super01 {

	public static void main(String[] args) {
//		상속 -> 부모의 멤버를 자식에게 물려주는것
//		멤버변수, 멤버 메소드만 상속가능
//		클래스의 확장개념
//		코드의 재사용, 중복제거, 유지보수 용이
//		부모의 메서드와 멤버변수 사용가능
		B b = new B(); // 부모
		A a = new A(); // 자식
		System.out.println(b);
		System.out.println(a);
		a.c = 1;
		a.d = 2;
		a.e = 3;
		System.out.println(a);
		b.c = 10;
		b.d = 20;
		b.e = 30;
//		System.out.println(b);
//		System.out.println(a);
		b.prn();
		System.out.println();
		a.prn();
		a.prnA();
	}

}

class C extends B{
	
}

class A extends B {
	private int n1, n2;

//	부모의 멤버변수를 가져와서 직접 출력
	public void prnA() {
		System.out.println("---------A 객체에서 출력---------");
		super.setA(111);
		super.setB(222);
		super.c=333;
		System.out.println("a -> "+super.getA());
		System.out.println("b -> "+super.getB());
		System.out.println("c -> "+super.c);
	}

//	prn 오버라이딩
//	부모의 메서드를 재정의하여 사용
	@Override
	public void prn() {
		super.prn();
		System.out.print("n1:" + n1 + " ");
		System.out.print("n2:" + n2 + " ");
		System.out.println();
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "A [n1=" + n1 + ", n2=" + n2 + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}

}

class B {
	private int a, b;
//	-> 나만 사용가능
	protected int c, d;
//	-> 자식도 사용가능
	public int e;

	public void prn() {
		System.out.print("a:" + a + " ");
		System.out.print("b:" + b + " ");
		System.out.print("c:" + c + " ");
		System.out.print("d:" + d + " ");
		System.out.print("e:" + e + " ");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}

}
