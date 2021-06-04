package com.vm.java.training.serialization;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
public static void main(String[] args) throws IOException {
	Employee emp=new Employee(1,"john");
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	oos.writeObject(emp);
	
	System.out.println("serialization done");
}
}
