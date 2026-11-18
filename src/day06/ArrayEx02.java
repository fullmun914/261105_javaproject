package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx02 {

	public static void main(String[] args) {
//		배열 10개 랜덤으로 0~100사이값 채우기
//		오름차순 정렬, 출력(이중for문으로)
		Integer arr[]=new Integer[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*101);
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t = arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
