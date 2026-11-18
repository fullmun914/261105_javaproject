package day07;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
//		성적표
//		전체 인원(인원 수만큼 배열 생성)
//		이름 국 영 수 합계 평균 등수 출력
		Scanner s = new Scanner(System.in);
		System.out.print("전체 인원 수 : ");
		int person = s.nextInt();
		String name[] = new String[person];
		int[] kor = new int[person], eng = new int[person], math = new int[person], total = new int[person], count = new int[person];
		int rank[][] = new int[person][2];
		double avg[] = new double[person];
		System.out.println(person + "명의 데이터를 입력하세요.");
		System.out.println("  이름 국 영 수 (띄어쓰기로 구분해서 입력해주세요)");
		for (int i = 0; i < person; i++) {
			System.out.print((i + 1) + ". ");
			name[i] = s.next();
			kor[i] = s.nextInt();
			eng[i] = s.nextInt();
			math[i] = s.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / (double) 3;
			rank[i][0] = total[i];
			rank[i][1] = i + 1;
		}

		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i+1; j < rank.length; j++) {
				if (rank[i][0] < rank[j][0]) {
					int tmp = rank[i][0];
					rank[i][0] = rank[j][0];
					rank[j][0] = tmp;
					tmp = rank[i][1];
					rank[i][1] = rank[j][1];
					rank[j][1] = tmp;
				}
			}
		}
		for (int i = 0; i < person; i++) {
			int c=0;
			for(int j=0; j<person; j++) {
				if (rank[j][1] != (i+1)) {
					c++;
				}if(rank[j][1]==(i+1)) {
					break;
				}
			}
			count[i]=c+1;
		}

		System.out.println("이름\t국\t영\t수\t합계\t평균\t등수");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + total[i] + "\t");
			System.out.printf("%.2f", avg[i]);
			System.out.println("\t" + count[i]);
		}

		s.close();
	}

}
