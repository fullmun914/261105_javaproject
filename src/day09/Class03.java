package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Class03 {
	public static void main(String[] args) {
//		클래스 생성
//		학생이름, 국, 영, 수 점수를 객체로 받는 클래스 생성
//		이름과 [국,영,수] 출력 메서드
//		합계 리턴 메서드
//		메서드 호출하면 합계/3으로 평균이 리턴되는 평균메서드
//		각 멤버변수의 getter setter(오류출력) 만들기
		Scanner s = new Scanner(System.in);
		StudentClass sc = new StudentClass();
		StudentClass[] scArr = new StudentClass[10];

			System.out.println("학생이름, 국어점수, 영어점수, 수학점수를 입력해주세요.");

			String student = s.nextLine();
			sc.setStudent(student);
			sc.prn();
			System.out.println("합계 : " + sc.sum() + ", 평균 : " + sc.avg());
		s.close();
	}

}

class StudentClass {

	private String name;
	private String[] student = new String[4];
	private int kor, eng, math, sum;
	private double avg;

	public String[] setStudent(String student) {
		if (student == null) {
			return null;
		}
		this.student = student.split(" ");
		this.name = this.student[0];
		this.kor = Integer.parseInt(this.student[1]);
		this.eng = Integer.parseInt(this.student[2]);
		this.math = Integer.parseInt(this.student[3]);
		return this.student;
	}

	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	public void prn() {
		System.out.print(this.student[0] + " [ ");
		for (int i = 1; i < this.student.length; i++) {
			System.out.print(this.student[i] + " ");
		}
		System.out.println("]");
	}

	public int sum() {
		this.sum = this.kor + this.eng + this.math;
		return this.sum;
	}

	public double avg() {
		this.avg = (double) sum() / 3;
		return this.avg;
	}

	public String getName() {
		return this.name;
	}

	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			this.kor = -999999;
		}
		this.kor = kor;
	}

	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			this.eng = -999999;
		}
		this.eng = eng;
	}

	public void setMath(int math) {
		if (math < 0 || math > 100) {
			this.math = -999999;
		}
		this.math = math;
	}

}