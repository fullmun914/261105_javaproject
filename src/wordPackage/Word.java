package wordPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Word implements Comparable<Word>{
//	단어 뜻 저장
//	하나으 ㅣ단어에 여러개 뜻 저장
//	뜻에 띄어쓰기 포함할 수 있게
//	영단어만 맞으면 모두 equals 뜨게 / 검색, 삽입(중복불가)
//	System.out.println("1. 단어 등록\t2. 단어 검색\t3. 단어 수정");
//	System.out.println("4. 모든 단어 보기\t5. 단어 삭제\t6. 종료");
	static int wCnt,mCnt;
	private String word;
	private List<String> mean = new ArrayList<>();
	
	public Word() {}
	public Word(String word) {
		this.word = word;
	}
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	public void prnWord() {
		wCnt++;
		System.out.print(wCnt+". 단어 > ");
		System.out.println(word);
		System.out.print("뜻 > ");
		prnMean();
		mCnt=0;
	}
	public void prnMean() {
		Iterator<String> it = mean.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			mCnt++;
			System.out.println("\t"+mCnt+". "+tmp);
		}
		mCnt=0;
	}public void addMean(String mean) {
		this.mean.add(mean);
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getMean() {
		return mean;
	}
	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return "단어 : "+ word + "\n뜻 > " + mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	@Override
	public int compareTo(Word o) {
//		this와 o 동작비교
		return this.word.compareTo(o.getWord());
	}
	
	

}
