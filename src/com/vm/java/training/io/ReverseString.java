package com.vm.java.training.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseString

{

	public static void main(String[] args) throws IOException

	{

		FileReader fr = new FileReader("reverse_input.txt");

		FileWriter fw = new FileWriter("reverse_output.txt");

		BufferedReader sidd = new BufferedReader(fr);

		String data;

		String reverse;

		while ((data = sidd.readLine()) != null)

			System.out.println(data);

	}

}