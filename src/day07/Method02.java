package day07;

public class Method02 {
	
//	+ - * / % 결과값 리턴
//	/ %는 두번째 값이 0이면 어떻게 할까
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public double div(int num1, int num2) {
		if(num2==0) {
			return -999999;
		}else {
			return num1/(double)num2;
		}
	}
	public int rem(int num1, int num2) {
		if(num2==0) {
			return -999999;
		}else {
			return num1%num2;
		}
	}
	public static void main(String[] args) {
		Method02 m = new Method02();
		int num1 = 100;
		int num2 = 20;
		System.out.println(m.sum(num1,num2));
		System.out.println(m.sub(num1,num2));
		System.out.println(m.mul(num1,num2));
		double div = m.div(num1,num2);
		int rem = m.rem(num1,num2);
		if(div==-999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else System.out.println(div);
		if(rem==-999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else System.out.println(rem);
	}

}
