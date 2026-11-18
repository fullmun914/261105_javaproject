package day04;

public class For05 {

	public static void main(String[] args) {
//		2단 출력
		for(int i=0;i<10;i++) {
			for(int j=2;j<10;j++) {
				if(i==0) {
					System.out.print("<<"+j+"단>> \t");
				}else
				System.out.print(j+"X"+i+"="+j*i+"\t");				
			}
			System.out.println();
		}
	}

}
