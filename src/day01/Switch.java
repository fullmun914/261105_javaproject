package day01;

public class Switch {

	public static void main(String[] args) {
		int number = 6;
		switch(number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default : 
			System.out.println("이상한 수");
		}
		
		int num = 8;
		switch(num) {
		case 1:
			System.out.println(num+"칸 전진");
			break;
		case 2:
			System.out.println(num+"칸 전진");
			break;
		case 3:
			System.out.println(num+"칸 전진");
			break;
		case 4:
			System.out.println(num+"칸 전진");
			break;
		case 5:
			System.out.println(num+"칸 전진");
			break;
		case 6:
			System.out.println(num+"칸 전진");
			break;
		default :
			System.out.println("다시 입력하세요.");
			
		}
		
		switch(num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num+"칸 전진");
			break;
		default:
			System.out.println("다시 입력하세요.");
		}
		
		if(num>0&&num<6) {
			System.out.println(num+"칸 전진");
		}else{
			System.out.println("다시 입력하세요.");
		}
		
		int month = 11;
//		3~5 봄 6~8 여름 9~11 가을 12~2 겨울
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을");
			break;
		default :
			System.out.println("존재하지 않는 달입니다.");
		}
		
	}
}
