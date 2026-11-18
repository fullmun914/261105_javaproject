package day11;

public class CardMain {

	public static void main(String[] args) {
		CardPack cPack = new CardPack();
		Card player[] = new Card[4];

//		c.prn();
//		c.setNum(210);
//		c.setShape("+");
//		c.prn();
//		c.setNum(3);
//		c.setShape("◆");
//		c.prn();
//		c.setNum(2105);
//		c.setShape("♣");
//		c.prn();
//		c.setNum(12);
//		c.setShape("-");
//		c.prn();

//		for (int i = 0; i < 4; i++) {
//			for (int j = 1; j < 14; j++) {
//				c.setShape(shape[i]);
//				c.setNum(j);
//				c.prn();
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
		
		System.out.println("딜러가 카드를 섞고 있습니다.");
		cPack.mix();
		System.out.println("딜러가 카드를 나누고 있습니다");
		for(int i=0;i<player.length;i++) {
			System.out.println("Player "+(i+1)+" 카드 pick");
			player[i]=cPack.pick();
		}
		for(int i=0;i<player.length;i++) {
			System.out.print("Player "+(i+1)+" 카드 Open > ");
			player[i].prn();
			System.out.println();
		}
		
		System.out.println("카드를 회수합니다.");
	}

}
