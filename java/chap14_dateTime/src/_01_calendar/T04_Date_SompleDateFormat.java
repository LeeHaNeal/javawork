package _01_calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class T04_Date_SompleDateFormat {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		
		// SimpleDateFormat클래스 : 날짜에 대한 포맷을 제공
		// yyyy : 년도 4자리 , yy : 년도2자리(뒷자리)
		// MM : 월 2자리, M : 월 1자리 
		// mm : 분 2자리, m : 분 1자리
		// dd : 일 2자리, d : 일 1자리
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf4.format(today));
		
		// hh : 시(12시간제 0~11) , HH : 24시간제(0~24)
		// mm : 분
		// ss : 초
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(sdf6.format(today));
		
		// E : 요일
		SimpleDateFormat sdf7 = new SimpleDateFormat("yy-MM-dd E");
		System.out.println(sdf7.format(today));
		
		
		
		
		
		
		
		
		String str = "20250724";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMDD");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-DD");
		
		
		
		
		
		Date strNow;
		try {
			strNow = sdf8.parse(str);
			System.out.println(sdf9.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date d1 = new Date(2025,5,7);
		d1.setMonth(7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
