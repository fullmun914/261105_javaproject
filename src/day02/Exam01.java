package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
//		국, 영, 수 점수 입력받아 합계, 평균, pass여부 확인
//		입력받은 점수는 0~100점 사이의 값만 인정
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = s.nextInt();
		if(kor>=0&&kor<=100) {
			System.out.println("영어 점수 : ");
			int eng = s.nextInt();
			if(eng>=0&&eng<=100) {
				System.out.println("수학 점수 : ");
				int math = s.nextInt();
				if(math>=0&&math<=100) {
					int total = kor+eng+math;
					double avg = total/3.0;
					String pass = avg>=60 ? "합격":"불합격";
					
					System.out.println("세 점수의 합계 : "+total);
					System.out.println("세 점수의 평균 : "+avg);
					System.out.println("합격 여부 : "+pass);
				}else return;
			}else return;
		}else return;
	}

}
