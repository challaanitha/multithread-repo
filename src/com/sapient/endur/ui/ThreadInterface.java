package com.sapient.endur.ui;

public class ThreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without Synchronization

				//		StringBuilder sb= new StringBuilder("welcome");
				//		
				//		Thread t1= new Thread( ()->{
				//			int length= sb.length();
				//			for(int i=0;i<length;i++) {
				//				System.out.println( Thread.currentThread().getName() +" "+ sb.append('x'));
				//			}
				//		});
				//		
				//		
				//		Thread t2= new Thread( ()->{
				//			int length= sb.length();
				//			for(int i=0;i<length;i++) {
				//				System.out.println( Thread.currentThread().getName() +" "+ sb.append('x'));
				//			}
				//		});
				//		
				//		t1.start();
				//		t2.start();


				//With synchronization	

				StringBuilder sb= new StringBuilder("welcome");

				Thread t1= new Thread( ()->{
					int length= sb.length();
					synchronized(sb) {
						for(int i=0;i<length;i++) {
							System.out.println( Thread.currentThread().getName() +" "+ sb.append('x'));
						}
					}
				});


				Thread t2= new Thread( ()->{
					int length= sb.length();
					synchronized(sb) {
						for(int i=0;i<length;i++) {
							System.out.println( Thread.currentThread().getName() +" "+ sb.append('x'));
						}
					}
				});

				t1.start();
				t2.start();


	}

}
