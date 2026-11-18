package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
//		메뉴 구성해서 연산
//		 ---menu---
//		1. +, 2. -, 3. *, 4. / , 5. %, 6. 종료
//		메뉴를 선택해 주세요
//		두 수를 입력해주세요
//		결과출력
//		종료 누를 때까지 반복연산
//		/와 %는 0으로 나눌 수 없음을 출력
		
		Scanner s = new Scanner(System.in);
		int menu=0, num1=0, num2=0, result=0, op=0;
		do {
			System.out.println("---MENU---");
			System.out.println("1. +, 2. -, 3. *, 4. / , 5. %, 6. 종료");
			System.out.print("메뉴를 선택해 주세요. > ");
			op = s.nextInt();
			while(op<1||op>6) {
				System.out.print("존재하지 않는 메뉴입니다. 다시 선택해 주세요 > ");
				op = s.nextInt();
			}
			if(op==6) {
				break;
			}
			System.out.print("두 수를 입력해 주세요. > ");
			num1 = s.nextInt();
			num2 = s.nextInt();
			while((op==4||op==5)&&num2==0) {
				System.out.print("0으로 나눌 수 없습니다. 나눌 수를 다시 입력해 주세요. > ");
				num2=s.nextInt()
;			}
			switch(op) {
			case 1:
				result=num1+num2;
				System.out.println(num1+"+"+num2+"="+result);
				break;
			case 2:
				result=num1-num2;
				System.out.println(num1+"-"+num2+"="+result);
				break;
			case 3:
				result=num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
				break;
			case 4:
				result=num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
				break;
			case 5:
				result=num1%num2;
				System.out.println(num1+"%"+num2+"="+result);
				break;
			case 6:
				break ;
			}
			
		}while(true);

		System.out.println("프로그램을 종료합니다.");
		
	}

}
