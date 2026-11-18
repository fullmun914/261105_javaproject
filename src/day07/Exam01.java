package day07;

import java.util.Scanner;

public class Exam01 {
	
	public int total(int num[]) {
		int total = 0;
		for(int i=0;i<num.length;i++) {
			total+=num[i];
		}
		return total;
	}
	public int[] toNum(String num[]) {
		int nNum[]=new int[num.length];
//		배열이 없을 경우 오류처리
		if(num==null||num[0]==null||num.length<=0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return nNum;
		}
//		숫자 배열의 길이보다 문자 배열의 길이가 길 때
		if(num.length!=nNum.length) {
			System.out.println("배열을 처리할 수 없습니다.");
			return nNum;
		}
		for(int i=0;i<num.length;i++) {
			nNum[i]=Integer.parseInt(num[i]);
		}
		return nNum;
	}

	public void toNum2(String num[],int iNum[]) {
//		배열이 없을 경우 오류처리
		if(num==null||num[0]==null||num.length<=0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return ;
		}
//		숫자 배열의 길이보다 문자 배열의 길이가 길 때
		if(num.length!=iNum.length) {
			System.out.println("배열을 처리할 수 없습니다.");
			return ;		}
		for(int i=0;i<num.length;i++) {
			iNum[i]=Integer.parseInt(num[i]);
		}
	}
	
	public double avg(int num[]) {
		if(num == null) {
			System.out.println("처리할 수 없습니다.");
			return -999999;
		}
		if(num.length<=0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -999999;
		}
		return total(num)/(double)num.length;
	}
	public String plusPrint(String[] num) {
//		for(int i=0; i<num.length-1;i++) {
//			System.out.print(num[i]+"+");
//		}
//		System.out.print(num[num.length-1]);
		
		return String.join("+", num);
	}
	public void res(String num[]) {
		System.out.println(plusPrint(num)+" = "+total(toNum(num))+", 평균은 "+avg(toNum(num))+"입니다.");
	}
	
	public static void main(String[] args) {
//		숫자를 입력받아 입력받은 숫자의 합계, 평균 출력
//		입력을 String으로 ex) 1+2+3+4+5
//		0만 입력하거나 음수를 입력하면 종료
		Scanner s = new Scanner(System.in);
		Exam01 e = new Exam01();
		while(true) {
			System.out.println("숫자를 입력하세요(0또는 음수는 종료) > ");
			String sNum = s.next();
			if(Integer.parseInt(sNum)<=0) {
				System.out.println("계산을 종료합니다.");
				break;
			}
			String num[] = sNum.split("");
			
//			e.res(num);
			
			int iNum[]=new int[num.length];
			e.toNum2(num,iNum);
			double avg = e.avg(iNum);
			
//			오류처리
			if(avg==-999999) {
				System.out.println("나눌 수 없습니다.");
			}
			
			System.out.println(e.plusPrint(num)+" = "+e.total(iNum)+", 평균은 "+e.avg(iNum)+"입니다.");
		}
		s.close();
	}

}
