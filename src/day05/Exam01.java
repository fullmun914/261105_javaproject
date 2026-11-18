package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
//		1. 과자 2000원 | 2. 라면 3000원 | 3. 사탕 500원 | 4. 젤리 500원 | 5. 종료
//		** *개를 선택하셨습니다. ****원
//		** *개 ***원 \n ** *개 ***원 \n... 총 금액 ***원 입니다.
//		종료 할 때까지
//		메뉴를 벗어난 값 입력시 다시 입력 유도

		Scanner s = new Scanner(System.in);

		String[] menu = { "과자", "라면", "사탕", "젤리" };
		int[] price = { 2000, 3000, 500, 500 };
		int[] tPrice = new int[menu.length];
		int[] count = new int[menu.length];

		int select = 0, total = 0;
		while (select != 5) {
			System.out.println("--MENU--");
			System.out.println("1. 과자 2000원 | 2. 라면 3000원 | 3. 사탕 500원 | 4. 젤리 500원 | 5. 종료");
			System.out.print("MENU > ");
			select = s.nextInt();
			while (select < 1 || select > 5) {
				System.out.print("존재하지 않는 메뉴입니다. 다시 입력해주세요. > ");
				select = s.nextInt();
			}
			if(select==5) {
				break;
			}
			count[select - 1]++;
			tPrice[select - 1] = count[select - 1] * price[select - 1];
			System.out.println(menu[select - 1] + " " + count[select - 1] + "개를 선택하셨습니다." + tPrice[select - 1] + "원");

		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println("---------TOTAL----------");
		for (int i = 0; i < menu.length; i++) {
			if (count[i] != 0) {
				System.out.println(menu[i] + "\t" + count[i] + " 개\t" + tPrice[i] + "원");
			}
			total += tPrice[i];
		}
		System.out.println("------------------------ \n" + "총 금액 : " + total + "원");
		s.close();
	}

}
