package day07;

public class Class01 {
//	두 정수를 매개변수로 받아 그 두 수의 합을 리턴해주는 메서드
	public int sum(int a, int b){
		return a+b;
	}
//	두 정수를 매개변수로 받아 그 두 수의 차를 리턴해주는 매서드
	
	public int sub(int a, int b) {
		return a-b;
	}
//	메서드 호출
	public static void main(String arg[]) {
		int num1=1,num2=2;
		Class01 c = new Class01();
		int sum = c.sum(num1, num2);
		int sub = c.sub(num1, num2);
		System.out.println(sum);
		System.out.println(sub);
		
	}
}
