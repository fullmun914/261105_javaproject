package day04;

public class For06 {

	public static void main(String[] args) {
//		*찍기 5*5칸
		int ci=5,cj=5;
		for(int i=0;i<ci;i++) {
			for(int j=0;j<cj;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		갈수록 별 갯수가 늘어나는 모양
		for(int i=0;i<ci;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		역순
		for(int i=ci;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
