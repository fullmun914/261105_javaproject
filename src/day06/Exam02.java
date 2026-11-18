package day06;


public class Exam02 {

	public static void main(String[] args) {
//		검색어를 입력하면 해당 검색어를 포함하는 파일 출력(contains)
//		검색어를 포함하는 파일이 없다면 >> 일치하는 항목이 없습니다.
//		Scanner next() -> 한 단어 입력받기
//		대소문자 구분없이
//		확장자 jpg, png만 출력
		int count=0;
		String fileName[] = {"이것이자바다.java","java의정석.java","array.txt",
				"array.java","String.txt","StringMethod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"};
		System.out.print("검색하고 싶은 파일확장자명을 입력해주세요 : ");
		System.out.println("검색결과 > ");
		for(String tmp : fileName) {
			if("jpg".equals(tmp.toLowerCase().substring(tmp.lastIndexOf(".")+1))||"png".equals(tmp.toLowerCase().substring(tmp.lastIndexOf(".")+1))) {
				System.out.println(tmp);
				count++;
			}
		}
		if(count==0) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

}
