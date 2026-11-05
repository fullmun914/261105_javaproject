package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
//		updown 게임(숫자 맞추기)
//		1~50중 랜덤수 하나를 컴퓨터가 생성
//		컴퓨터가 랜덤 정수를 생성했음을 표시
//		User가 말한 수보다 크면 Up, 작으면 Down 표시
//		몇회만에 맞췄는지도 확인
		Scanner s = new Scanner(System.in);
		int quiz = (int) (Math.random() * 50) + 1, answer = 0, count = 0;

		System.out.println("컴퓨터가 랜덤수를 생성했습니다. ");
		do {
			System.out.print((count+1) + ". 입력 > ");
			answer = s.nextInt();
			if (quiz < answer) {
				System.out.println("Down");
			} else if (quiz > answer) {
				System.out.println("Up");
			} else {
				System.out.println("정답입니다.");
			}
			count++;
		} while (answer != quiz);
		System.out.println("정답을 맞추기 위해 " + count + "번의 기회를 사용하셨습니다.");
		s.close();
	}

}
