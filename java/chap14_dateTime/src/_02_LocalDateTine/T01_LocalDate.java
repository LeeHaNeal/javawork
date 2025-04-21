package _02_LocalDateTine;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth() + "월");
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue()+"월");
		System.out.println(today.getDayOfMonth()+"일");
		System.out.println("365일중 "+today.getDayOfYear()+"월");
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());
		
		
		
		
		System.out.println("이달은 총 " + today.lengthOfMonth() + "일까지 이다");
		
		System.out.println("올해는 윤년인가? " + today.isLeapYear());
		
		
		
		
	}

}
