package day17;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
//		맵을 활용한 단어장 프로그램 작성
//		단어 등록 메서드
//		검색
//		수정
//		전체 출력
//		삭제
//		종료
//		try catch 사용
		Scanner s = new Scanner(System.in);
		Voca voca = new Voca();
		voca.ins("happy", "행복한");
		voca.ins("phone", "휴대폰");
		voca.ins("cup", "컵");
		voca.ins("water", "물");
		voca.ins("apple", "사과");
		int op = 0, op2 = 0;
		String word = "", after = "";
		try {
			while (op != 6) {
				System.out.println("-------------------MENU-------------------");
				System.out.println("1. 단어 등록\t2. 단어 검색\t3. 단어 수정");
				System.out.println("4. 모든 단어 보기\t5. 단어 삭제\t6. 종료");
				System.out.print("무엇을 동작하시겠습니까? > ");
				op = s.nextInt();
				s.nextLine();
				switch (op) {
				case 1:
					System.out.println("등록할 단어와 뜻을 입력 해 주세요.");
					word = s.nextLine();
					voca.ins(word);
					break;
				case 2:
					System.out.println("검색할 단어 또는 뜻을 입력 해 주세요.");
					word = s.nextLine();
					voca.srch(word);
					break;
				case 3:
					voca.prn();
					System.out.print("무엇을 수정하시겠습니까? > (1. 영단어, 2. 뜻)");
					op2 = s.nextInt();
					s.nextLine();
					if (op2 == 1) {
						System.out.println("수정할 단어 또는 뜻을 입력 해 주세요.");
						word = s.nextLine();
						while (!(voca.getVoca().containsKey(word) || voca.getVoca().containsValue(word))) {
							System.out.println("존재하지 않는 단어입니다. 다시 입력해주세요.");
							word = s.nextLine();
						}
						System.out.println("수정할 내용을 입력해주세요.");
						after = s.nextLine();
						voca.repWord(word, after);
					} else if (op2 == 2) {
						System.out.println("수정할 단어 또는 뜻을 입력 해 주세요.");
						word = s.nextLine();
						while (!(voca.getVoca().containsKey(word) || voca.getVoca().containsValue(word))) {
							System.out.println("존재하지 않는 단어입니다. 다시 입력해주세요.");
							word = s.nextLine();
						}
						System.out.println("수정할 내용을 입력해주세요.");
						after = s.next();
						voca.repMean(word, after);
					}
					break;
				case 4:
					voca.prn();
					break;
				case 5:
					voca.prn();
					System.out.println("삭제할 단어 또는 뜻을 입력 해 주세요.");
					word = s.nextLine();
					voca.rem(word);
					break;
				case 6:
					System.out.println("시스템을 종료합니다.");
					break;
				default:
					System.out.println("존재하지 않는 옵션입니다.");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("입력값이 잘못되었습니다.");
			s.nextLine();
		}

		s.close();
	}

}

class Voca {
	Map<String, String> voca = new HashMap<>();
	String word, mean,getKey;

	public void ins(String scan) {
		String arr[] = new String[2];
		arr = scan.split(" ", 2);
		voca.put(arr[0], arr[1]);
		System.out.println(arr[0] + "단어가 단어장에 등록되었습니다.");
	}

	public void ins(String word, String mean) {
		voca.put(word, mean);
		System.out.println(word + "단어가 단어장에 등록되었습니다.");
	}

	public void srch(String scan) {
		if (voca.containsKey(scan)) {
			System.out.println(scan + " : " + voca.get(scan));
		} else if (voca.containsValue(scan)) {
			for (String key : voca.keySet()) {
				if (scan.equals(voca.get(key))) {
					System.out.println(key + " : " + scan);
				}
			}
		} else {
			System.out.println("찾는 단어가 없습니다.");
		}
	}

	public void repMean(String before, String after) {
		if (voca.containsKey(before)) {
			voca.put(before, after);
			System.out.println(before + "의 뜻이 " + after + "로 변경되었습니다.");
		} else if (voca.containsValue(before)) {
			for (String key : voca.keySet()) {
				if (before.equals(voca.get(key))) {
					voca.put(key, after);
					System.out.println(key + "의 뜻이 " + after + "로 변경되었습니다.");
				}
			}
		}
	}

	public void repWord(String before, String after) {
		if (voca.containsKey(before)) {
			String tmp = voca.get(before);
			voca.remove(before);
			voca.put(after, tmp);
			System.out.println(before + "영단어가 " + after + "로 변경되었습니다.");
		} else if (voca.containsValue(before)) {
			for (String key : voca.keySet()) {
				if (before.equals(voca.get(key))) {
					this.getKey = key;
				}
			}
			voca.remove(this.getKey);
			voca.put(after, before);
			System.out.println(this.getKey + "영단어가 " + after + "로 변경되었습니다.");
		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
	}

	public void prn() {
		int i = 1;
		System.out.println("-------------VOCA-------------");
		for (String key : voca.keySet()) {
			System.out.println(i++ + ". " + key + " : " + voca.get(key));
		}
	}

	public void rem(String scan) {
		if (voca.containsKey(scan)) {
			voca.remove(scan);
		} else if (voca.containsValue(scan)) {
			for (String key : voca.keySet()) {
				if (scan.equals(voca.get(key))) {
					this.getKey=key;
				}
			}
			voca.remove(this.getKey);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public Map<String, String> getVoca() {
		return voca;
	}

	public void setVoca(Map<String, String> voca) {
		this.voca = voca;
	}

}
