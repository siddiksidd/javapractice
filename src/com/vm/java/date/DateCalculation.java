package com.vm.java.date;

import java.time.LocalDate;

public class DateCalculation {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("today:"+today);
		System.out.println("nextday: "+today.plusDays(1));
		System.out.println("after two weeks:"+today.plusWeeks(2));
		System.out.println("next month:"+today.plusMonths(1));
		System.out.println("next year:"+today.plusYears(1));
		
		LocalDate bookingDate=LocalDate.of(2021, 05, 27);
		if(bookingDate.isAfter(today)) 
			System.out.println("correct date u can book");
		else
			System.out.println("invalid date booking cannot be previous");
	}

}
