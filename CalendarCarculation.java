package cCalendar;

import java.util.Calendar;

public class CalendarCarculation {

	public CalendarCarculation() {
		String year = "2019";
		String month = "1";

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, Integer.valueOf(year));
		cal.set(Calendar.MONTH, Integer.valueOf(month));
		cal.set(Calendar.DAY_OF_MONTH, 1);

		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);

		cal.set(Calendar.DAY_OF_MONTH, 32);
		int lastday = 32 - cal.get(Calendar.DAY_OF_MONTH);

		int i = 0;

		for (; i < dayofweek - 1; i++) {
			System.out.print(" ");
		}
		for (int day = 1; day <= lastday; day++, i++) {
			if (i % 7 == 0) {
				if (day != 1)
					System.out.printf("\n");
			} else if (i % 7 == 6) {
				if (day < 10)
					System.out.print(" " + day);
				else
					System.out.print(day);
			}
			if (i % 7 != 6 && day != lastday) {
				if (day < 10)
					System.out.print(" " + day + " ");
				else
					System.out.print(day + " ");
			} else if (day == lastday && i % 7 != 0) {
				if (day < 10)
					System.out.print(" " + day);
				if (i % 7 != 6)
					System.out.print(day);
			} else if (day == lastday && i % 7 == 0) {
				if (day < 10)
					System.out.print(" ");
				else
					System.out.print("");
			}
		}
	}

}
