package studentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController implements StudentProgram {

	private int stuIndex, subIndex, op, index;
	Student[] stu = new Student[10];
	private List<Student> stuList = new ArrayList<>();
	Subject[] sub = new Subject[10];
	private List<Subject> subList = new ArrayList<>();

	@Override
	public void insertStudent(Scanner scan) {
		if (stu[9] != null) {
			Student[] tmp = new Student[stu.length + 3];
			System.arraycopy(stu, 0, tmp, 0, stu.length);
			stu = tmp;
		}
		System.out.print("등록할 학생 이름 : ");
		String name = scan.next();
		do {
			System.out.print("계속 등록하시겠습니까? (계속 : 1, 종료 : 0) > ");
			op = scan.nextInt();
			if (op == 1) {
				System.out.print("등록할 학생의 전화번호 : ");
				String phone = scan.next();
				System.out.print("등록할 학생의 생년월일 : ");
				String birth = scan.next();
				System.out.print("등록할 학생의 주소 : ");
				String address = scan.next();
				stu[stuIndex] = new Student(name, phone, birth, address);
				System.out.println(name + " 학생의 정보가 저장되었습니다.");
				stuIndex++;
			} else if (op == 0) {
				System.out.println(name + " 학생의 정보가 저장되었습니다.");
				stu[stuIndex] = new Student(name);
				stuIndex++;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (op != 0 && op != 1);
	}

	@Override
	public void printStudentList() {
		System.out.println("---------------STUDENT LIST--------------");
		if (stu[0] == null) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for (int i = 0; i < this.stu.length; i++) {
			if (this.stu[i] == null) {
				break;
			}
			stu[i].printStudent();
			stu[i].printCourse();
		}
		System.out.println("-----------------------------------------");
	}

	@Override
	public void searchStudent(Scanner scan) {
		index = 0;
		System.out.print("검색할 학생의 이름 : ");
		String name = scan.next();
		for (int i = 0; i < this.stu.length; i++) {
			if (this.stu[i] == null) {
				if (index == 0) {
					System.out.println(name + " 학생은 존재하지 않습니다.");
				}
				break;
			}
			if (stu[i].getStudentName().equals(name)) {
				index++;
				stu[i].printStudent();
				stu[i].printCourse();
			}
		}
	}

	@Override
	public void insertSubject(Scanner scan) {
		if (sub[9] != null) {
			Subject[] tmp = new Subject[sub.length + 3];
			System.arraycopy(stu, 0, tmp, 0, sub.length);
			sub = tmp;
		}
		System.out.print("등록할 과목 이름 : ");
		String subject = scan.next();
		do {
			System.out.print("계속 등록하시겠습니까? (계속 : 1, 종료 : 0) > ");
			op = scan.nextInt();
			if (op == 1) {
				System.out.print("등록할 과목의 강사 : ");
				String teacher = scan.next();
				System.out.print("등록할 과목의 강의요일 : ");
				String day = scan.next();
				System.out.print("등록할 과목의 강의기간 : ");
				String period = scan.next();
				sub[subIndex] = new Subject(subject, teacher, day, period);
				System.out.println(subject + " 강좌의 정보가 저장되었습니다.");
				subIndex++;
			} else if (op == 0) {
				System.out.println(subject + " 강좌의 정보가 저장되었습니다.");
				sub[subIndex] = new Subject(subject);
				subIndex++;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (op != 0 && op != 1);
	}

	public void printSubjectList() {
		System.out.println("---------------SUBJECT LIST--------------");
		if (sub[0] == null) {
			System.out.println("등록된 강좌가 없습니다.");
		}
		for (int i = 0; i < this.sub.length; i++) {
			if (this.sub[i] == null) {
				break;
			}
			sub[i].printSubject();
		}
		System.out.println("-----------------------------------------");
	}
	
	public void printSubList() {
		System.out.println("과목 목록");
		for(Subject s : subList) {
			s.printSubject();
		}
	}
	public void printStuList() {
		System.out.println("과목 목록");
		for(Student s : stuList) {
			s.printStudent();
		}
	}
	@Override
	public void selectSubject(Scanner scan) {
		index = 0;
		this.printStudentList();
		System.out.print("강의를 추가할 학생의 번호 > ");
		int num = scan.nextInt();
		for (int i = 0; i < this.stu.length; i++) {
			if (this.stu[i] == null) {
				if (index == 0) {
					System.out.println("존재하지 않는 번호입니다.");
				}
				break;
			}
			if (stu[i].getStudentNum() == num) {
				index++;
				this.printSubjectList();
				System.out.print("수강할 강의의 번호 > ");
				int num2 = scan.nextInt();
				while (sub[num2 - 1] == null) {
					System.out.println("존재하지 않는 번호입니다.");
					num2 = scan.nextInt();
				}
				stu[i].addSubject(sub[num2 - 1]);
				System.out.println(num2+"번 강의가 추가되었습니다.");
			}
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {
		index = 0;
		this.printStudentList();
		System.out.print("강의를 취소할 학생의 번호 > ");
		int num = scan.nextInt();
		for (int i = 0; i < this.stu.length; i++) {
			if (this.stu[i] == null) {
				if (index == 0) {
					System.out.println("존재하지 않는 번호입니다.");
				}
				break;
			}
			if (stu[i].getStudentNum() == num) {
				index++;
				stu[i].printCourse();
				System.out.print("취소할 강의의 번호 > ");
				int num2 = scan.nextInt();
				while (sub[num2 - 1] == null) {
					System.out.println("존재하지 않는 번호입니다.");
					num2 = scan.nextInt();
				}
				stu[i].removeSubject(num2);
				System.out.println(num2+"번 강의가 삭제되었습니다.");
			}
		}
	}

}