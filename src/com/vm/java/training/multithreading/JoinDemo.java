package com.vm.java.training.multithreading;
class ProjectCall extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
class WorkingOnProject extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
class Presentation extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProjectCall pc=new ProjectCall();
		WorkingOnProject wop=new WorkingOnProject();
		Presentation ps=new Presentation();
		
		pc.setName("project disscusion call ");
		wop.setName("working on Project");
		ps.setName("Project Presentation");
		
		pc.start();
		pc.join();
		
		wop.start();
		ps.start();
	}

}
