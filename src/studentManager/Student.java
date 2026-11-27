package studentManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
	// 멤버변수 : 학번(기본키), 이름, 전화번호, 생년월일, 주소, 수강과목[] (Subject[])
	public static int stuCount;
	private int studentNum;
	private String studentName;
	private String studentPhone;
	private String studentbirth;
	private String studentAddress;
	// 학생 1명의 수강 신청 목록 배열
	private List<Subject> course = new ArrayList<Subject>();

	// 생성자
	public Student() {
	}

	public Student(String studentName, String studentPhone, String studentbirth, String studentAddress) {
		this.stuCount++;
		this.studentNum = stuCount;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentbirth = studentbirth;
		this.studentAddress = studentAddress;
	}

	public Student(String studentName) {
		this.stuCount++;
		this.studentNum = stuCount;
		this.studentName = studentName;
		this.studentPhone = "010-1111-0000";
		this.studentbirth = "000101";
		this.studentAddress = "인천시";
	}

	// 학생정보 출력 메서드 (학번, 이름, 전화번호)
	public void printStudent() {
		System.out.println("(" + studentNum + ") "+this.studentName +" " + studentPhone +" " + studentbirth +" " + studentAddress);
	}

	// 본인의 수강배열을 출력하는 메서드
	public void printCourse() {
		Iterator<Subject> it = course.iterator();
		System.out.println("\t--------COURSE LIST--------");
		if(it.hasNext()==false) {
			System.out.println("\t등록된 강의 없음");
		}
		while (it.hasNext()) {
			Subject tmp = it.next();
			System.out.print("\t");
			System.out.println(tmp);
		}
		System.out.println("\t---------------------------");
	}

	// controller에서 준 subject를 매개변수로 받아 내 수강배열에 추가하는 메서드
	public void addSubject(Subject s) {
		course.add(s);
	}

	public void removeSubject(int subjectCode) {
		// 수강 코드를 매개변수로 받아 course 배열에서 삭제하는 메서드
		course.remove(subjectCode-1);
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentbirth() {
		return studentbirth;
	}

	public void setStudentbirth(String studentbirth) {
		this.studentbirth = studentbirth;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject> getCourse() {
		return course;
	}

	public void setCourse(List<Subject> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentbirth=" + studentbirth + ", studentAddress=" + studentAddress + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, studentAddress, studentName, Integer.valueOf(studentNum), studentPhone,
				studentbirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) 
				&& Objects.equals(studentAddress, other.studentAddress)
				&& Objects.equals(studentName, other.studentName) && studentNum == other.studentNum
				&& Objects.equals(studentPhone, other.studentPhone) && Objects.equals(studentbirth, other.studentbirth);
	}

}

class Subject {
	public static int subCount;
	private int subjectCode;
	private String subjectName, subjectTeacher, subjectDay, subjectPeriod;

	public Subject() {
	}
	public Subject(String subjectName) {
		++subCount;
		this.subjectCode=subCount;
		this.subjectName = subjectName;
		this.subjectTeacher = "강사 미정";
		this.subjectDay = "요일 미정";
		this.subjectPeriod = "기간 미정";
	}

	public Subject(String subjectName, String subjectTeacher, String subjectDay, String subjectPeriod) {
		++subCount;
		this.subjectCode=subCount;
		this.subjectName = subjectName;
		this.subjectTeacher = subjectTeacher;
		this.subjectDay = subjectDay;
		this.subjectPeriod = subjectPeriod;

	}
	public void printSubject() {
		System.out.println("(" + subjectCode + ") "+this.subjectName);
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectTeacher() {
		return subjectTeacher;
	}
	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}
	public String getSubjectDay() {
		return subjectDay;
	}
	public void setSubjectDay(String subjectDay) {
		this.subjectDay = subjectDay;
	}
	public String getSubjectPeriod() {
		return subjectPeriod;
	}
	public void setSubjectPeriod(String subjectPeriod) {
		this.subjectPeriod = subjectPeriod;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	@Override
	public String toString() {
		return "("+subjectCode+") "+subjectName+" "+subjectTeacher+" "+subjectDay+" "+subjectPeriod;
	}
}