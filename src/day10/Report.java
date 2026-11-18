package day10;

import java.text.DecimalFormat;

public class Report {
//	한사람 성적 클래스
//	국 영 수 합계 평균 등수
//	생성자 : 이름 국 영 수 -> 매개변수로 등록
//	기본메서드 오버로딩 생성
//	# -> 해당 자릿수가 잇으면 출력 없으면 안함, 0 ->해당 자리수가 없으면 0으로 맞춰서 출력
//	합계 평균(소수점 두자리) -> DecimalFormat("##.00") -> 객체명.formt(avg)
	private String name, avg;
	private int kor, eng, math, sum, rank;
	
	public Report() {
		
	}
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum();
		this.avg = avg();
	}
	public int sum() {
		return this.kor+this.eng+this.math;
	}
	public String avg() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(sum()/3.0);
	}
	public void prt() {
		System.out.println(this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.sum+"\t"+this.avg+"\t"+this.rank);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
