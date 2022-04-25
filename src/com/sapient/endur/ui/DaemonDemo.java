package com.sapient.endur.ui;

public class DaemonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(  ()->{
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("End of "+ Thread.currentThread().getName());
		}, "worker-1");

	
		Thread t2= new Thread(  ()->{
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("End of "+ Thread.currentThread().getName());
		}, "worker-2");
		
		//converting worker threads to daemon threads
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		
		t1.start();
		t2.start();
		
		
		
		System.out.println("End of main thread");
	}
	
	

}







	


