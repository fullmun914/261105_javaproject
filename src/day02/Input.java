package day02;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		String name = s.next();
		System.out.println("이름 : " + name);

		s.nextLine();
		System.out.println("숫자를 입력하세요(소수점 포함) : ");
		double num = s.nextDouble();
		System.out.println("입력한 숫자는 " + num + "입니다.");

		// 숫자를 하나 입력받아 짝수인지 홀수인지 출력

		System.out.println("숫자를 입력하세요 : ");
		int num2 = s.nextInt();
		if (num2 % 2 == 1) {
			System.out.println("입력받은 값은 홀수입니다.");
		} else {
			System.out.println("입력받은 값은 짝수입니다.");
		}
		
		System.out.println("한글자만 입력 : ");
		char a = s.next().charAt(0);
		System.out.println("입력한 문자의 맨 앞글자는 " + a + "입니다.");		
		s.close();
	}

}
