package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
//		숫자를 입력받아 리스트로 출력(갯수 상관 X)
//		합계출력
//		입력 형식이 String 하나로 입력
		List<Double> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 여러개 입력해주세요.");
		String ins = s.nextLine();
		String arr[] = ins.split(" ");
		
		for(String tmp : arr) {
			list.add(Double.parseDouble(tmp));
		}
		
		Iterator<Double> it = list.iterator();
		
		System.out.println(list);
		Double sum = 0.0;
		Double sum2 = 0.0;
		for(double tmp : list) {
			sum+=tmp;
		}
		while(it.hasNext()) {
			double tmp=it.next();
			System.out.print(tmp+" ");
			sum2+=tmp;
		}
		System.out.println();
		System.out.println("1. 총 합 : "+sum);
		System.out.println("2. 총 합 : "+sum2);
		System.out.println("평균 : "+(sum/list.size()));
		s.close();
	}

}
