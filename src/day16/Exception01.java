package day16;

public class Exception01 {

	public static void main(String[] args) {
		int a=10, b=0;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		try {
			System.out.println("try한 영역");
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
//			예외 발생 시점
			System.out.println(a/b);
			System.out.println(a%b);
		}catch(Exception e) {
//			예외가 발생할때에만 출력
			System.out.println("catch한 영역");
//			예외 발생여부를 알리는 출력
			e.getMessage(); //syso포함X 
			e.printStackTrace(); // 예외 문구 출력(syso포함)
			System.out.println("0으로 나누었습니다"); // 사용자 문구
		}
		System.out.println("try 바깥영역");
		System.out.println("이후 실행되어야 하는 구문");
	}

}
