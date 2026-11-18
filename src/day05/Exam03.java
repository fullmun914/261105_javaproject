package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
//		가위바위보 게임
//		컴퓨터와 유저가 가위바위보 게임을 진행
//		가위 = 0 , 바위 = 1, 보 = 2
//		누가 이겼는지 출력

//		com = 0 / me = 0
//		com(가위) / me(가위) ==> 무승부

//		이외 다른값이 입력되면 다시 입력 유도
		Scanner s = new Scanner(System.in);
		String[] rsp = { "가위", "바위", "보" };
		String result="";
		do {
			System.out.println("가위 바위 보 게임을 시작합니다.");
			System.out.print("가위 = 0, 바위 = 1, 보 = 2 (프로그램 종료 : 3)> ");
			int pc = (int) (Math.random() * 3);
			int me = s.nextInt();
			boolean pcWin = (pc == 0 && me == 2) || (pc == 1 && me == 0) || (pc == 2 && me == 1);
			while (me < 0 || me > 3) {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요 > ");
				me = s.nextInt();
			}
			if(me==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (pc == me) {
				result ="무승부";
			} else if (pcWin) {
				result = "com 승";
			} else {
				result = "me 승";
			}
			System.out.println("com = " + pc + " / me = " + me);
			System.out.println("com = " + rsp[pc] + " / me = " + rsp[me] + " ==> "+result);
			
			
		} while (true);
		s.close();
	}

}
