package com.vm.java.training.io;

import java.io.File;

public class FolderCreate {
	public static void main(String[] args) {
		File f=new File("movies");
		f.mkdir();
		System.out.println(f.exists());
		
	}
}
