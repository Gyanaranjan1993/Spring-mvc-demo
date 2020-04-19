package com.gyana.datetime.basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParseDemo {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("03 29 2020", formatter);
		LocalTime time = LocalTime.parse("13:28");

		System.out.println(date);
		System.out.println(time);

		String text = date.format(formatter);
		System.out.println(text);

		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate);

	}

}
