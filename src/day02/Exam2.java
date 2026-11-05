package day02;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
//		정수 두 개, 연산자 하나 입력받기 -> 두 정수의 연산 결과값 출력(정수 랜덤생성 가능)
//		입력할 수 있는 연산자 -> + - * / % -> 이외의 값은 잘못된 문자열을 입력했습니다 출력
//		연산자 입력은 String, Char 모두 가능
		Scanner s = new Scanner(System.in);
//		num 입력받는 코드
		System.out.println("정수를 두개 입력하세요 : ");
		int num1 = s.nextInt(), num2 = s.nextInt();
//		int num1 = (int)(Math.random()*100+1), num2 = (int)(Math.random()*100+1);
		System.out.println("연산자를 입력하세요 : ");
		String op = s.next();
		
		if((op.equals("/")||op.equals("%"))&&num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}

//		switch
		switch (op) {	
		case "+":
			System.out.println(num1 + "과" + num2 + "를 더한 값은 " + (num1 + num2) + "입니다.");
			break;
		case "-":
			System.out.println(num1 + "과" + num2 + "를 뺀 값은 " + (num1 - num2) + "입니다.");
			break;
		case "/":
			System.out.println(num1 + "과" + num2 + "를 나눈 값의 몫은 " + (num1 / num2) + "입니다.");
			break;
		case "*":
			System.out.println(num1 + "과" + num2 + "를 곱한 값은 " + (num1 * num2) + "입니다.");
			break;
		case "%":
			System.out.println(num1 + "과" + num2 + "를 나눈 값의 나머지는 " + (num1 % num2) + "입니다.");
			break;
		default:
			System.out.println("계산이 불가능한 입력값입니다.");
		}

//		if
		if (op.equals("+")) {
			System.out.println(num1 + "과" + num2 + "를 더한 값은 " + (num1 + num2) + "입니다.");
		} else if (op.equals("-")) {
			System.out.println(num1 + "과" + num2 + "를 뺀 값은 " + (num1 - num2) + "입니다.");
		} else if (op.equals("/")) {
			System.out.println(num1 + "과" + num2 + "를 나눈 값의 몫은 " + (num1 / num2) + "입니다.");
		} else if (op.equals("*")) {
			System.out.println(num1 + "과" + num2 + "를 곱한 값은 " + (num1 * num2) + "입니다.");
		} else if (op.equals("%")) {
			System.out.println(num1 + "과" + num2 + "를 나눈 값의 나머지는 " + (num1 % num2) + "입니다.");
		} else
			System.out.println("계산이 불가능한 입력값입니다.");
		s.close();
	}

}
