package ders09;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //sistemdeki tarih
		
//		System.out.println(date);
//		System.out.println(date.plusDays(4));
//		System.out.println(date.plusWeeks(3));
//		System.out.println(date.plusMonths(2));
//		System.out.println(date.plusYears(1));
//
//		System.out.println(date.plusDays(4).plusWeeks(3).plusMonths(2).plusYears(1));
//		
//		System.out.println(date.getYear());
//		System.out.println(date.getMonth());
//		System.out.println(date.getMonthValue());
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getDayOfYear());
//		System.out.println(date.getDayOfWeek());
		
//		System.out.println(date.minusDays(3));
//		System.out.println(date.minusMonths(4));
//		System.out.println(date.minusYears(23));
//		System.out.println(date.plusWeeks(3).minusDays(4).plusYears(3));
//
//		System.out.println(date.isLeapYear());
		
		LocalDate date2 = LocalDate.of(2020, 02, 04); // belirlediginiz tarih

		System.out.println(date2);
		System.out.println(date.isBefore(date2));
		
		String str = date2.toString();
		
		System.out.println(str.charAt(0));
	
	}

}
