package com.vm.java.training.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();
		System.out.println("done");
	}

}
