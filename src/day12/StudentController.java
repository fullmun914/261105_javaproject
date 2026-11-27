package day12;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController implements StudentProgram {

	private int stuIndex, subIndex, menu;
	Student stu[] = new Student[stuIndex + 1];
	Subject sub[] = new Subject[subIndex + 1];

	@Override
	public void insertStudent(Scanner scan) {
		System.out.print("등록할 학생의 이름 : ");
		stu[stuIndex].setName(scan.next());
		System.out.print("등록할 학생의 전화번호 : ");
		stu[stuIndex].setPhone(scan.next());
		System.out.print("등록할 학생의 학원 이름 : ");
		stu[stuIndex].setPhone(scan.next());
		System.out.print("등록할 학생의 학원 지점 : ");
		stu[stuIndex].setPhone(scan.next());
		System.out.println("--------SUBJECT LIST-------");
		for (int i = 0; i < sub.length; i++) {
			System.out.println((i + 1) + ". " + sub[i]);
		}
		System.out.println("---------------------------");
		do {
			System.out.println("들을 과목 : (그만 입력하고싶을 시 0)");
			menu = scan.nextInt();
			for (int i = 0; i < stu.length; i++) {
//				stu[]
			}
		} while (menu != 0);
		stuIndex++;
	}

	@Override
	public void printStudentList() {
		System.out.println("--------STUDENT LIST-------");
		System.out.println("이름\t전화번호\t학원\t지점\t듣고있는 과목");
		for (int i = 0; i < stu.length; i++) {
			System.out.println((i + 1) + ". " + stu[i]);
		}
		System.out.println("---------------------------");
	}

	@Override
	public void searchStudent(Scanner scan) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getName().equals(scan)) {
				System.out.println(stu[i]);
			}
		}
	}

	@Override
	public void insertSubject(Scanner scan) {
		System.out.print("등록할 과목의 이름 : ");
		sub[subIndex].setSubName(scan.next());
		System.out.print("등록할 과목 학습 기간 : ");
		sub[subIndex].setPer(scan.next());
		System.out.print("등록할 과목 학습 요일 : ");
		sub[subIndex].setWeek(scan.next());
		System.out.print("등록할 과목의 강의실 : ");
		sub[subIndex].setPlace(scan.next());
		subIndex++;
	}

	@Override
	public void selectSubject(Scanner scan) {
		int stuNum = 0;
		a: do {
		System.out.println("수강할 학생의 이름 : ");
		for(int i=0;i<stu.length;i++) {
			if(stu[i].getName().equalsIgnoreCase(scan.next())) {
				stuNum=i;
				break a;
			}else {
				System.out.println("존재하지 않는 학생입니다. 다시 입력해주세요.");
			}
		}}while(true);
		System.out.println("--------SUBJECT LIST-------");
		System.out.println("과목\t기간\t요일\t강의실");
		for (int i = 0; i < sub.length; i++) {
			System.out.println((i + 1) + ". " + sub[i]);
		}
		System.out.println("---------------------------");
		System.out.print("몇번 과목을 수강하시겠습니까? > ");

	}

	@Override
	public void deleteSubject(Scanner scan) {

	}

}
//1. 학생 클래스 (Student)
//- 한 학생의 정보를 나타내는 클래스
//- 멤버변수 : 이름, 전화번호, 학원이름, 지점, 수강과목[] (Subject[])

class Student {
	protected String name, phone, academy, branch, subject[];

	public Student() {
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

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		for (int i = 0; i < this.subject.length; i++) {
			if (this.subject[i] == null) {
				this.subject[i] = subject;
				return;
			}
		}
		if (this.subject[this.subject.length - 1] != null) {
			String[] tmp = new String[this.subject.length + 3];
			System.arraycopy(subject, 0, tmp, 0, this.subject.length);
			this.subject = tmp;
			this.subject[this.subject.length-3] = subject;
		}
	}

	@Override
	public String toString() {
		return name + "\t" + phone + "\t" + academy + "\t" + branch + "\t" + Arrays.toString(subject);
	}

}

//2. 수강 클래스 (Subject)
//- 학생이 신청할 수 있는 강의 정보를 저장하는 클래스
class Subject {
	protected String subName, per, week, place;

	public Subject() {
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", per=" + per + ", week=" + week + ", place=" + place + "]";
	}
}