package day13;

import java.text.DecimalFormat;

public class CustomerMain {

	public static void main(String[] args) {
//		백화점의 고객 등급 나누기
//		일반고객(Silver) -> 적립 1%
//		Gold -> 할인 5%, 적립 3%
//		VIP -> 할인 10%, 적립 5%, + [agent num, agent name]
//		Customer ->부모클래스 / id name tier point 적립비율

//		포인트 적립, 계산 메서드 -> 구매금액 기준
//		할인 여부 체크 후 구매 금액 리턴

//		출력메서드
//		__ 고객님은 __ 등급이며 현재 포인트는 ___ 입니다
//		vip + 전담 상담사는 __이고 번호는 ___입니다
		Customer c = new Customer("김우빈");
		Gold g = new Gold("현빈");
		VIP v = new VIP("이상이");
		c.pay(354000);
		System.out.println(c);
		g.pay(480000);
		System.out.println(g);
		g.pay(256000);
		System.out.println(g);
		v.agent("한효주", "010-5035-5462");
		v.pay(840000);
		System.out.println(v);

		System.out.println("--------------------------");
		Customer[] customer = new Customer[10];
		customer[0] = new Customer("아람");
		customer[1] = new Gold("코난");
		customer[2] = new Customer("남도일");
		customer[3] = new Customer("하인성");
		customer[4] = new VIP("고희도", "베르무트", "010-6584-8125");
		customer[5] = new Customer("유미란");
		customer[6] = new VIP("유명한", "괴도키드", "010-3218-4351");
		customer[7] = new Customer("뭉치");
		customer[8] = new Customer("세모");
		customer[9] = new VIP("장미", "베르무트", "010-6584-8125");

		System.out.println("---지불 금액과 포인트 금액 계산---");
		int price = 100000;
		for (int i = 0; i < customer.length; i++) {
			customer[i].pay(price);
			System.out.println(customer[i]);
		}
//		다운캐스팅
//		상담자 베르무트 -> 괴도키드
		for (int i = 0; i < customer.length; i++) {
			if (customer[i] instanceof VIP) {
				VIP vip = (VIP) customer[i];
				if (vip.getAgentName().equals("베르무트")) {
					vip.setAgentName("괴도키드");
					vip.setAgentNum("010-3218-4351");
				}
			}
		}
		System.out.println("------------------");
		System.out.println("-----VIP LIST-----");

		for (int i = 0; i < customer.length; i++) {
			if (customer[i] instanceof VIP) {
				System.out.println(customer[i]);
			}
		}
		VIP upVIP = new VIP();
		Gold upGold = new Gold();
		System.out.println("------등급 변화------");
		customer[0].pay(500000);
		System.out.println(customer[0]);
		customer[0].pay(500000);
		System.out.println(customer[0]);
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getcAmount() > 10000000 && !(customer[i].getTier().equals("VIP"))) {
				System.out.println(customer[i].getName() + "님이 VIP등급이 되셨습니다.");
				upVIP = new VIP(customer[i].getName());
				upVIP.setcAmount(customer[i].getcAmount());
				upVIP.setId(customer[i].getId());
				upVIP.setName(customer[i].getName());
				upVIP.setPoint(customer[i].getPoint());

			} else if (customer[i].getcAmount() > 1000000 && !(customer[i].getTier().equals("Gold"))) {
				System.out.println(customer[i].getName() + "님이 GOLD등급이 되셨습니다.");
				upGold = new Gold(customer[i].getName());
				upGold.setcAmount(customer[i].getcAmount());
				upGold.setId(customer[i].getId());
				upGold.setName(customer[i].getName());
				upGold.setPoint(customer[i].getPoint());
				upGold.pay(215000);
			}
		}
		System.out.println(upGold);
	}

}

class Customer {
	static int index;
	private int id, point, price, cAmount;
	private double rate, discount;
	private String name, tier;

	public Customer() {

	}

	public Customer(String name) {
		this.id = index + 1;
		this.name = name;
		this.tier = "Silver";
		this.rate = 0.01;
		this.discount = 1;
		this.point = (int) (price * rate);
		index++;
		System.out.println(name + "님의 등급이 결정되었습니다.");
	}

	public void pay(int price) {
		this.cAmount += (int) (price * discount);
		this.price = price;
		this.point += (int) ((price * discount) * rate);
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getcAmount() {
		return cAmount;
	}

	public void setcAmount(int cAmount) {
		this.cAmount = cAmount;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		String tPrice = df.format((int) (price * discount));
		String nPoint = df.format((int) ((price * discount) * rate));
		String tPoint = df.format(point);
		String nPrice = df.format(price);
		return "(" + id + ") " + name + " 고객님은 " + tier + "등급이며, 원가 " + nPrice + "에서 "
				+ (int) Math.round((1 - discount) * 100) + "% 할인받아 " + tPrice + "원을 결제하셔서 " + nPoint
				+ "P가 적립 되었고, 현재 포인트는 " + tPoint + "P 입니다.";
	}
}

class Gold extends Customer {
	public Gold() {}
	public Gold(String name) {
		super(name);
		super.setTier("Gold");
		super.setDiscount(0.95);
		super.setRate(0.03);
	}

	public void pay(int price) {
		super.pay(price);
	}
}

class VIP extends Customer {
	private String agent[] = new String[2];
	public VIP() {}

	public VIP(String name) {
		super(name);
		super.setTier("VIP");
		super.setDiscount(0.90);
		super.setRate(0.05);
	}

	public VIP(String name, String agentName, String agentNum) {
		this(name);
		agent[0] = agentName;
		agent[1] = agentNum;
	}

	public String[] agent(String name, String num) {
		agent[0] = name;
		agent[1] = num;
		return agent;
	}

	public void pay(int price) {
		super.pay(price);
	}

	public String getAgentName() {
		return agent[0];
	}

	public void setAgentName(String agentName) {
		this.agent[0] = agentName;
	}

	public String getAgentNum() {
		return agent[1];
	}

	public void setAgentNum(String agentNum) {
		this.agent[1] = agentNum;
	}

	@Override
	public String toString() {

		return super.toString() + "\n전담 상담사 이름은 " + agent[0] + "이고, 번호는 " + agent[1] + "이다.";
	}

}