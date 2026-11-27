package day17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
//		로또번호
//		set 1부터 45까지 랜덤수 6개
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int i=0; set.size()!=6;i++) {
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
		}
		for(int i=0; set2.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			set2.add(ran);
		}
		System.out.println(set);
		System.out.println(set2);
		System.out.println("---------------------");
		TreeSet<Integer> tSet = new TreeSet<>();

		for(int i=0; tSet.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			tSet.add(ran);
		}
		System.out.println(tSet);
		System.out.println(tSet.first());
		System.out.println(tSet.last());
		System.out.println(tSet.headSet(15));
		System.out.println(tSet.tailSet(15));
		System.out.println(tSet.subSet(10,25));
		
		System.out.println("---------------------");
		HashSet<Integer> hSet = new HashSet<>();

		for(int i=0; hSet.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			hSet.add(ran);
		}
		System.out.println(hSet);
		
		
	}

}
