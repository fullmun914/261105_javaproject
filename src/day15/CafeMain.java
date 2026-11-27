package day15;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
//		메뉴, 가격, 옵션, 옵션가격, 수량
//		------------------------
//		커피 (에스프레소)2000 -> 부모
//		아메리카노 -> 커피 + 물 500
//		라떼 -> 커피 + 우유 1000
//		모카 -> 커피 + 초콜릿 1500

//		주문받아 coffee[]정보 저장-->영수증
//		0 -> 주문완료 영수증 출력
		Scanner s = new Scanner(System.in);
		Espresso coffee[] = new Espresso[4];
		coffee[0] = new Espresso();
		coffee[1] = new Americano();
		coffee[2] = new Latte();
		coffee[3] = new Moca();
		int menu = 0, total = 0;
		char option;
		do {
			System.out.println("---------MENU---------");
			for (int i = 0; i < coffee.length; i++) {
				System.out.println((i+1) + "." + coffee[i].getMenu() + "\t" + coffee[i].getPrice() + "원");
			}
			System.out.println("----------------------");
			System.out.println("무엇을 주문하시겠습니까?(0은 주문종료)");
			menu = s.nextInt();
			if(menu==1) {
				coffee[menu-1].setCount(1);
			}
			if (menu > 1 && menu < 5) {
				do {
					System.out.println("옵션을 추가하시겠습니까? y/n");
					option = s.next().charAt(0);
					if (option == 'y') {
						System.out.println(coffee[menu-1].getOption()+"을(를) 추가하셨습니다.");
						coffee[menu-1].addOption();
						coffee[menu-1].setCount(1);
						
					} else if(option =='n') {
						System.out.println(coffee[menu-1].getOption()+"을(를) 추가하지 않으셨습니다.");
						coffee[menu-1].setCount(1);
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					}
				}while(option!='y'&&option!='n');
			}
		} while (menu != 0);
		System.out.println("-------------------");
		System.out.println("주문을 완료하였습니다.");
		for(int i=0;i<coffee.length;i++) {
			if(coffee[i].getCount()!=0) {
				System.out.println(coffee[i]);
				total += coffee[i].gettPrice();
			}
		}
		System.out.println("-------------------");
		System.out.println("총 가격은 "+total+"원 입니다.");
		

	}

}

class Espresso {
	private String menu, option;
	private int price, opPrice, count, opCount,tPrice;

	public Espresso() {
		this.menu = "에스프레소";
		this.price = 2000;
		this.tPrice = this.price;
	}

	public void addOption() {
//		this.tPrice += this.opPrice;
		this.opCount++;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOpPrice() {
		return opPrice;
	}

	public void setOpPrice(int opPrice) {
		this.opPrice = opPrice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}

	public int getOpCount() {
		return opCount;
	}

	public void setOpCount(int opCount) {
		this.opCount = opCount;
	}

	public int gettPrice() {
		return (tPrice*count)-(opPrice*-opCount);
	}

	public void settPrice(int tPrice) {
		this.tPrice =tPrice;
	}

	@Override
	public String toString() {
		if(opCount!=0) {
			System.out.print(option + "를 "+opCount+"잔에 추가하여 " + (opPrice*opCount) + "원의 추가 금액이 발생한 ");
		}
		return menu + " "+count+"잔의 가격은 총 " + ((tPrice*count)-(opPrice*-opCount)) + "원 입니다.";
	}
}

class Americano extends Espresso {
	public Americano() {
		this.setMenu("아메리카노");
		this.setOption("water");
		this.setOpPrice(500);
		this.setPrice(super.getPrice() + this.getOpPrice());
		this.settPrice(this.getPrice());
	}
}

class Latte extends Espresso {
	public Latte() {
		this.setMenu("라    떼");
		this.setOption("milk");
		this.setOpPrice(1000);
		this.setPrice(super.getPrice() + this.getOpPrice());
		this.settPrice(this.getPrice());
	}
}

class Moca extends Espresso {
	public Moca() {
		this.setMenu("모    카");
		this.setOption("choco");
		this.setOpPrice(1500);
		this.setPrice(super.getPrice() + this.getOpPrice());
		this.settPrice(this.getPrice());
	}
}