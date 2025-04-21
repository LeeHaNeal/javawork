package _02_LocalDateTine;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T04_zoned {

	public static void main(String[] args) {
		
		ZonedDateTime seoulIDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulIDT);
		
		ZonedDateTime londonIDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonIDT);
		
		ZonedDateTime newYorkIDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkIDT);
		
		
		
		// 기준시간
		
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		
		// calendar 사용
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angles");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now);
		
		
		
		
		
		
		
		
		
		
			

	}

}
