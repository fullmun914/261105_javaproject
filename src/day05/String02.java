package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		System.out.println("--toLowerCase(),toUpperCase()--");
		System.out.println("JPG".toLowerCase());
		System.out.println("jpg".toUpperCase());
		
		System.out.println("--isEmpty()--");
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
		System.out.println("--isBlank()--");
		System.out.println("".isBlank());
		System.out.println(" ".isBlank());
		
		System.out.println("--trim()--");
		System.out.println("             abc            ".trim());

		System.out.println("--replace()--");
		System.out.println("2026-11-09".replace("-","/"));
		
		System.out.println("--split()--");
		String str = "apple, banana, kiwi, orange";
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("1234".split("")));
		
		String num = "123";
		int num1 = Integer.parseInt(num);
		System.out.println(num1);
		
		String num2 = String.valueOf(num1);
		System.out.println(num2);
		
		System.out.println(num2 instanceof String);
	}

}
