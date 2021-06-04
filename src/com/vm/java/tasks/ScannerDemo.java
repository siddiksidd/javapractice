package com.vm.java.tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		try {

		Scanner sc = new Scanner(System.in);

		File f = new File("D:/siddik/sidd.txt");
		FileWriter fr = new FileWriter(f);

		BufferedWriter br = new BufferedWriter(fr);
		br.write("ID\t\tName\t\tAge");

		System.out.print("Number of persons: ");
		int n = 0;
		sc.nextInt();
		
		while(n-->0) {

		System.out.print("Enter ID: ");
		String id = null;
		sc.next();

		System.out.print("Enter Name: ");
		String name = null;
		sc.next();

		System.out.print("Enter Age: ");
		String age;
		sc.next();

		br.newLine();
		//br.write(id+"\t\t"+name+"\t\t"+age);

		}

		br.flush();

		br.close();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("something went wrong");
	}
}
}