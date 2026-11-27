package genericsProduct;

import java.util.Scanner;


public class ProductMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ProductController pc = new ProductController();
		int menu = 0;
		do {
			System.out.println("-------------------------SELECT-------------------------");
			System.out.println("1. 메뉴 추가\t2. 메뉴 보기\t3. 제품 주문");
			System.out.println("4. 주문 내역 보기\t5. 종료");
			System.out.print("선택 > ");
			try {
				menu = s.nextInt();
				s.nextLine();

				switch (menu) {
				case 1:
					pc.insertMenu(s);
					break;
				case 2:
					pc.printMenu();
					break;
				case 3:
					pc.addOrder(s);
					break;
				case 4:
					pc.printOrder();
					break;
				case 5:
					System.out.println("종료!!");
					break;
				default:
					System.out.println("잘못된 메뉴입니다!");
					break;
				}
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		} while (menu != 5);

		s.close();
	}

}
