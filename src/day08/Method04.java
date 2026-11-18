package day08;

import java.util.Random;

public class Method04 {

	Random r = new Random();
	public int[] random() {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 101);
			arr[i] = r.nextInt(101);
		}
		return arr;
	}

	public void prn(int arr[]) {
		if(arr==null) {
			return;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public double avg(int arr[]) {
		int total = 0;
		if(arr==null||arr.length<=0) {
			return -999999;
		}
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return (double) total / arr.length;
	}

	public static void main(String[] args) {
//		랜덤수(0~100) 정수 5개를 담아서 배열을 만드는 매서드 생성
//		정수배열이 0이거나 갯수가 0이면 평균 결과 도출 오류 처리 -> 메인에서
//		정수 배열을 받아 한칸씩 띄워서 출력
//		정수 배열을 받아 평균값을 리턴
		Method04 m = new Method04();
		int arr[] = m.random();
		double avg = m.avg(arr);
		m.prn(arr);
		if (avg == -999999) {
			System.out.println("평균을 구할 수 없습니다.");
		} else {
			System.out.println("이 배열의 평균은 "+avg+"입니다.");
		}

	}

}
