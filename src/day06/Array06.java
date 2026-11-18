package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
//		10개의 숫자 랜덤생성(0~100)
//		합계, 평균, 최대, 최소
//		향상된 for문 사용
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*101);
		}
		int total = 0, max = arr[0], min = arr[0];
		for(int temp : arr) {
			total+=temp;
			max = Math.max(temp, max);
			min = Math.min(temp, min);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : "+total);
		System.out.println("평균 : "+total/(double)arr.length);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
