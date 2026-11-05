package day01;

public class Exam01 {

	public static void main(String[] args) {
//		number의 수가 짝수인지 홀수인지 출력
		int number = 6, res = number%2;
		System.out.println("나머지 값 : "+res);
		System.out.println(res==1?"홀수":"짝수");
	}

}
