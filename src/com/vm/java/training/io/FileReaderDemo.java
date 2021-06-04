package com.vm.java.training.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("siddik.txt");
		FileReader fr=new FileReader(f);
		
		int readChar=fr.read();
		while(readChar!=-1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println((char)fr.read());
			readChar=fr.read();// to read next character
			
		}
	/*	System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		*/
		
	}

}
