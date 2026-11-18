package day05;

import java.util.Arrays;

public class String01 {

	public static void main(String[] args) {
		String str ="abc d efg h";
		System.out.println(str.length());
		
		System.out.println("--charAt()--");
		System.out.println(str.charAt(2));
		
		System.out.println("--substring()--");
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,5));

		System.out.println("--equals()--");
		System.out.println(str.equals("abc"));
		System.out.println(str.substring(0,3).equals("abc"));
		System.out.println("abc".substring(0,3).equals(str));
		
		str = "abc a abc b";
		System.out.println("--indexOf()--");
		System.out.println(str.indexOf("abc"));
		System.out.println(str.indexOf("abc",3));
		System.out.println(str.indexOf("t"));

		System.out.println("--lastIndexOf()--");
		System.out.println(str.lastIndexOf("c"));

		System.out.println("--email에서 아이디만 추출--");
		String email = "abcdefg@gmail.com";
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));

		System.out.println("--compareTo--");
		System.out.println("a".compareTo("c"));

		System.out.println("--contains--");
		System.out.println(str.contains("abc"));
		
		System.out.println("--concat()--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
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
		String str1 = "apple, banana, kiwi, orange";
		String[] arr = str1.split(",");
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
