package day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {
	public static void main(String[] args){
//		과목, 점수 입력받는 map 만들기
//		종료키워드 나올때까지 반복(1. 계속, 0. 종료)
//		출력, 합계, 평균
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int op = -1, op2 = -1, sum=0;
		do {
			System.out.println("입력하시겠습니까? > (1. 계속, 0. 종료)");
			op = s.nextInt();
			if(op==0) {
				break;
			}
			System.out.println("과목, 점수를 순서대로 입력하십시오 (띄어쓰기로 구분)");
			s.nextLine();
			String subScore[] = s.nextLine().split(" ");
			while(Integer.parseInt(subScore[1])<0||Integer.parseInt(subScore[1])>100) {
				System.out.println("점수의 범위가 잘못되었습니다. 다시 입력해주세요.");
				subScore = s.nextLine().split(" ");
			}
			if (map.containsKey(subScore[0])) {
				System.out.println("이미 입력한 과목입니다. 점수를 덮어씌우겠습니까? > (1. 네, 2. 아니오)");
				op2 = s.nextInt();
			}
			if (op2 == 0) {
				System.out.println(subScore[0]+" 과목의 점수를 덮어쓰지 않고 넘어갑니다.");
				continue;
			}else if(op2==1){
				System.out.println(subScore[0]+" 과목의 점수를 덮어씁니다.");
			}
			map.put(subScore[0],Integer.parseInt(subScore[1]));
		} while (op != 0);
		
		System.out.println("-------------------------------");
		for(String i : map.keySet()) {
			System.out.println(i+" : "+map.get(i)+"점");
			sum+=map.get(i);
		}
		if(map.size()==0) {
			System.out.println("입력된 과목이 없습니다.");
		}else {
			System.out.println("-------------------------------");
			System.out.println("총 합 : "+sum+"점");
			System.out.println("평균 : "+((double)sum/map.size())+"점");			
		}

		s.close();
	}

}
