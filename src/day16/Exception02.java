package day16;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		
		
		int arr[] =  new int[5];
//		int arr2 = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력 >  ");
		try {
			int num = scan.nextInt();
		} catch(Exception e) {
			System.out.println("입력값이 잘못되었습니다.");
		}
	}

}
