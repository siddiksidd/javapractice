package com.vm.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startDate="2021-05-25";
		LocalDate ld=LocalDate.parse(startDate);
		System.out.println(ld);
		String BookingDate="2021/May/25";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 
		System.out.println("after formating:"+dtf);
		
	}

}
