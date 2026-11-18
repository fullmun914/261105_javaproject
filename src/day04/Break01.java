package day04;

public class Break01 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==0) {
				break;
			}
			System.out.println(i);
		}
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		int i = 0, j = 0, k = 0;
		a: for(;;){
			i++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.println("i : "+i+", j : "+j+", k :"+k);
					if(k==10) {
						break a;
					}
				}
			}
		}
		System.out.println("반복 후 처리");
	}

}
