package day01;

public class Operator2 {

	public static void main(String[] args) {
		int kor = 70, eng = 85, math = 20, total;
		total = kor+eng+math;
		double avg = total/3.0;
		String res = (avg>=60?"합격":"불합격");
		System.out.println("세 점수의 결과는 : "+total);
		System.out.println("세 점수의 평균은 : "+avg);
		
		System.out.println("합격 여부 : "+res);
	}

}
