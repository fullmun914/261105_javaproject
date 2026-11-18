package day11;

public class Method06 {
	
	public int sum(int num1, int num2){
		return num1+num2;
	}
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public static void main(String[] args) {
		Method06 m = new Method06();
		System.out.println(m.sum(5, 7));
	}

}
