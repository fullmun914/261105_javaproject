package day16;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
//		몇부터 몇중에 몇개의 랜덤으로 값 채움
//		매개변수로 size<=0 count start
//		배열 리턴

		Exception06 ex = new Exception06();
		try {
			int prn[] = ex.rand(5, 100, 1);
			System.out.println(Arrays.toString(prn));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public int[] rand(int size, int count, int start) {
		if (size <= 0) {
			throw new RuntimeException("배열의 크기는 0 이하입니다.");
		}
		if(count<=0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다");
		}
		int ran[] = new int[size];
		for (int i = 0; i < size; i++) {
			if (ran[i] == 0) {
				ran[i] = (int) (Math.random() * count) + start;
			}
		}
		return ran;
	}
}
