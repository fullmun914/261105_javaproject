package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
//		리스트 생성 > 과일 5가지 저장(add) > 갯수출력
//		향상된 for문 / Iterator 출력
//		리스트에 있으면 사과 판매, 없으면 재고없음 출력
		List<String> list = new ArrayList<>();
		
		list.add("샤인머스캣");
		list.add("단감");
		list.add("귤");
		list.add("블루베리");
		list.add("배");
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		Iterator <String> it = list.iterator();
		
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		if(list.contains("사과")) {
			System.out.println("사과 판매");
		}else {
			System.out.println("사과 재고 없음");
		}
		
		if(list.indexOf("샤인머스캣")!=-1) {
			System.out.println("샤인머스캣 판매");
		}else {
			System.out.println("샤인머스캣 재고 없움");
		}
	}

}
