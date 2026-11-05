package day03;

public class While03 {

	public static void main(String[] args) {
//		1~50까지 짝수만 출력
//		앞자리 수가 바뀌면 줄바꿈
		int i =1, c=0;
		while(i<=50) {
			if(i%2==0) {
				System.out.print(i + " ");
				c++;
			}
			
//			while 조건이 true일때 반복문을 나오는 코드
//			if(i==50) {
//				break;
//			}
			
//			10의 배수마다 줄바꿈
//			if(i%10==0) {
//				System.out.println();
//			}
			
//			출력이 5번 되면 줄바꿈
			if(c==5) {
				System.out.println();
				c=0;
			}
			i++;
		}
	}

}
