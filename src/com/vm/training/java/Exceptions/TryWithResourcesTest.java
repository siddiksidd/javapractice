package com.vm.training.java.Exceptions;
import java.io.*;

import java.io.FileOutputStream;


public class TryWithResourcesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream(new File("D:/siddik.txt"))){//Connection con=DriverManager.getConnection("url","un","pwd")){
			String s="Valu Momentum";
			byte[] by=s.getBytes();
			fos.write(by);
			System.out.println("success");
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e1) {
			e1.printStackTrace();
	} 
	}
}
