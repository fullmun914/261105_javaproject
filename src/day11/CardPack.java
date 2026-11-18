package day11;

public class CardPack {
//	총 52장의 카드 객체를 배열로 저장하는 팩 하나 만들기
//	멤버변수 -> 52장의 카객체를 담을 수 있는 배열, 번지
//	카드를 섞는 기능
//	플레이어에게 한장씩 나눠주는 기능
//	나눠준 카드 회수
	
	private Card pack[]=new Card[52];
	private int index;
	public CardPack() {
		String shape[] = {"♥","◆","♣","♠"};
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				Card c = new Card();
				c.setShape(shape[i]);
				c.setNum(j);
				pack[(i*13)+(j-1)]=c;
			}
		}
	}
	public void mix() {
		for(int i=0; i<pack.length;i++) {
			int rand = (int)(Math.random()*52);
			Card tmp=pack[rand];
			pack[rand]=pack[i];
			pack[i]=tmp;
		}
	}
	public Card pick() {
		return pack[index++];
	}
	public Card[] getPack() {
		return pack;
	}
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
}
