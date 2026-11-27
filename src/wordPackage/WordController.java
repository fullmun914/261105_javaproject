package wordPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WordController {

	private List<Word> voca = new ArrayList<Word>();

//	기본단어 추가
	public WordController() {
		voca.add(new Word("happy", insMean("행복한")));
		voca.add(new Word("phone", insMean("휴대폰")));
		voca.add(new Word("cup", insMean("컵")));
		voca.add(new Word("water", insMean("물")));
		voca.add(new Word("apple", insMean("사과")));
	}

	public List<String> insMean(String mean) {
		List<String> insMean = new ArrayList<String>();
		insMean.add(mean);
		return insMean;
	}

	public void insWord(Scanner s) {
		System.out.print("등록할 영단어 : ");
		String word = s.nextLine();
		if(voca.contains(new Word(word))) {
			System.out.println("이미 존재하는 단어입니다.");
			return;
		}
		List<String> insertMean = new ArrayList<>();
		while(true) {			
			System.out.print("<" + word + ">의 뜻 : (종료 : 0)");
			String mean = s.nextLine();
			if(mean.equals("0")) {
				break;
			}
			insertMean.add(mean);
		}
		voca.add(new Word(word, insertMean));
	}

	public void srchWord(Scanner s) {
		int index = 0;
		System.out.print("검색할 영단어 : ");
		String word = s.nextLine();
		int indexof = voca.indexOf(new Word(word));
//		if (voca.contains(new Word(word))) {
//			for (Word i : voca) {
//				if (i.getWord().equals(word)) {
//					i.prnWord();
//					index++;
//				}
//			}
//		}
//		if (index == 0) {
//			System.out.println("등록되지 않은 영단어입니다.");
//		}
		if(indexof !=-1) {
			voca.get(indexof).prnMean();
			return;
		}
		System.out.println("존재하지 않는 단어입니다.");
	}

	public void revWord(Scanner s) {
		prnWord("REVISIOM");
		System.out.print("수정할 영단어 번호 : ");
		int wordNum = s.nextInt() - 1;
		s.nextLine();
		if(!(wordNum<voca.size()&&wordNum>=0)) {
			System.out.println("존재하지 않는 번호입니다.");
		}
		Word word = voca.get(wordNum);
		if (voca.contains(new Word(word.getWord()))) {
			System.out.println("----------MEAN--------");
			for (Word i : voca) {
				if (i.getWord().equals(word.getWord())) {
					i.prnMean();
				}
			}
			System.out.println("----------------------");
			System.out.print("원하는 옵션 (1.추가, 2.수정, 3.삭제) : ");
			int op = s.nextInt();
			s.nextLine();
			switch (op) {
			case 1:
				System.out.print("추가할 내용 : ");
				String addMean = s.nextLine();
				Word w = getWord(word);
				w.addMean(addMean);
				voca.set(wordNum,w);
				break;
			case 2:
				System.out.print("수정할 뜻 번호 : ");
				int revMean = s.nextInt()-1;
				s.nextLine();
				System.out.print("수정할 내용 : ");
				String repMean = s.nextLine();
				w = getWord(word);
				w.getMean().set(revMean, repMean);
				voca.set(wordNum,w);
				break;
			case 3:
				System.out.print("삭제할 뜻 번호 : ");
				int remMean = s.nextInt()-1;
				w = getWord(word);
				w.getMean().remove(remMean);
				voca.set(wordNum,w);
				break;
			default:
				System.out.println("존재하지 않는 옵션입니다.");
			}
		} else {
			System.out.println("등록되지 않은 영단어입니다.");
		}

	}

	public void prnWord(String insTitle) {
//		voca.sort(new Comparator<Word>() {
//
//			@Override
//			public int compare(Word o1, Word o2) {
//				// TODO Auto-generated method stub
//				return o1.getWord().compareTo(o2.getWord());
//			}
//			
//		});
		
		Iterator<Word> it = voca.iterator();
		String title = insTitle;
		System.out.println("----------" + title + "---------");
		if (title.equals("SEARCH") && !it.hasNext()) {
			System.out.println("등록된 단어가 없습니다.");
		}
		for (Word i : voca) {
			i.prnWord();
		}
		System.out.println("-------------------------------");
		Word.wCnt = 0;

	}

	public void remWord(Scanner s) {
		prnWord("REMOVE");
		System.out.print("지울 영단어 번호 : ");
		int wordNum = s.nextInt() - 1;
		s.nextLine();
		String word = voca.get(wordNum).getWord();
//		if (voca.contains(new Word(word))) {
//			voca.remove(wordNum);
//		} else {
//			System.out.println("등록되지 않은 영단어입니다.");
//		}
		boolean ok = voca.remove(new Word(word));
		System.out.println(ok?"삭제완료":"없는 단어입니다.");

	}
	
	public Word getWord(Word word) {
		Word w = new Word();
		w.setWord(word.getWord());
		w.setMean(word.getMean());
		return w;
	}

}
