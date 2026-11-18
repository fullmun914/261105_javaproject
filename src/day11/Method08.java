package day11;

public class Method08 {
//	숫자를 입력받아 1부터 자신까지 곱하는 수
	private int num;
	public static int fact(int num) {
		if(num<0) {
			return 0;
		}
		if(num == 1 || num ==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	public int fact2(int num) {
		int result=1;
		if(num<0) {
			return 0;
		}
		if(num==0||num==1) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		Method08 m = new Method08();
		System.out.println(m.fact(4));
		System.out.println(m.fact2(4));
		System.out.println(fact(6));
		
	}

}
