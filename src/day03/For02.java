package day03;

import java.util.Random;

public class For02 {

	public static void main(String[] args) {
//		1~100까지 합계
		int sum = 0, sum2=0;
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
//		1~100까지 짝수의 합계
		for(int i=1; i<=100;i++) {
			if(i%2==0)sum+=i;
			else sum2+=i;
		}
		System.out.println(sum);
		System.out.println(sum2);
		
//		랜덤 함수로 1~10까지의 랜덤수를 5번 출력
		Random r = new Random();
	
		
		for(int i=0; i<5;i++) {
			System.out.print(r.nextInt(10)+1+" ");
			System.out.println((int)(Math.random()*10)+1);
		}
	}

}
