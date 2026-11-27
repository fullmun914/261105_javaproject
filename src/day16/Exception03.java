package day16;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
//		두 정수와 연산자를 입력받아 + - * / %의 연산결과를 리턴하는 메서드
//		/ % 연산자일 경우 피연산자가 0이면 Exception 오류처리
		Exception03 e = new Exception03();
//		e.sum(12, 0);
//		e.sub(12, 0);
//		e.mul(12, 0);
//		e.div(12, 0);
//		e.rem(12, 0);
//		
//		try {
//			e.div(12, 0);
//			e.rem(12, 0);
//		}catch(Exception err) {
//			System.err.println("오류 이유 : "+err.getMessage()+"0으로 나눌 수 없습니다");
//		}
		Scanner s = new Scanner(System.in);
//		System.out.println("두 정수와 연산자를 입력하세요");
//		int a = s.nextInt();
//		char n = s.next().charAt(0);
//		int b = s.nextInt();
//		System.out.println(e.cal(a,b,n));
		try {

			double result = e.cal2(3, 0, '/');
			System.out.println(result);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		System.out.println(e.cal2(3, 0, '-'));
	}

	public double cal2(int a, int b, char n) {
		double result = 0;
		if (n == '/' || n == '%' && b == 0) {
			throw new RuntimeException("num2는 0이될 수 없습니다");
		}
		switch (n) {
		case '+':
			return result = a + b;
		case '-':
			return result = a - b;
		case '*':
			return result = a * b;
		case '/':
			return result = a / b;
		case '%':
			return result = a % b;
		default:
			throw new RuntimeException(n + "는 산술연산자가 아닙니다.");
		}
	}

	public double cal(int a, int b, char n) {
		switch (n) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			try {
				return a / b;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.err.println("0으로 나눌 수 없습니다.");
				break;
			}
		case '%':
			try {
				return a % b;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.err.println("0으로 나눌 수 없습니다.");
				break;
			}
		default:
			break;
		}
		return -9999999;
	}

//	public void sum(int a, int b) {
//		System.out.println(a+b);
//	}
//	public void sub(int a, int b) {
//		System.out.println(a-b);
//	}
//	public void mul(int a, int b) {
//		System.out.println(a*b);
//	}
//	public void div(int a, int b) {
//		try {
//			System.out.println(a/b);
//		}catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//	}
//	public void rem(int a, int b) {
//		try {
//			System.out.println(a%b);
//		}catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//	}

}
