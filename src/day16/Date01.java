package day16;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR); // 멤버변수가 static에 final
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year+"/"+(month+1)+"/"+day);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		System.out.println(time.getYear());
		System.out.println(time.getMonth());
		System.out.println(time.getMonthValue());
		System.out.println(time.getDayOfMonth());
		System.out.println(time.toLocalDate());
		
		LocalDateTime birth = LocalDateTime.of(2009, 9,30,8,30);
		System.out.println(birth);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
		long days = ChronoUnit.DAYS.between(time, birth);//일 차이
		System.out.println(days);
		long months = ChronoUnit.MONTHS.between(time, birth); //개월 차이
		
		Duration.between(time, birth); //두시간 사이 간격
		Period.between(date, date); //두 날짜 사이 간격
	}

}
