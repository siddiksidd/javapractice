package com.vm.training.java.Exceptions;
class Training{
	void train() throws Exception{
		System.out.println(" no knowledge in .net");
	}
	void trainAllSubjects() throws Exception{
		specificTraining();
		System.out.println("can train all the courses");
	}
	void specificTraining() throws Exception{
		train();
		System.out.println("can train java and python");
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws Exception {
		Training training=new Training();
		training.train();
	}
}