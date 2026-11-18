package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
//		태어난 년도만 숫자로 입력받아 어린이/청소년/어른 구분 후 출력
//		13까지 어린이 / 19까지 청소년 / 20살부터는 성인
//		요금 어린이 : 5000 / 청소년 : 7000 / 어른 : 10000 입장료 출력
//		2026-태어난년도 기준
//		생년 유효값 : 1900~2026
//		#### -> ### 입니다. 입장료는 ### 입니다.
//		기준에 넘어간 데이터는 다시 입력 > 생년이 유효하지 않습니다 . 다시 입력해주세요 (유효 값은 1900~2026 입니다.)
//		가능하면 여러명 입력받기

//		제출 답 
//		Scanner s = new Scanner(System.in);
//		int birth = 0, age = 0;
//
//		System.out.println("태어난 년도를 입력해 주세요.(프로그램 종료 : 9999)");
//		do {
//			birth = s.nextInt();
//			if (birth == 9999) {
//				break;
//			}
//			if (birth < 1900 || birth > 2026) {
//				System.out.println("생년이 유효하지 않습니다 . 다시 입력해주세요 (유효 값 : 1900~2026, 프로그램 종료 : 9999)");
//			} else {
//				age = 2026 - birth;
//				if (age <= 13) {
//					System.out.println(birth + " -> 어린이 입니다. 입장료는 5000원 입니다.");
//				} else if (age <= 19) {
//					System.out.println(birth + " -> 청소년 입니다. 입장료는 7000원 입니다.");
//				} else {
//					System.out.println(birth + " -> 어른 입니다. 입장료는 10000원 입니다.");
//				}
//			}
//		} while (true);
//		System.out.println("프로그램이 종료됩니다.");
//
//		s.close();
		
//		수업
//		종료 : 0, 출력한 모든 인원의 최종 결제금액 도출
		Scanner s = new Scanner(System.in);
		int year = 1,adult=0,youth=0,child=0;
		int total = 0, count = 0;
		while(year!=0) {
			System.out.println("생년을 입력하세요. (종료 : 0)");
			year = s.nextInt();
			int today = 2026;

			count = child + youth + adult;
			
 			while(year!=0&&year<1900||year>today) {
				System.out.println("유효하지 않은 년도입니다.");
				System.out.println("다시 입력해주세요. (1900~2026) >");
				year = s.nextInt();
			}
 			
 			if(year == 0) {
 				break;
 			}
			
			int age = today-year;
			
			if(age<=13) {
				System.out.println(age+"세 어린이입니다. 입장료는 5000원 입니다.");
				total += 5000;
				child++;
			}else if(age<=19) {
				System.out.println(age+"세 청소년입니다. 입장료는 7000원 입니다.");
				total += 7000;
				youth++;
			}else{
				System.out.println(age+"세 어른입니다. 입장료는 10000원 입니다.");
				total += 10000;
				adult++;
			}
			
		}
		System.out.println("어른 "+adult+"명, 청소년 "+youth+"명, 어린이 "+child+"명\n총 "+count+"명의 요금 "+total+"원을 결제해주세요.");
		s.close();
	}

}
