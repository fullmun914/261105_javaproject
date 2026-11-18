package day05;

import java.util.Arrays;

public class Arr04 {

	public static void main(String[] args) {
		int arr[] = {42,58,65,12,98,12,78,65,12,56};
		int total = 0,max=arr[0],min=arr[0],max2=arr[0],min2=arr[0];
		for(int i = 0; i<arr.length;i++) {
			total+=arr[i];
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
			max2=Math.max(max2, arr[i]);
			min2=Math.min(min2, arr[i]);
		}		
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : "+total);
		System.out.println("평균 : "+total/(double)arr.length);
		System.out.println("1.제일 큰 수 : "+max);
		System.out.println("1.제일 작은 수 : "+min);
		System.out.println("2.제일 큰 수 : "+max2);
		System.out.println("2.제일 작은 수 : "+min2);
	}

}
