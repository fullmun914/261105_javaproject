package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		String arr1[] = {"a","e","i","o","u"};
		String arr2[] = {"b","c","d","f","g"};
		arr1[0] = "b";
		
		System.out.println("---------ARRAYS---------");
		System.out.println(Arrays.toString(arr1));
		
		List<String> list1= new ArrayList<>();
		list1 = Arrays.asList(arr1);
		
//		UnsupportedOperationException -> 지원하지 않는 작업 요청
//		list1.add("abc");
//		System.out.println("---------COPY LIST--------");
//		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>(Arrays.asList(arr1));
		
		list2.add("abc");
		System.out.println("------DEEP COPY TEST------");
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>(Arrays.asList(arr2));
		
		list2.addAll(list3);
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
	}

}
