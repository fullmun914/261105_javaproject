package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
//		1. 과자 2000원 | 2. 라면 3000원 | 3. 사탕 500원 | 4. 젤리 500원 | 5. 종료
//		** *개를 선택하셨습니다. ****원
//		** *개 ***원 \n ** *개 ***원 \n... 총 금액 ***원 입니다.
//		종료 할 때까지
//		메뉴를 벗어난 값 입력시 다시 입력 유도
		
		Scanner s = new Scanner(System.in);
		
		int[] order = new int[4];
		int[] pOrder = new int[4];
		String[] goods = {"과자","라면","사탕","젤리"};
		int menu=0, total=0;
//		pSnack=0, pRamen=0, pCandy=0, pJelly=0, total=0;
		while(menu!=5) {
			System.out.println("--MENU--");
			System.out.println("1. 과자 2000원 | 2. 라면 3000원 | 3. 사탕 500원 | 4. 젤리 500원 | 5. 종료");
			System.out.print("MENU > ");
			menu = s.nextInt();
			while(menu<1||menu>5) {
				System.out.print("존재하지 않는 메뉴입니다. 다시 입력해주세요. > ");
				menu = s.nextInt();
			}
//			if(menu==5) {
//				break;
//			}
			switch(menu) {
			case 1:
				order[0]++;
				pOrder[0] = order[0]*2000;
				System.out.println(goods[0]+" "+order[0]+"개를 선택하셨습니다."+pOrder[0]+"원");
				break;
			case 2:
				order[1]++;
				pOrder[1] = order[1]*3000;
				System.out.println(goods[1]+" "+order[1]+"개를 선택하셨습니다."+pOrder[1]+"원");
				break;
			case 3:
				order[2]++;
				pOrder[2] = order[2]*500;
				System.out.println(goods[2]+" "+order[2]+"개를 선택하셨습니다."+pOrder[2]+"원");
				break;
			case 4:
				order[3]++;
				pOrder[3] = order[3]*500;
				System.out.println(goods[3]+" "+order[3]+"개를 선택하셨습니다."+pOrder[3]+"원");
				break;
			case 5:
				break;
			default:
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println("---------TOTAL----------");
		for(int i = 0; i<pOrder.length; i++) {
			if(order[i]!=0) {
				System.out.println(goods[i]+"\t"+order[i]+" 개\t"+pOrder[i]+"원");
			}
			total += pOrder[i];
		}
		System.out.println("------------------------ \n"+"총 금액 : "+total+"원");
//		System.out.println("과자\t"+order[0]+" 개\t"+pSnack+"원 \n"+
//				"라면\t"+order[1]+" 개\t"+pRamen+"원 \n"+
//				"사탕\t"+order[2]+" 개\t"+pCandy+"원 \n"+
//				"젤리\t"+order[3]+" 개\t"+pJelly+"원 \n"+
//				"------------------------ \n"+"총 금액 : "+total+"원");
		s.close();
	}

}
