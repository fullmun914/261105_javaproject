package wordPackage;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		WordController wc = new WordController();
		int op = 0;
		do {
			try {
				System.out.println("-------------------MENU-------------------");
				System.out.println("1. 단어 등록\t2. 단어 검색\t3. 단어 수정");
				System.out.println("4. 모든 단어 보기\t5. 단어 삭제\t6. 종료");
				System.out.print("메뉴 선택 > ");
				op = s.nextInt();
				s.nextLine();
				while (!(op > 0 && op < 7)) {
					System.out.println("존재하지 않는 메뉴입니다.");
					op = s.nextInt();
					s.nextLine();
				}
				switch (op) {
				case 1:
					wc.insWord(s);
					break;
				case 2:
					wc.srchWord(s);
					break;
				case 3:
					wc.revWord(s);
					break;
				case 4:
					wc.prnWord("VOCA");
					break;
				case 5:
					wc.remWord(s);
					break;
				default:
					System.out.println("VOCA 종료");
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주세요.");
				op=s.nextInt();
			}
		} while (op != 6);
		s.close();
	}

}
