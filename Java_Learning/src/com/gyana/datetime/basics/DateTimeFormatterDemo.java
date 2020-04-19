package com.gyana.datetime.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2020, 3, 29);
		LocalTime time = LocalTime.of(11, 01);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter formatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("M DD YYYY, hh:mm");

		System.out.println(dateTime.format(formatter));
		System.out.println(dateTime.format(formatter1));
		System.out.println(dateTime.format(shortFormatter));
		System.out.println(dateTime.format(mediumFormatter));
		System.out.println(dateTime.format(formatter2));

	}

}
