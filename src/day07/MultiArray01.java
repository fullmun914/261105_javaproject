package day07;

public class MultiArray01 {

	public static void main(String[] args) {
//		다차원 배열
//		배열타입[행] 배열명 = 1차원 배열{1,2,3}
//		배열타입[행][열] 배열명 = 2차원 배열{{1,2,3},{4,5,6}}
//		배열타입[면][행][열] 배열명 = 3차원 배열
		int [][]arr = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
