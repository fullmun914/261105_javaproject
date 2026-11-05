package day02;

public class For01 {

	public static void main(String[] args) {
		int sum=0;
		System.out.print("1 ~ 10중 짝수만 출력 : ");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~10까지 합계
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합 : "+sum);
	}

}