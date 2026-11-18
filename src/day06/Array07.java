package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		String strarr[] = new String[5];
		strarr[0] = "홍길동";
		strarr[1] = "김영희";
		strarr[2] = "고길동";
		strarr[3] = "둘리";
		strarr[4] = "또치";
		System.out.println(Arrays.toString(strarr));
		
	
		String strarr2[] = new String[strarr.length+3];
		System.out.println(Arrays.toString(strarr2));
		for(int i=0;i<strarr.length;i++) {
			strarr2[i]=strarr[i];
		}
		System.out.println(Arrays.toString(strarr2));
		strarr=strarr2;
		System.arraycopy(strarr, 0, strarr2, 0, strarr.length);
		
		strarr[5] = "도우너";
		System.out.println(Arrays.toString(strarr));
	}

}
