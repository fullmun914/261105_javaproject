package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
//		index 없음 -> 순서없음, 중복 불가능
//		사용 빈도 : hash set > tree set
//		중복 덮어쓰기
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<10;i++) {
			int rand = (int)(Math.random()*10)+1;
			set.add(rand);
		}
		System.out.println(set);
		
		for(int i : set) {
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator<Integer> si = set.iterator();
		while(si.hasNext()) {
			int i = si.next();
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		list.add(8);
		System.out.println(list);
		
	}

}
