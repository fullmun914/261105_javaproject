package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
//		product -> 상품명, 상품가격
//		order -> 상품명, 갯수, 가격, 총금액
//		product[] menu -> 상품리스트 / 임의등록
//		주문 -> order객체 발생 -> order 배열

//		1.전체 메뉴리스트
//		2.주문 = 제품명, 수량(입력)
//		3.입력받은걸로 order객체 생성 및 추가
//		4. order넘치면 배열증가
//		5. 영수증 출력 (전체 주문내역, 총 지불금액)

// 		1. 판매 상품 등록(product)
		

//		김밥 3000
//		라면 5000
//		사이다 500
		Product[] menu = new Product[5];
		Order[] order = new Order[5];
		Scanner s = new Scanner(System.in);
		int cnt=0;
//		int count[] = new int[5];
		menu[0] = new Product("김밥", 3000);
		menu[1] = new Product("라면", 5000);
		menu[2] = new Product("사이다", 500);
		menu[3] = new Product("돈까스", 8000);
		menu[4] = new Product("떡볶이", 7000);
		
//		메뉴 등록 다른방법
//		Product p = new Product();
//		p.insertProduct("과자", 1000);
//		menu[4]=p;

		System.out.println("--------MENU--------");
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i].toString());
		}

		System.out.println("--------------------");

		
		char ok ='y';
		while(ok!='n') {
			System.out.println("주문하시겠습니까? y/n");
			ok = s.next().charAt(0);
			
			if(ok=='n') {
				System.out.println("주문을 종료합니다.");
				break;
			}
			if(ok=='y') {
				for(int i=0;i<menu.length;i++) {
					System.out.println((i+1)+"."+menu[i]);
				}
				System.out.println("menu > ");
				int menuNo = s.nextInt();
				if(menuNo<1||menuNo>5) {
					System.out.println("없는 주문번호입니다.");
					continue;
				}
				System.out.println("수량 > ");
				int count = s.nextInt();
				
				Order o = new Order(menu[menuNo-1],count);
				if(order.length==cnt) {
					Order tmp[] = new Order[order.length+3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order = tmp;
				}
				order[cnt]=o;
				cnt++;
			}
			else {
				System.out.println("y / n중에 선택해주세요.");
			}
		}
		System.out.println("------주문내역 출력------");
		int sum = 0;
		for(int i=0;i<cnt;i++) {
			System.out.println(order[i]);
			sum+=order[i].getTotal();
		}
		if(cnt==0) {
			System.out.println("주문 내역이 없습니다.");
		}
		System.out.println("--------------------");
		System.out.println("총 주문금액 : "+sum);
//		a: for (int i = 0; select!=0; i++) {
//			System.out.println("무엇을 주문하시겠습니까?");
//			System.out.println("1. 김밥\t2. 라면\t3. 사이다\t4. 돈까스\t5. 떡볶이\t0. 종료");
//			select = s.nextInt();
//			switch (select) {
//			case 1:
//				order[i]=new Order(menu[0],1);
//				break;
//			case 2:
//				order[i]=new Order(menu[1],1);
//				break;
//			case 3:
//				order[i]=new Order(menu[2],1);
//				break;
//			case 4:
//				order[i]=new Order(menu[3],1);
//				break;
//			case 5:
//				order[i]=new Order(menu[4],1);
//				break;
//			case 0:
//				System.out.println("프로그램을 종료합니다.");
//				break a;
//			default:
//				System.out.println("존재하지 않는 메뉴입니다. 다시 선택해주세요");
//				break;
//
//			}
//
//		}
//		System.out.println("--------BILL--------");
////		for (int i = 0; i < menu.length; i++) {
////			for(int j=0;j<menu.length;j++) {
////				if(order[i].getPrice()==menu[j].getPrice()) {
////					count[j]++;
////				}
////			}
////		}
////		for(int i=0; i<menu.length;i++) {
////			if(count[i]!=0) {
////				System.out.println(menu[i].getName()+"\t"+count[i]+"\t"+(count[i]*menu[i].getPrice()));
////			}
////		}
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println(order.toString());
//		}
//		System.out.println("--------------------");
//		System.out.println("총 금액 : "+order.total()+"원");
//
//	}
	}
}
