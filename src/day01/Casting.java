package day01;

public class Casting {

	public static void main(String[] args) {
		byte b = 11;
		int a = b, aa = 200;
		byte c = (byte)aa;
		
		System.out.println(c);
		
		long l = a;
		double d = 3.141592;
		int pi = (int)d;
		
		System.out.println(d);
		System.out.println(pi);
		
		int number = 100;
		double num = number;
		System.out.println(num);
		
		String str = "123";
		
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber+10);
		
		
	}

}
