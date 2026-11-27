package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousCalss02 {

	public static void main(String[] args) {
//		1부터 100까지중 랜덤수 10개를 저장하는 리스트 -> 출력
		
		List<Integer> list = new ArrayList<>();		
		while(list.size()<10) {
			int ran = (int)(Math.random()*100)+1;
			list.add(ran);
		}
		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		System.out.println(list);
		
		System.out.println("-----------------------------");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Kiwi");
		list2.add("Banana");
		list2.add("Apple");
		list2.add("Tomato");
		list2.add("Grapes");
		list2.add("Pear");
		list2.add("Orange");
		list2.add("Watermelon");
		list2.add("Melon");
		System.out.println(list2);
		
		list2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list2);
		
	}

}
