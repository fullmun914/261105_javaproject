package genericsProduct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductController {
//	메뉴 저장 리스트
	private List<Product<String, Integer>> menu = new ArrayList<>();
//	주문 저장 리스트
	private List<Order<String, Integer>> order = new ArrayList<>();

	public ProductController() {
		menu.add(new Product<>("김밥", 3500));
		menu.add(new Product<>("떡볶이", 3000));
		menu.add(new Product<>("튀김", 1500));
		menu.add(new Product<>("제육덮밥", 8000));
		menu.add(new Product<>("라면", 6000));
	}

//	메뉴 추가 -> 같은 메뉴 추가 불가능
	public void insertMenu(Scanner s) {
		System.out.print("추가할 메뉴 이름 : ");
		String menu = s.nextLine();
		if (this.menu.contains(new Product<>(menu))) {
			System.out.println("이미 등록된 메뉴입니다.");
			return;
		}
		System.out.print(menu + "의 가격 : ");
		int price = s.nextInt();
		this.menu.add(new Product<>(menu, price));
	}

//	메뉴 출력
	public void printMenu() {
		int i=0;
		System.out.println("----------------MENU----------------");
		System.out.println("MENU    \tPRICE");
		System.out.println("------------------------------------");
		Iterator<Product<String, Integer>> it = menu.iterator();
		if (!it.hasNext()) {
			System.out.println("메뉴가 없습니다.");
		}
		while (it.hasNext()) {
			i++;
			Product<String, Integer> tmp = it.next();
			System.out.println(i+". "+tmp);
		}
		System.out.println("------------------------------------");
	}

//	주문 -> 같은 메뉴 한번 더 주문하면 count를 올림
	public void addOrder(Scanner s) {
		this.printMenu();
		System.out.print("주문할 메뉴 : ");
		int orderNum = s.nextInt()-1;
		String order = this.menu.get(orderNum).getMenu();
		System.out.print("주문할 수량 : ");
		int cnt = s.nextInt();
		if (this.order.contains(new Order<>(order))) {
			for (Order<String, Integer> i : this.order) {
				if (i.getMenu().equals(order)) {
					this.order.get(this.order.indexOf(i)).setCount(cnt);
				}
			}
		} else {
			for (Product<String, Integer> i : menu) {
				if (i.getMenu().equals(order)) {
					this.order.add(new Order<>(i, cnt));
				}
			}
		}
	}

//	주문내역 출력
	public void printOrder() {
		int sum=0;
		System.out.println("---------------ORDER----------------");
		System.out.println("MENU\tPRICE\tCOUNT\tTOTAL");
		System.out.println("------------------------------------");
		Iterator<Order<String, Integer>> it = order.iterator();
		if (!it.hasNext()) {
			System.out.println("주문내용이 없습니다.");
		}
		while (it.hasNext()) {
			Order<String, Integer> tmp = it.next();
			System.out.println(tmp);
			sum+=tmp.getTotal();
		}
		System.out.println("------------------------------------");
		System.out.println("총 가격 : "+sum+"원");
	}
	
}
