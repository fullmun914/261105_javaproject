package day09;

import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Car c = new Car();
		System.out.println("차 이름과 연식을 입력하세요.");
		String carInf[] = s.nextLine().split(" ");
		Car infoC = new Car(carInf[0],Integer.parseInt(carInf[1]));
		infoC.printInfo();
		infoC.powerPnt();
		a: while (true) {
			System.out.println("0 : power on/off | -1 : Speed down | 1 : Speed Up | default : 프로그램 종료");
			System.out.print("작동하세요 > ");
			int work = s.nextInt();
			switch (work) {
			case -1:
				c.speedDown();
				break;
			case 0:
				c.power();
				break;
			case 1:
				c.speedUp();
				break;
			default:
				System.out.println("프로그램이 종료됩니다.");
				break a;
			}
		}
		s.close();

	}

}

class Car {
//	기능 : 시동 켜기 / 시동 끄기 , 속도 업 / 다운 => 10씩, 
//	일반속성 : 차 이름, 연식
	private boolean power;
	private int year, speed;
	private String name;
	
//	기본생성자
	public Car(){}
	
//	매개변수로 이름과 연식을 받아 세팅
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
//	정보 출력
	public void printInfo() {
		System.out.println("차 이름 : "+this.name+", 연식 : "+this.year+"년식");
	}

//	시동 켜기/ 끄기
	public void power() {
		if (this.speed > 0) {
			System.out.println("속도부터 줄여주세요");
		} else {
			this.power = !(this.power);
			if (this.power) {
				System.out.println("시동이 켜졌습니다.");
			} else {
				System.out.println("시동이 꺼졌습니다.");
			}
		}
	}
	public void powerPnt() {
		if(power) {
			System.out.println("On | speed : "+this.speed+"km/h");
		}else {
			System.out.println("Off | speed : "+this.speed+"km/h");
		}
	}

	public void speedUp() {
		if (!(this.power)) {
			System.out.println("시동 먼저 켜주세요");
		} else if (this.speed >= 200) {
			System.out.println("최대 속력입니다. 더 이상 올라가지 않습니다.");
		} else {
			this.speed += 20;
			System.out.println("현재 스피드는 " + this.speed + "km/h입니다.");
		}
	}

	public void speedDown() {
		if (!(this.power)) {
			System.out.println("시동 먼저 켜주세요");
		} else if (this.speed <= 0) {
			System.out.println("속력이 0입니다.");
		} else {
			this.speed -= 20;
			System.out.println("현재 스피드는 " + this.speed + "km/h입니다.");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}
}
