package _02_LocalDateTine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		
		LocalDateTime startday = LocalDateTime.of(2024,12,30,10,0,0);
		LocalDateTime endday = LocalDateTime.of(2025,7,21,18,30,0);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일 : " + startday.format(dtf));
		System.out.println("종료일 : " + endday.format(dtf));
		
		
		if(today.isBefore(endday)) {
			System.out.println("수업중");
		}else if(today.isAfter(endday)) {
			System.out.println("종료된 수업입니다.");
		}else if(today.isEqual(endday)) {
			System.out.println("오늘은 수업 종료날");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
