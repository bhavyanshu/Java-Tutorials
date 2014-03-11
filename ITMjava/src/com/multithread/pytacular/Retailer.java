package com.multithread.pytacular;

/**
 * @author Bhavyanshu Parasher
 *
 */



public class Retailer implements Runnable { //We first implement the Runnable interface for creating thread
	

	private int products_to_sell;
	private int time_to_sell;

	public Retailer(int products_to_sell,int time_to_sell) { //We have created a constructor here for Retailer class
		this.products_to_sell = products_to_sell;
		this.time_to_sell = time_to_sell;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			sell(products_to_sell,time_to_sell);
		}
	}
	
	public synchronized void sell(int stock_value,int selling_time) { //We create a synchronized method to sell products
		try {
			System.out.println("Stock Value: "+ stock_value);
			stock_value = 0;
			Thread.sleep(selling_time);
			System.out.println("Done Selling - Status: Out of Stock, Now calling production thread");
			while(stock_value==0){
				wait(2000);	
				System.out.println("Fetched more items to sell.");
			}
			notifyAll();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}