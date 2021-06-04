package com.vm.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {
	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		System.out.println("date:"+todayDate);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("date and time:"+dateTime);
		System.out.println("day of the month:"+dateTime.getDayOfYear());
		System.out.println("month of the day:"+dateTime.getDayOfMonth());
		System.out.println("week of the day:"+dateTime.getDayOfWeek());
	}
}
