package day01;

public class Exam2 {

	public static void main(String[] args) {
//		국, 영, 수 세 개의 점수를 입력하고 합계와 평균 출력
//		각 점수는 0~100점 사이여야만 한다 -> 아니면 계산되지 않고 점수가 잘못 입력 되었다 출력
//		60점 이상 합격, 아니면 불합격
		int kor=101, eng=45, math=94, total = kor+eng+math;
		double avg = total/3.0;
		boolean ver = kor<0||kor>100||eng<0||eng>100||math<0||math>100;
		String pass = (avg>=60 ? "합격":"불합격" );
		
		if(ver != true) {
			System.out.println("세 과목의 합 : " + total+"\n세 과목의 평균 : " + avg+"\n합격 여부 : " + pass);
		}else {
			System.out.println("잘못 입력된 값입니다.");
		}
		
		if(ver == true) {
			System.out.println("잘못 입력된 값입니다.");
		}else {
			System.out.println("세 과목의 합 : " + total);
			System.out.println("세 과목의 평균 : " + avg);
			System.out.println("합격 여부 : " + pass);
		}
				
	}

}
