package controller;

public class ThreadId extends Thread{
//	private Thread x;
	
//	public ThreadId(Thread x) {
//		this.x = x;
//	}
	
	@Override
	public void run() {
		int f = (int)getId();
		System.out.println("TID = "+f);
	}
}
