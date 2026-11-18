package day08;

import java.util.Scanner;

public class Method03 {
//	구구단 출력 메소드
//	정수 하나를 입력받아 해당 정수의 구구단을 출력
	public void gugudan(int dan){
		int res = 0;
		for(int i=1;i<=9;i++) {
			res = dan*i;
			System.out.println(dan+"X"+i+"="+res);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 구구단의 단 : ");
		int dan = s.nextInt();
		Method03 m = new Method03();
		m.gugudan(dan);
		
	}

}
