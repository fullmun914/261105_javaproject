package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Arr02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println("점수 입력 > ");
//			arr[i] = s.nextInt();
//			}
//		System.out.println(Arrays.toString(arr));
		
//		0~100점 사이의 값을 랜덤으로 입력
		int arr2[] = new int[10];
		int total = 0;
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=(int)(Math.random()*101);
			total += arr2[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("총 합계 : "+total);
		System.out.println("총 합계 : "+total/(double)arr2.length);
		
		
		s.close();
	}

}
