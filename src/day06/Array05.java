package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
//		숫자 다섯개 입력할 수 있는 배열 생성
//		0~100까지 넣기
//		합계 출력
		Scanner s = new Scanner(System.in);
		
		int[] enter = new int[5];
		int total = 0;
		System.out.print("숫자를 입력해주세요 ");
		for(int i=0;i<enter.length;i++) {
			System.out.print("("+(enter.length-i)+"개 더)> ");
			enter[i]=s.nextInt();
			if(enter[i]>100||enter[i]<0) {
				System.out.print("범위 내 숫자로 다시 입력해주세요(0~100) ");
				i--;
				continue;
			}
			total+=enter[i];
		}
		System.out.println(Arrays.toString(enter));
		System.out.println(total);
		
		System.out.println("-------------------------------");
		
		for(int tmp : enter) {
			System.out.println(tmp);
		}
		
		s.close();
	}

}
