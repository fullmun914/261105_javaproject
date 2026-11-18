package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
//		야구게임
//		세자리 숫자 랜덤
//		각 자리의 숫자는 0~9까지중 랜덤 숫자로 구성(중복 불가)
//		위치. 값이 모두 같으면 Strike, 위치는 안맞고 숫자만 맞으면 Ball, 맞는게 없으면 Out
//		
		Scanner s = new Scanner(System.in);

		int comNum[] = new int[3];
		int userNum[] = new int[3];
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 10);
		}
		
		//1. 10개를 생성해서 섞어서 세개만 빼 쓰기
	//		int arr[] = {0,1,2,3,4,5,6,7,8,9};
	//		for(int tmp : arr) {
	//			int mix = (int)(Math.random()*10);
	//			int storage = arr[tmp];
	//			arr[tmp] = arr[mix];
	//			arr[mix] = storage;
	//		}
		
//		2. 이중 for문을 돌려서 맨 뒷 자리 숫자를 재생성하는 코드
//			for(int i=0;i<comNum.length;i++) {
//				for(int j=0;j<i;j++) {
//					if(comNum[i]==comNum[j]) {
//						i--;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(comNum));
		
		while (comNum[0] == comNum[1]) {
			comNum[1] = (int) (Math.random() * 10);
		}
		while (comNum[0] == comNum[2] || comNum[1] == comNum[2]) {
			comNum[2] = (int) (Math.random() * 10);
		}
//		
		System.out.println("comNum : " + Arrays.toString(comNum));
		a: while (true) {
			System.out.println("--------Baseball Game--------");
			System.out.println("중복되지 않는 숫자 세개를 입력하세요 > ");
//			for (int i = 0; i < userNum.length; i++) {
//				userNum[i] = s.nextInt();
//			}
			String myNumber = s.next();
			String myArr[] = myNumber.split("");
			for(int i=0; i<myArr.length;i++) {
				userNum[i] = Integer.parseInt(myArr[i]);
			}
			
			int strike = 0, ball = 0;

			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
//					if (comNum[i] == userNum[j]) {
//						strike++;
//						if (strike == 3) {
//							System.out.println("정답입니다!");
//							break a;
//						}
					if (comNum[i] == userNum[j]) {
						if(i==j) {
							strike++;
							if (strike == 3) {
								System.out.println("정답입니다!");
								break a;
							}
						}else {
							ball++;
						}
					}
				}
			}
//			ball-=strike;
			if (strike == 0 && ball == 0) {
				System.out.println("Out입니다.");
			} else {
				System.out.println("Strike : " + strike + "개, Ball : " + ball + "개 입니다.");
			}

		}
		s.close();
	}

}
