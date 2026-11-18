package day07;

public class Method01 {
//	두 정수가 주어지면 두 정수의 합 리턴
	public int sum(int a, int b) {
		return a+b;
	}
//	두 정수가 주어지면 두 정수의 합 출력
	public void sum2(int a, int b) {
		System.out.println(sum(a,b));
	}
	
//	매개변수가 없는, return은 있는 클래스
	public int sum3() {
		int a = 5,b=3;
		return a+b; 
	}
	
//	매개변수, 리턴 모두 없는 클래스
	public void sum4() {
		int a=10, b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		int num1=100, num2=80;
		Method01 c = new Method01();
		int sum = c.sum(num1, num2);
		System.out.println(sum);
		c.sum2(num1, num2);
		System.out.println(c.sum3());
		c.sum4();
	}

}
