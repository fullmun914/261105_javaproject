package day11;

public class Card {
//	모양 앞 숫자 뒤
//	하트 다이으 클로버 스페이스♥ ◆ ♣ ♠
//	무모양 -> 하트 / 무숫자 -> 1
//	1 A 11 J 12 Q `13 K 2~10
//	멤버변수 int num String shape
//	getter setter toString(그냥)
//	출력메서드(숫자가 입력되면 J Q K A에 해당되면 변경)
	private String shape;
	private int num;

	public Card() {
		this.num = 1;
		this.shape = "♥";
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		switch (shape) {
		case "◆","♣","♠": this.shape=shape; break;
		default: this.shape="♥"; break;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>=2&&num<=13) {
			this.num = num;
		}else
			this.num=1;
	}
	public void prn() {
		System.out.print(this.shape);
		switch(this.num) {
		case 1 : System.out.print("A");
		break;
		case 11 : System.out.print("J");
		break;
		case 12 : System.out.print("Q");
		break;
		case 13 : System.out.print("K");
		break;
		default : 
			System.out.print(this.num);;
		break;
		}
	}

	@Override
	public String toString() {
		return "[" + shape +num + "]";
	}

}
