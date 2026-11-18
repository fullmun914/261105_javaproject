package day08;

//import java.util.Arrays;

import day07.Exam01;

public class Method05 {
	
	public int [] order(int[] arr) {
		if(arr==null) {
			return arr;
		}
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int str = arr[i];
					arr[i] = arr[j];
					arr[j] = str;
				}
			}
		}
//		Arrays.sort(arr);
		return arr;
	}
	public int max(int[] arr) {
		if(arr==null) {
			return -999999;
		}
		order(arr);
		return arr[arr.length-1];

//		int max = arr[0];
//		for(int tmp : arr) {
//			if(max < arr[1]) {
//				max = arr[i];
//			}
//		}
	}
	public int min(int[] arr) {
		if(arr==null) {
			return -999999;
		}
		order(arr);
		return arr[0];
//		int min = arr[0];
//		for(int tmp : arr) {
//			if(min > arr[1]) {
//				min = arr[i];
//			}
//		}
	}
	public static void main(String[] args) {
//		배열 받아 출력 메서드
//		배열 받아 오름차순 정렬 메서드
//		배열 받아 합계 평균 최대 최소 출력 메서드
//		합계 평균은 다른 메서드에서 호출
		int [] arr = {78,89,85,84,96,56,59,81,52,62,87,46,39,65};
		Method04 m4 = new Method04();
		Method05 m5 = new Method05();
		Exam01 ex1 = new Exam01();
		m4.prn(arr);
		System.out.println("오름차순 정렬 > ");
		m4.prn(m5.order(arr));
		int sum = ex1.total(arr);
		double avg = ex1.avg(arr);
		int max = m5.max(arr);
		int min = m5.min(arr);
		if(max==-999999|| min==-999999) {
			System.out.println("배열 오류!");
		}
		System.out.println("합계 : "+sum+" / 평균 : "+avg+" / 최댓값 : "+max+" / 최솟값 : "+min);
		
		
	}

}
