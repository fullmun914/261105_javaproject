package day04;

public class For04 {

	public static void main(String[] args) {
//		약수
		System.out.print("6의 약수는 ");
		
		int number = 100, num1 = 15, num2 = 20, bigger = Math.max(num1, num2), max = 0, smaller =Math.min(num1,num2);
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
//		공약수 6,12

		System.out.print(num1+"과 "+num2+"의 공약수는 ");
		for(int i =1; i<=bigger;i++) {
			if(num1%i==0&&num2%i==0) {
				System.out.print(i+" ");
				max=i;
			}
		}
		System.out.println();
		System.out.print(num1+"과 "+num2+"의 최대공약수는 ");
		System.out.println(max);
		
		for(int i=num1;;i--) {
			if(num1%i==0&&num2%i==0) {
				System.out.print("최대 공약수 : "+i);
				break;
			}
		}
		System.out.println();
//		최소공배수
//		직접 짠
		a: for(int i=1;;i++) {
			for(int j=0;j<=num1;j++) {
				if(num1*i==num2*j) {
					System.out.println("1. 최소 공배수 : "+(num1*i));
					break a;
				}
			}
		}
//		선생님
		for(int i=num1;;i=i+num1) {
			if(i%num1==0 &&i%num2==0) {
				System.out.println("2. 최소 공배수 : "+i);
				break;
			}
		}
		
	}

}
