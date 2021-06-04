package com.vm.java.training.io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("siddik.txt");
		FileWriter fw=new FileWriter(f);
		
		fw.write("a");
		fw.write("hello");
		fw.write(98);
		
		fw.flush();
		fw.close();
		System.out.println("data written");
	}

}
