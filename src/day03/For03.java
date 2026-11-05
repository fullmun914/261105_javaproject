package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
//		구구단 2단 출력
//		for(int i=1; i<10; i++) {
//			System.out.println("2X"+i+"="+2*i);
//		}
		
//		입력받아 구구단 출력
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 > ");
		int n = s.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(n +"X"+i+"="+n*i);
		}
		s.close();
	}

}
