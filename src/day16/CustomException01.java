package day16;

public class CustomException01 {

	public static void main(String[] args) {
//		PasswordException 만들기
		PasswordTest pt = new PasswordTest();
		String password1 = null;
		String password2 = "abc";
		String password3 = "abcdefg";
		String password4 = "abcd1234";
		String password5 = "abcd123!!";
		
		try {
			pt.setPassword(password3);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("test 종료");
	}

}

class PasswordTest{
//	1. 비밀번호는 null일 수 없다
//	2. 비밀번호의 길이는 5자 이상
//	3. 영문자, 숫자, 특수문자 한 개 이상 포함(정규표현식 사용해야 함)
//	RegExp
	private String password;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		if(password.length()<5) {
			throw new PasswordException("비밀번호의 길이가 5자 미만입니다.");
		}
		if(!password.matches("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()])[a-zA-Z0-9!@#$%^&*()]+$")){
			throw new PasswordException("비밀번호 형식에 맞지 않습니다.");
		}
	}
}
