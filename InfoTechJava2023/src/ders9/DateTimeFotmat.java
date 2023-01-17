package ders9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFotmat {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy");
		/*
		 *  M==>Months, m==>minutes
		 *  
		 *  M==>Kacinci ay oldugu (3-4-vs)
		 *  MM==>Kacinci ay oldugu (02-03-vs)
		 *  MMM==>Ayin isminin ilk uc karakteri (Jan,Feb)
		 *  MMMM==>Ayin ismi
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(dtf.format(date));
		System.out.println(dtf.format(date.plusMonths(6)));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
		/*
		 * hh==> am-pm formatinda
		 * HH==> 24 saat formatinda
		 */
		
		LocalTime time = LocalTime.now();
		System.out.println(dtf2.format(time));
		System.out.println(dtf2.format(time.plusHours(6)));
	}

}
