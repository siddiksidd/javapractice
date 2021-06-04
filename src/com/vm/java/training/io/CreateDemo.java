package com.vm.java.training.io;
import java.io.File;
import java.io.IOException;
public class CreateDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("siddik.txt");
		File f2=new File("D:\\siddik");
		if(f2.exists())
			System.out.println("file is present");
		else{
			System.out.println("file is not present");
			f2.createNewFile();
			System.out.println("file created");
		}
	}
}
