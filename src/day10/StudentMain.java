package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int person = 0, academy = 0, sub = 0;
		System.out.println("무엇을 하시겟습니까?");
		System.out.println("1. 입력 | 2. 출력 | 3. exit");
		int work = s.nextInt();
		if (work == 1) {
			System.out.println("무엇을 입력하시겟습니까?");
			System.out.println("1. 학생정보 | 2. 학원정보 | 3. 강의정보 | 4. exit");
			int info = s.nextInt();
			Student stu[] = new Student[person];
			switch (info) {
			case 1:
				System.out.print("몇명의 학생을 입력하시겠습니까? > ");
				person = s.nextInt();
				for (int i = 0; i < person; i++) {
					System.out.println("학생의 이름, 전화번호, 주소, 생일을 입력해주세요 > ");
					String name = s.next();
					String phone = s.next();
					String add = s.next();
					int birth = s.nextInt();
					stu[i] = new Student(name, phone, add, birth);
				}
				break;
			case 2:
				System.out.print("몇개의 지점을 입력하시겠습니까? > ");
				academy = s.nextInt();
				for (int i = 0; i < academy; i++) {
					System.out.println("지점(지역)을 입력해주세요 > ");
					String acAdd = s.next();
					stu[i] = new Student(acAdd);
				}
				break;
			case 3:
				System.out.print("몇개의 강좌정보 입력하시겠습니까? > ");
				sub = s.nextInt();
				for (int i = 0; i < sub; i++) {
					System.out.println("강좌정보를 입력해주세요 > ");
					String subject = s.next();
					String per = s.next();
					stu[i] = new Student(i, subject, per);
				}
				break;
			case 4 :
				System.out.println("뒤로가기");
				break;
			default:
				break;
			}
		}else if(work == 2){
			System.out.println("무엇을 출력하시겟습니까?");
			System.out.println("1. 학생정보 | 2. 학원정보 | 3. 강의정보 | 4. Exit");
			int info = s.nextInt();
			Student stu[] = new Student[person];
			switch (info) {
			case 1:
				for(int i=0 ; i<person; i++) {
					stu[i].person();
				}
				break;
			case 2:
				for(int i=0 ; i<academy; i++) {
					stu[i].academy();
				}
				break;
			case 3:
				for(int i=0 ; i<sub; i++) {
					stu[i].sub();
				}
				break;
			case 4 :
				System.out.println("뒤로가기");
				break;
			default:
				break;
			}
			
		}else {
			System.out.println("시스템종료");
		}
		s.close();
	}

}
