package day01;

public class If {

	public static void main(String[] args) {
		int number = 10;
		if(number % 2 == 0) {
			System.out.println("짝수");
		}
		if(number % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		if(number > 0) {
			System.out.println("양수");
		}else if(number < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}

}
