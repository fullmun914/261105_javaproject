package day10;

import java.util.Arrays;

public class Student_t {
	/* 학생 정보를 관리하기 위한 클래스 생성
	 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
	 * 학원정보 : 학원명(final) = "더조은", 지점 
	 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
	 * 		수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
	 * 		같은 번지는 같은 값으로 인지
	 * 
	 * ex) 홍길동, 010-1111-111, 인천, 000505
	 * 		더조은, 인천지점
	 * 		JAVA,	26.10.01 ~ 26.11.01 
	 * 		AI풀스택, 26.11.02 ~ 27.05.17 <- 추가되는 정보
	 * 
	 * 과목을 추가하는 메서드
	 * - 수강과목이 5개를 넘어가면 배열을 늘려서 처리 (중복가능)
	 *  
	 * 각 정보를 출력하는 메서드
	 * - 수강정보 출력시 수강정보가 없다면.. => 수강정보가 없습니다. (출력)
	 * 
	 * getter/setter , toString, 생성자 
	 * */
	// 학생정보 : 이름, 전화번호, 주소, 생년월일
	private String name;
	private String phone;
	private String address;
	private String birth;
	
	// 학원정보 : 학원명(final) = "더조은", 지점 
	// final : 회사명, 브랜드, 로고 (상수) : 모두대문자
	private final String COMPANY = "더조은";
	private String branch;
	
//	수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
//	 * 		수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
//	 * 		같은 번지는 같은 값으로 인지
	private String[] course = new String[5];
	private String[] period = new String[5];
	
	// 멤버변수에 배열이 존재한다면 index 변수를 함께 쓰는것이 편리
	private int index;
	
	// 생성자
	public Student_t() {}  // 기본 생성자
	
	public Student_t(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

//	public Student(String name, String phone, String address, String birth, String branch) {
//		super(); // 조상의 생성자 호출
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//		this.birth = birth;
//		this.branch = branch;
//	}
	
	public Student_t(String name, String phone, String address) {
		this(name, phone);
		this.address = address;
	}
	
	public Student_t(String name, String phone, String address, String birth, String branch) {
		// 생성자 호출  this()
		this(name, phone, address);
		//this.address = address;
		this.birth = birth;
		this.branch = branch;
	}
	
	// 출력메서드
	public void printInfo() {
		// 학생의 기본정보 출력
		System.out.println("--학생정보--");
		System.out.println(name+"("+birth+") "+phone);
	}
	
	public void printCompany() {
		System.out.println("--학원정보--");
		System.out.println(COMPANY+"["+branch+"]");
	}
	
	public void printCourse() {
		// 수강과목이 없다면... index == 0
		if(index == 0) {
			System.out.println("수강과목이 없습니다.!!");
			return;
		}
		// 출력은 index 까지만...
		for(int i=0; i<index; i++) {
			System.out.println(course[i]+ " / "+ period[i]);
		}
	}
	
	// 수강과목 추가 메서드
	// 1번 호출될 때 마다 수강과목 / 기간  추가
	public void insertCourse(String course, String period) {
		// 배열이 다 차면....
		if(index == this.course.length) {
			// 배열 복사 => 늘리기
			String[] courseTemp = new String[this.course.length+3];
			String[] periodTemp = new String[this.period.length+3];
			
			// arraycopy
			System.arraycopy(this.course, 0, courseTemp, 0, this.course.length);
			System.arraycopy(this.period, 0, periodTemp, 0, this.period.length);
			
			// 기존 배열의 참조 변수의 객체 덮어쓰기
			this.course = courseTemp;
			this.period = periodTemp;
			
		}
		this.course[index] = course;
		this.period[index] = period;
		index++;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public String getCOMPANY() {
		return COMPANY;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + ", birth=" + birth + ", COMPANY="
				+ COMPANY + ", branch=" + branch + ", course=" + Arrays.toString(course) + ", period="
				+ Arrays.toString(period) + ", index=" + index + "]";
	}
	


	public static void main(String[] args) {
		/* 학생 정보를 관리하기 위한 클래스 생성
		 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
		 * 학원정보 : 학원명(final) = "더조은", 지점 
		 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
		 * 		수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
		 * 		같은 번지는 같은 값으로 인지
		 * 
		 * ex) 홍길동, 010-1111-111, 인천, 000505
		 * 		더조은, 인천지점
		 * 		AI풀스택, 26.11.02 ~ 27.05.17
		 * 		JAVA,	26.10.01 ~ 26.11.01 
		 * */
		Student_t s = new Student_t("홍길동", "010-1111-1111");
		Student_t s1 = new Student_t("김영이", "010-1111-2222", "인천", "000505", "부평");
		Student_t s2 = new Student_t("철수", "010-1111-3333", "부천", "000505", "부평");
		Student_t s3 = new Student_t("영철", "010-1111-4444", "인천", "000505", "부평");
		Student_t s4 = new Student_t("순이", "010-1111-5555", "서울", "000505", "신촌");
		Student_t s5 = new Student_t("승철", "010-1111-6666", "인천", "000505", "부평");
		
//		s.printInfo();
//		s.printCompany();
//		s.printCourse();
		
		System.out.println();
		s1.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s1.insertCourse("java", "26.10.01 ~ 26.11.01");
		s2.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s2.insertCourse("java", "26.10.01 ~ 26.11.01");
		s3.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s3.insertCourse("java", "26.10.01 ~ 26.11.01");
		
		Student_t[] student_t = new Student_t[6];
		student_t[0] = s;
		student_t[1] = s1;
		student_t[2] = s2;
		student_t[3] = s3;
		student_t[4] = s4;
		student_t[5] = s5;
		
//		for(int i=0; i<student.length; i++) {
//			System.out.println(student[i]);
//		}
		
		// 인천사는 학생만 출력 - 학원정보, 학생정보
		
		
		// AI풀스택 과정을 수강하는 학생만 출력 - 학생정보, 수강정보
		
		
		
//		s1.printCompany();
//		s1.printInfo();
//		s1.printCourse();
		
		
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		
	}}

