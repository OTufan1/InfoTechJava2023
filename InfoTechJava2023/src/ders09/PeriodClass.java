package ders09;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(1997,5,15);
		
		Period period =Period.between(date2, date1);
		System.out.println(period);
		System.out.println(period.getYears()); 
		System.out.println(period.toTotalMonths());
		System.out.println(period.isNegative());
		System.out.println(period.isZero());

	}

}
