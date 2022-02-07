import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date(0);
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm�� ss��");
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
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
			case Calendar.WEDNESDAY:
				strWeek = "��";
			case Calendar.THURSDAY:
				strWeek = "��";
			case Calendar.FRIDAY:
				strWeek = "��";
			case Calendar.SATURDAY:
				strWeek = "��";
			default:
				strWeek = "��";
		}
		
		int amPm = now2.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		}else {
			strAmPm = "����";
		}
		
		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		int second = now2.get(Calendar.SECOND);
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "��");
		

	}

}
