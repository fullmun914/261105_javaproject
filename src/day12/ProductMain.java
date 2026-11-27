package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product[] menu = new Product[5];
		Order[] order = new Order[5];
		int ord = 0;
		Scanner s = new Scanner(System.in);
		menu[0] = new Product("김밥", 3000);
		menu[1] = new Product("라면", 5000);
		menu[2] = new Product("사이다", 500);
		menu[3] = new Product("돈까스", 8000);
		menu[4] = new Product("떡볶이", 7000);

		System.out.println("주문하시겠습니까? y/n");
		char select = s.next().charAt(0);

		while (select == 'y') {
			System.out.println("-----MENU-----");
			for (int i = 0; i < menu.length; i++) {
				System.out.println((i + 1) + ". " + menu[i]);
			}
			System.out.println("--------------");
			System.out.println("무엇을 주문하시겠습니까?(번호 외 주문은 종료)");
			int pick = s.nextInt();
			if (pick < 1 || pick > 5) {
				break;
			}
			System.out.println("몇 개를 주문하시겠습니까?");
			int count = s.nextInt();
			if(ord==order.length) {
				Order arr[] = new Order[order.length+3];
				System.arraycopy(order, 0, arr, 0, order.length);
				order=arr;
			}
			order[ord++]=new Order(menu[pick-1],count);
		}
		System.out.println("주문을 종료합니다");
		int sum = 0;
		System.out.println("--------List--------");
		for(int i=0; i<ord;i++) {
			System.out.println(order[i]);
			sum+=order[i].getTotal();
		}
		System.out.println("--------------------");
		System.out.println("총 금액 : "+sum);
		s.close();
	}

}
