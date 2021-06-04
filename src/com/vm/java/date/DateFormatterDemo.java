package com.vm.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {
	public static void main(String[] args) {
		//System.out.println(LocalDate.now());
		LocalDate today=LocalDate.now();
		System.out.println("today:"+today);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		DateTimeFormatter dtfull=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtfull2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtfull3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtfull4=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String afterFormat=today.format(dtf);
		System.out.println("AfterFormat: "+afterFormat);
		
		String fullDate=today.format(dtfull);
		System.out.println("Full Date: "+fullDate);
		
		String longDate=today.format(dtfull2);
		System.out.println("Long Date: "+longDate);
		
		String mDate=today.format(dtfull3);
		System.out.println("medium Date: "+mDate);
		
		String sDate=today.format(dtfull4);
		System.out.println("short Date"+sDate);
		
}
}

