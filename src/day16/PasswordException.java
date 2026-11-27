package day16;

public class PasswordException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	사용자 지정 범위 exception 생성
	public PasswordException(String message) {
		super(message);
	}
}
