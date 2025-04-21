package _03_enum;

import java.util.Calendar;

public class T03_enumWeek {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		Week week = null;
		switch(day) {
		case 0 :
			week = week.MONDAY;
			break;
		case 1 :
			week = week.TUESDAY;
			break;
		case 2 :
			week = week.WEDNESDAY;
			break;
		case 3 :
			week = week.THURSDAY;
			break;
		case 4 :
			week = week.FRIDAY;
			break;
		case 5 :
			week = week.SATURDAY;
			break;
		case 6 :
			week = week.SUNDAY;
			break;
			}
		if (week == Week.SUNDAY) {
            System.out.println("일요일엔 짜파게티 먹는날");
        } else {
            System.out.println("아주 열심히 자바 공부 하는날");
        }
		
	}

}
