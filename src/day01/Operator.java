package day01;

public class Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = b+10;
		System.out.println(a);
		System.out.println("a = "+a);
		
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		System.out.println(4/3.0);
		System.out.println(4%3);
		
		System.out.println((double)a/b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(!(a==b));
		System.out.println((1<3)&&(3>4));
		System.out.println((1<3)||(3>4));
		System.out.println((a==b)?"a와 b가 같습니다":"a와 b가 다릅니다");
		
		System.out.println(a);
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		System.out.println(a++);
		a += 2;
		System.out.println(a);
		
		++a;
		a++;
		
		a+=2;
		a=b+2;
	}

}
