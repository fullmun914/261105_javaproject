package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
//		int i=1;
//		do {
//			System.out.println("실행문 실행");
//			i++;
//		}while(i<=5);
		
//		한글자 입력받아 출력 -> char
//		y 입력시 종료
		Scanner s = new Scanner(System.in);
		char a=' ';
		do {
			System.out.print("y를 입력하면 종료 > ");
			a = s.next().charAt(0);
			System.out.println(a);
		}while(a!='y');
		s.close();
		
	}

}
