package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {10, 20, 30, 40, 50};
		int[] arr4 = new int[10];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		for(int i =0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 길이 : "+arr2.length);
		
		arr[0]=100;
		arr[1]=101;
		arr[2]=102;
		arr[3]=200;
		arr[4]=201;
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println("\n");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		for(int i =0; i<arr4.length;i++) {
			arr4[i]=i+1;
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr4));
		
	}

}
