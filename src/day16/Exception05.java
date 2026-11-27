package day16;

public class Exception05 {

	public static void main(String[] args) {
		try {
			int arr[]=null;
			System.out.println(arr[0]);
			System.out.println(3/0);
		}catch(NullPointerException e){
			System.out.println("객체가 null입니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다 ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
