import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date(0);
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		Calendar now2 = Calendar.getInstance();
		
		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) +1;
		int day = now2.get(Calendar.DAY_OF_MONTH);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
			case Calendar.WEDNESDAY:
				strWeek = "수";
			case Calendar.THURSDAY:
				strWeek = "목";
			case Calendar.FRIDAY:
				strWeek = "금";
			case Calendar.SATURDAY:
				strWeek = "토";
			default:
				strWeek = "일";
		}
		
		int amPm = now2.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		int second = now2.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		

	}

}
