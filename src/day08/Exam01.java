package day08;

import java.util.Scanner;

public class Exam01 {

//	로또 만들기
//	1. 랜덤 수를 리턴하는 매서드(1~45) *45+1
//	2. 중복 확인 메서드(매개변수로 배열 주기 > 랜덤한 정수 하나 > 배열에 정수가 있는지 true/false)
//	3. 배열을 매개변수로 받음(받은 배열 안에 랜덤 함수로 채워줌) -> 2번 매서드를 호출해서 채우기
//	4. 배열 출력 메서드
//	사용자 번호 >> 출력
//	당첨 번호 >> 출력 + [보너스번호]
//	5. 당첨 확인 메서드
//	사용자번호 / 당첨번호를 받아 등수 리턴 혹은 출력
//	보너스 제외 모두 일치 -> 1등
//	5개+보너스 -> 2등
//	5개 -> 3등
//	4개 -> 4등
//	3개 -> 5등
//	나머지 꽝

//	3
	public int[] randArr(int arr[]) {
		if(arr==null||arr.length<=0){
			System.out.println("잘봇된 배열");
		}
		for (int i=0; i<arr.length;i++) {
			arr[i] = rand();
			for(int j=0; j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		return arr;
	}
//	선생님이랑 만든 곳
	public void rndArray(int[] arr) {
		if(arr==null||arr.length<=0){
			System.out.println("잘봇된 배열");
			return;
		}
		int i=0;
		while(i<arr.length) {
			int random = rngRand(1,45);
			if(!(tCheck(arr,random))) {
				arr[i]=random;
				i++;
			}
		}
	}
	

//	1
	public int rand() {
		return (int) (Math.random() * 45) + 1;
	}
	
//	선생님이랑 만든곳
	public int cntRand(int count, int start) {
		return (int) (Math.random() * count) + start;
	}
	
	public int rngRand(int start, int end) {
		return (int) (Math.random()*(end+1-start)+start);
	}

//	2
	public boolean duCheck(int arr[], int num) {
		if(arr==null||arr.length<=0){
			System.out.println("잘봇된 배열");
		}
		int cnt = 0;
		for (int i=0; i<arr.length;i++) {
			if(i==6) {
				break;
			}
			if (arr[i] == num) {
				cnt++;
			}
		}
		return cnt == 1 ? true : false;
	}
//	선생님이랑 만든곳
	public boolean tCheck(int arr[], int num) {
		if(arr==null||arr.length<=0){
			System.out.println("잘봇된 배열");
		}
		for (int i=0; i<arr.length;i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	

//	4
	public void prn(int arr[]) {
		if(arr==null||arr.length<=0){
			System.out.println("잘봇된 배열");
			return;
		}
		for (int i=0 ;i<arr.length;i++) {
			if (i == 6) {
				System.out.print("[" + arr[i] + "]");
			}else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

//	5
	public void rank(int lotto[], int user[]) {
		if(lotto==null||lotto.length<=0||user==null||user.length<=0){
			System.out.println("잘봇된 배열");
		}
		if(user.length>=lotto.length) {
		}
		int cnt = 0, rank = 0;
		for (int i = 0; i < lotto.length - 1; i++) {
			if (duCheck(lotto, user[i]) == true) {
				cnt++;
			}
		}
		switch (cnt) {
		case 6:
			rank = 1;
			break;
		case 5:
			if (duCheck(user, lotto[lotto.length-1]) == true) {
				rank = 2;
			} else {
				rank = 3;
			}
			break;
		case 4:
			rank = 4;
			break;
		case 3:
			rank = 5;
			break;
		default:
			break;
		}
		System.out.print("로또 결과 : ");
		if (rank == 0) {
			System.out.println("꽝입니다..");
		} else {
			System.out.println(rank + "등입니다!");
		}
	}
	
//	선생님이랑
	public int ranking(int []user, int [] lotto) {
		if(lotto==null||lotto.length<=0||user==null||user.length<=0){
			System.out.println("잘봇된 배열");
			return-999999;
		}
		if(user.length>=lotto.length) {
			return-999999;
		}
		int count=0;
		for(int i=0;i<user.length;i++) {
			if(tCheck(user,lotto[i])) {
				count++;
			}
		}
		switch(count) {
		case 6 :return 1;
		case 5 : 
			return tCheck(user,lotto[lotto.length-1]) ?  2: 3;
		case 4 : return 4;
		case 3 : return 5;
		default : return 0;
		}
	}

	public static void main(String[] args) {
//		사용자가 찍는 번호(6개) -> 자동
//		당첨번호(7개) -> 자동
		Scanner s = new Scanner(System.in);
		Exam01 ex1 = new Exam01();
		int user[] = new int[6], lotto[] = new int[7];
		user = ex1.randArr(user);
		lotto = ex1.randArr(lotto);
		System.out.println("유저 번호 : ");
		ex1.prn(user);
		System.out.println("당첨 번호 : ");
		ex1.prn(lotto); 
		ex1.rank(lotto,user);
		
//		선생님이랑
		System.out.println("유저 번호 : ");
		ex1.randArr(user);
		System.out.println("당첨 번호 : ");
		ex1.randArr(lotto);
		
		int ranking = ex1.ranking(user,lotto);
		if(ranking==-999999) {
			System.out.println("배열오류");
		}else if(ranking==0) {
			System.out.println("꽝");
		}else {
			System.out.println(ranking+"등!");
		}
		

	}

}
