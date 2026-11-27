package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
//		1부터 10까지 반복문 사용하여 리스트에 add 
//		반복문 사용하여 출력
//		인덱스 4번값 11로 변경
//		1의 값 있는지 체크(boolean)
		List<Integer> list= new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
//		향상된 for문
		int sum = 0;
		for(int temp : list) {
			System.out.print(temp+" ");
			sum+=temp;
		}
		
		System.out.println();
		System.out.println("총 합 : "+sum);
		
		System.out.println();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // 요소가 있는지 확인
			int tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		list.set(4, 11);
		System.out.println(list);
		System.out.println(list.contains(1));
		
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(70);
		list.add(36);
		list.add(96);
		list.add(35);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
