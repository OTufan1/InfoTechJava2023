package ders09;

import java.time.LocalDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		String str = dateTime.toString();
		System.out.println(dateTime);

	}

}
