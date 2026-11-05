package day03;

public class While01 {

	public static void main(String[] args) {
		int i=1, sum=0;
//
//		while(i<=10) {
//			System.out.println();
//			i++;
//		}
//		i=1;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if(i==5)break;
//		}
		
//		while로 1부터 10까지 출력
		
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
//		while로 1부터 10까지 짝수만 출력
		i=1;
		while(i<=10) {
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
//		짝수 출력. while문을 if로 break 써서 출력

		i=1;
		while(true) {
			if(i%2==0) {
				sum+=i;
				System.out.print(sum+" ");}
			if(i==10)break;
			i++;
		}
	}

}
