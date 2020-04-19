package com.gyana.datetime.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/*
 * In Java 8 there are 3 new date time classes.
 * LocalDate
 * LocalTime
 * LocalDateTime
 * All these classes are immutable.
 * 
 */

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDate a = LocalDate.of(2017, 1, 21);
		LocalTime b = LocalTime.of(23, 59, 22);

		System.out.println(a);
		System.out.println(b);
		System.out.println(LocalDateTime.of(a, b));

		// as LocalDate is immutable, so we need to assign this to a new instance
		a = a.plusDays(4).plusMonths(1);

		System.out.println(a);

		b = b.plusMinutes(4).plusSeconds(30);

		System.out.println(b);

		System.out.println("------------Before Java 	8---------------");

		// before Java 8
		System.out.println(new Date());

		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, Calendar.JANUARY, 1);
		Date january = calendar.getTime();
		System.out.println(january);

		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.MONTH, 2);

		System.out.println(calendar.getTime());
	}

}
