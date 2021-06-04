package com.vm.java.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("siddik.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("hello welcome");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.write("thanks");
		
		bw.flush();
		bw.close();
		
	}

}
