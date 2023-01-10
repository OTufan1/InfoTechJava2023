package ders9;

import java.time.LocalTime;
import java.time.ZoneId;

public class Time {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now(); //Sistemin saatini kullanir.
		
		System.out.println(time);
		
		System.out.println(time.plusHours(3));
		System.out.println(time.minusMinutes(10));
		System.out.println(time.getSecond());

		System.out.println(time.now(ZoneId.of("Turkey")));
		System.out.println(time.now(ZoneId.of("Europe/London")));
		System.out.println(time.now(ZoneId.of("Japan")));
		System.out.println(time.now(ZoneId.of("Europe/Istanbul")));
		System.out.println(time.now(ZoneId.of("Asia/Tokyo")));
		System.out.println(time.now(ZoneId.of("Africa/Cairo")));
	
	}

}
