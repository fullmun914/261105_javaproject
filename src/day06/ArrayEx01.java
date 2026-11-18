package day06;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int change=0;
		change = arr[0];
		arr[0] = arr[2];
		arr[2] = change;
		System.out.println(Arrays.toString(arr));

		for(int i=0;i<arr.length;i++) {
			int index = (int)(Math.random()*arr.length);
			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Arrays.sort(arr) = 오름차순");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
