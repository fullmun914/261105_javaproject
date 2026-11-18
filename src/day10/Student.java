package day10;

public class Student {
//	학생 정보 관리 클래스 생성
//	학생의 기본정보 : 이름 전화번호 주소(동까지) 생년월일
//	학원정보 학원명(final "더조은") 지점
//	수강정보 수강과목[] 기간[](26.11.02 ~ 27.05.17)
//	수강과목은 여러과목을 들을 수 있다(과목, 기간 둘다 5개씩)
//	같은 번지는 같은 값으로 인지

//	ex) 홍길동 010-1111-1111 인천 000505
//	더조은, 인천
//	AI 풀스택 26.11.02 ~27.05.17
//	Java 26.10.01 ~ 26.11.01
//	과목 추가 메서드
//	각 정보 출력 메서드
//	수강정보 출력 시 수강정보가 없으면 "수강정보가 없습니다"
//	수강 과목이 5개를 넘어가면 배열 늘리기
	final private String academy = "더조은";
	private String name, phone, add, acAdd;
	private String subject[], per[] = new String[5];
	private int birth;

	public Student() {
	}

	public Student(String name, String phone, String add, int birth) {
		this.name = name;
		this.phone = phone;
		this.add = add;
		this.birth = birth;
	}
	public Student(String acAdd) {
		this.acAdd = acAdd;
	}
	public Student(int sub, String subject, String per) {
		if(sub<5) {
			this.subject[sub] = subject;
			this.per[sub] = per;
		}else {
			String[] arr = new String[this.subject.length+3];
			System.arraycopy(this.subject, 0, arr, 0, subject.length());
			System.arraycopy(this.per, 0, arr, 0, per.length());
			this.subject=arr;
			this.per = arr;
		}
	}

	public void person() {
		if (this.name == null) {
			System.out.println("수강정보가 없습니다.");
		} else {
			System.out.println(this.name + "+\t" + this.phone + "+\t" + this.add + "+\t" + this.birth);
		}
	}

	public void academy() {
		System.out.println(this.academy + "+\t" + this.acAdd);
	}
	
	public void sub() {
		if(this.subject==null) {
			System.out.println("수강정보가 없습니다.");
		}else {
			System.out.println(this.subject + "+\t" + this.per);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getAcAdd() {
		return acAdd;
	}

	public void setAcAdd(String acAdd) {
		this.acAdd = acAdd;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getPer() {
		return per;
	}

	public void setPer(String[] per) {
		this.per = per;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	
}
