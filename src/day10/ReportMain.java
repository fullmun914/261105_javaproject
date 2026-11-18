package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
//		ReportClass 객체생성 -> 실행
//		성적 산출 인원 > 3(입력)
//		이름 국어 영어 수학 합계 평균 등수
//		메인에서 등수등록
//		-> 배열생성 -> new Report[count];
//		Report객체가 들어가는 배열 만들기
//		Report r = new Report("이름",98, 70, 60);
//		report[0]=r;
		String name=null;
		int kor=0, eng=0, math=0;
		Scanner s = new Scanner(System.in);
		System.out.print("성적 산출 인원 > ");
		int person = s.nextInt();
		Report rep[] = new Report[person];
//		int arr[]=new int[person];
		for(int i = 0; i< rep.length; i++) {
			System.out.println("이름, 국어점수, 영어점수, 수학점수를 입력하세요. > ");
			name = s.next();
			kor = (int)(Math.random()*70+30);
//					s.nextInt();
			eng = (int)(Math.random()*70+30);
//					s.nextInt();
			math = (int)(Math.random()*70+30);
//					s.nextInt();
			rep[i] = new Report(name,kor,eng,math);
//			arr[i] = rep[i].sum();
		}
		
//		<<self>>
//		Arrays.sort(arr);
//		for(int i=0;i<rep.length;i++) {
//			for(int j=0;j<rep.length;j++) {
//				if(arr[i]==rep[j].sum()) {
//					rep[j].setRank(rep.length-i);
//				}
//			}
//		}
		
//		<<with t>>
		for(int i=0;i<person;i++) {
			int rank = 1;
			for(int j =0;j<person;j++) {
				if(rep[i].sum() < rep[j].sum()) {
					rank++;
				}
			}
			rep[i].setRank(rank);
		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i=0;i<rep.length;i++) {
			rep[i].prt();
		}
		s.close();
	}

}
