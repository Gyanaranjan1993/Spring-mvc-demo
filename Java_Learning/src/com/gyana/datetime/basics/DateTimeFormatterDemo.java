package com.gyana.datetime.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * Type of DateTimeFormatters 
 * 
 * BASIC_ISO_DATE -> ISO local date -> '20200517'
 * ISO_OFFSET_DATE -> ISO date with offset - '2020-05-17+01:00'
 * ISO_DATE -> ISO date with or without offset - '2020-05-17' OR '2020-05-17+1:00'
 * 
 * 
 * ISO_TIME -> ISO Time with or without offset
 * ISO_LOCAL_TIME -> ISO Time without offset - '17:00:00'
 * ISO_OFFSET_TIME -> ISO time with offset
 * ISO_LOCAL_DATE_TIME -> ISO datetime without offset.
 * ISO_OFFSET_DATE_TIME -> ISO datetime with offset
 * ISO_ZONED_DATE_TIME -> Zoned date time
 * ISO_DATE_TIME -> Date time with zoneId
 *  
 *  */

public class DateTimeFormatterDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2020, 3, 29);
		LocalTime time = LocalTime.of(11, 01);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter formatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter formatter4 = DateTimeFormatter.ISO_OFFSET_DATE;
		DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter formatter6 = DateTimeFormatter.ISO_TIME;
		DateTimeFormatter formatter7 = DateTimeFormatter.ISO_LOCAL_TIME;

		/*
		 * DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
		 * DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
		 * DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
		 * DateTimeFormatter formatter3 = DateTimeFormatter.BASIC_ISO_DATE;
		 */

		DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("M DD YYYY, hh:mm");

		System.out.println("ISO_LOCAL_DATE_TIME:" + dateTime.format(formatter));
		System.out.println("ISO_LOCAL_DATE:" + dateTime.format(formatter1));
		System.out.println("BASIC_ISO_DATE:" + dateTime.format(formatter3));
		System.out.println("ISO_DATE:" + dateTime.format(formatter5));
		// System.out.println("ISO_OFFSET_DATE" + dateTime.format(formatter4));
		System.out.println("ISO_TIME" + dateTime.format(formatter6));
		System.out.println("ISO_LOCAL_TIME" + dateTime.format(formatter7));

		System.out.println(dateTime.format(shortFormatter));
		System.out.println(dateTime.format(mediumFormatter));
		System.out.println(dateTime.format(formatter2));

	}

}
