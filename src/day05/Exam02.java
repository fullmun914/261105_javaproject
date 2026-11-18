package day05;

public class Exam02 {

	public static void main(String[] args) {
//		주민등록번호를 참고하여 생년월일, 성별, 나이 출력
		String regNum = "990101-2234567", gender=""; // 1900년생 1.남자 2.여자 / 2000년생 3.남자 4. 여자
		int birth = Integer.parseInt(regNum.substring(0,2)), age=0;
		char nGender = regNum.substring(regNum.indexOf("-")+1).charAt(0);
		if(birth<=26) {
			birth+=2000;
		}else {
			birth+=1900;
		}
		age = 2026-birth;
		switch(nGender) {
		case '1' ,'3': 
			gender="남자";
			break;
		case '2' ,'4': 
			gender="여자";
			break;
		default:
			break;
		}
		System.out.println("생년월일 : "+regNum.substring(0,6));
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
	}

}
