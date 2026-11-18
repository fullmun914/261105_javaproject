package day07;

public class MultiArray02 {

	public static void main(String[] args) {
//		2차원 배열
//		1 2 3\n 4 5 6\n 7 8 9\n 10 11 12\n 13 14 15
		int arr[][] = new int[5][3], count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				count++;
				System.out.print(count+"\t");
			}
			System.out.println();
		}
	}

}
