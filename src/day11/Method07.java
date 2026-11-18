package day11;

public class Method07 {
	
	public int sum(int...num) {
		int result = 0;
		for(int tmp:num) {
			result+=tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method07 m = new Method07();
		System.out.println(m.sum(1,2,3,4,5,6,7,8,9));
	}

}
