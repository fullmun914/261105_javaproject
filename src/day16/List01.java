package day16;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list);
//		add() -> 요소추가
		list.add(100);
		list.add(10);
		list.add(30);
		list.add(0, 50);
		System.out.println(list);
		
//		get(index) -> index 번지의 요소 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
//		set(index, 값) -> Index 번지 속 값변경
		list.set(0, 200);
		System.out.println(list);
		
//		remove(index) -> 번지 요소 삭제 -> 지운 후 지운 값 리턴 (Object로 찾으면 지운 후 boolean감ㅅ 내줌)
		System.out.println(list.remove(0));
		System.out.println(list);
		
		Integer r = 100;
		System.out.println(list.remove(r));
		
//		size() 리스트의 총 갯수
		System.out.println(list.size());
		
//		contains() 값이 있는지 boolean값으로 알려줌
		System.out.println(list.contains(10));
		
//		clear() 리스트 비우기
		list.clear();
		System.out.println(list);
		
//		isEmpty() 리스트 비웠는지 확인
		System.out.println(list.isEmpty());
		
	}

}
