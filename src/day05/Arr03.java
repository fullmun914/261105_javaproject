package day05;

import java.util.Scanner;

public class Arr03 {

	public static void main(String[] args) {
//		배열 생성
//		5명 점수 (0~100)
//		합계, 평균
//		범위 벗어나면 입력 다시
		Scanner s = new Scanner(System.in);
	
		int arr[] = new int[5];
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("점수를 입력하세요 > ");
			arr[i] = s.nextInt();
			while(arr[i]<0||arr[i]>100) {
				System.out.print("범위를 벗어났습니다. 다시 입력해주세요 > ");
				arr[i] = s.nextInt()
;			}
			total += arr[i];
		}
		System.out.println("점수의 총 합 : "+total);
		System.out.println("점수의 평균 : "+total/(double)arr.length);
		
	}

}
