
package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController sc = new StudentController();
		int menu = 0;
		try {
			do {
				System.out.println("-------------------------MENU-------------------------");
				System.out.println("1. 학생등록\t2. 학생리스트\t3. 학생조회");
				System.out.println("4. 강좌등록\t5. 수강신청\t6. 수강취소\t7. 종료");
				System.out.print("선택 > ");
				menu = scan.nextInt();

				switch (menu) {
				case 1:
					sc.insertStudent(scan);
					break;
				case 2:
					sc.printStudentList();
					break;
				case 3:
					sc.searchStudent(scan);
					break;
				case 4:
					sc.insertSubject(scan);
					break;
				case 5:
					sc.selectSubject(scan);
					break;
				case 6:
					sc.deleteSubject(scan);
					break;
				case 7:
					System.out.println("종료!!");
					break;
				default:
					System.out.println("잘못된 메뉴입니다!");
					break;
				}
			} while (menu != 7);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

		scan.close();
	}

}
