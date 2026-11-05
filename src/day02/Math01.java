package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		double num = 3.14159;
		long pi = Math.round(num);
		System.out.println(pi);
		
		int i = (int)Math.round(num);
		
		int fi = (int)Math.floor(num);
		
		int ci = (int)Math.ceil(num);	
		double ran = Math.random();
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
		Random rand = new Random();
		System.out.println(rand.nextInt(10));
		
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		
	}

}
