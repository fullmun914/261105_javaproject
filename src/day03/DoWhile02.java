package day03;

import java.util.Scanner;

public class DoWhile02 {
	public static void main(String[] args) {
//		메뉴 구성
//		1. 저장하기 2. 새로만들기 3. 종료하기
		Scanner s = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("1. 저장하기 | 2. 새로만들기 | 3. 종료하기");
			System.out.print("menu : ");
			
			menu = s.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("저장했습니다");
					break;
				case 2:
					System.out.println("새로 만들었습니다");
					break;
				case 3:
					System.out.println("종료합니다");
					break;
				default :
					System.out.println("잘못된 메뉴입니다");
			}
		}while(menu!=3);
		System.out.println("프로그램을 종료합니다.");
		s.close();
	}

}
